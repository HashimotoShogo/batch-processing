package com.example.batchprocessing;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

    @Autowired
    public JobBuilderFactory jobBuilderFactory; //jobの順番を決めるためのオブジェクト

    @Autowired
    public StepBuilderFactory stepBuilderFactory; //jobのステップを決定するためオブジェクト

    @Bean
    public FlatFileItemReader<Person> reader() { //ファイルの読み込みを行うメソッド
        return new FlatFileItemReaderBuilder<Person>().
                name("personItemReader").resource(new ClassPathResource("sample-data.csv")).delimited().
                names(new String[]{"firstName", "lastName"}).
                fieldSetMapper(new BeanWrapperFieldSetMapper<Person>() {{
                    setTargetType(Person.class);}}).build();
    }

    @Bean
    public PersonItemProcessor processor() {
    return new PersonItemProcessor();
    }

    @Bean
    public JdbcBatchItemWriter<Person> writer(DataSource dataSource){ //DBへ書き込むためのメソッド？
        return new JdbcBatchItemWriterBuilder<Person>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql("insert into people (first_name, last_name) VALUES (:firstName, :lastName)")
                .dataSource(dataSource).build();
    }

    @Bean
    public Job importUserJob(Step step1,JobCompletionNotificationListener listner){ //jobの作成を行うメソッド
        return jobBuilderFactory.get("importUserJob")
                .incrementer(new RunIdIncrementer()).listener(listner)
                .flow(step1)
                .end()
                .build();
    }

    @Bean
    public Step step1(JdbcBatchItemWriter<Person> writer){ //stepを決めるためのメソッド
        return stepBuilderFactory.get("step1")
                .<Person, Person> chunk(10)
                .reader(reader())
                .processor(processor())
                .writer(writer)
                .build();
    }
}