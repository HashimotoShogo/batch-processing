package com.example.batchprocessing.repository;


import com.example.batchprocessing.SettingInfo;
import com.example.batchprocessing.person.Person;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.google.common.collect.Lists;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static jooq.human.tables.Address1.ADDRESS1;
import static jooq.human.tables.People.PEOPLE;

@Repository
@Transactional(readOnly = true)
public class PersonRepository {

    @Autowired
    private SettingInfo settingInfo;

//    String url = "jdbc:mysql://127.0.0.1:3306/human"; //動作確認のためにここに記入settingInfo.getUrl();
//
//    String username = "root"; //settingInfo.getUserName();
//
//    String password = "root";//settingInfo.getPassword();


    public void showSetting() {
        System.out.println(settingInfo.getUrl() + ":URL-----");
        System.out.println(settingInfo.getUserName() + ":Username============");
        System.out.println(settingInfo.getPassword() + ":password-----------------");
    }

    public List<Integer> takePersonIds() {
        Builder<Integer> builder = ImmutableList.builder();
        List<Integer> list = getPersonIds();
        List<List<Integer>> bulks = Lists.partition(list, 2);

        System.out.println("------------------start show Ids------------------");
        bulks.forEach(b -> System.out.println(b));
        System.out.println("------------------finish show Ids------------------");

        bulks.forEach(b -> builder.addAll(getPersonIds(b)));

        System.out.println("------------------start show built IdList------------------");
        List<Integer> temp = builder.build();
        temp.forEach(t -> System.out.println(t));
        System.out.println("------------------finish show built IdsList------------------");

        return builder.build();
    }


    public List<Integer> getPersonIds() {
        List<Integer> idList = new ArrayList<>();

        try (Connection con = DriverManager.getConnection(settingInfo.getUrl(), settingInfo.getUserName(), settingInfo.getPassword())) {

            DSLContext dslContext = DSL.using(con, SQLDialect.MYSQL_5_7);

            Result<Record1<Long>> result = dslContext
                    .select(PEOPLE.PERSON_ID)
                    .from(PEOPLE)
                    .fetch();

            result.forEach(r -> idList.add(new Integer(r.get(PEOPLE.PERSON_ID).toString())));
        } catch (SQLException e) {
            System.out.println("getPersonIds() SQLException");
            e.printStackTrace();
        }

        return idList;

    }


    public List<Integer> getPersonIds(List<Integer> ids) {
        List<Integer> idList = new ArrayList<>();

        try (Connection con = DriverManager.getConnection(settingInfo.getUrl(), settingInfo.getUserName(), settingInfo.getPassword())) {

            DSLContext dslContext = DSL.using(con, SQLDialect.MYSQL_5_7);

            Result<Record1<Long>> result = dslContext
                    .select(PEOPLE.PERSON_ID)
                    .from(PEOPLE)
                    .where(PEOPLE.PERSON_ID.in(ids))
                    .fetch();

            result.forEach(r -> idList.add(new Integer(r.get(PEOPLE.PERSON_ID).toString())));
        } catch (SQLException e) {
            System.out.println("getPersonIds(args) SQLException!!");
            e.printStackTrace();
        }
        System.out.println("===========================Start display ids===========================");
        idList.forEach(i -> System.out.println("id:" + i));
        System.out.println("===========================finish display ids===========================");
        return idList;

    }


    public List<Person> getAllPersonInfo() throws SQLException { //SQLメモ書き　select first_name,last_name,address1 from people inner join address1 on people.person_id = address1.people_id;
        List<Person> list = new ArrayList<>();

        try (Connection con = DriverManager.getConnection(settingInfo.getUrl(), settingInfo.getUserName(), settingInfo.getPassword())) {

            DSLContext dslContext = DSL.using(con, SQLDialect.MYSQL_5_7);

            Result<Record4<Long, String, String, String>> result = dslContext
                    .select(PEOPLE.PERSON_ID, PEOPLE.FIRST_NAME, PEOPLE.LAST_NAME, ADDRESS1.ADDRESS1_)
                    .from(PEOPLE)
                    .join(ADDRESS1)
                    .on(PEOPLE.PERSON_ID.eq(ADDRESS1.PEOPLE_ID))
                    .fetch();

            result.forEach(record -> list.add(
                    new Person(
                            record.get(PEOPLE.PERSON_ID),
                            record.getValue(PEOPLE.FIRST_NAME),
                            record.getValue(PEOPLE.LAST_NAME),
                            record.getValue(ADDRESS1.ADDRESS1_)
                    ))
            );
            return list;
        }
    }


    public List<String> takeAddress(List<Integer> ids) {
        Builder<String> builder = ImmutableList.builder();
        List<List<Integer>> bulks = Lists.partition(ids, 2);
        bulks.forEach(b -> builder.addAll(getAddress(b)));

        System.out.println("===========================Start display Address===========================");
        List<String> tempAddress = builder.build();
        tempAddress.forEach(t -> System.out.println("address:" + t));
        System.out.println("===========================finish display Address===========================");

        return builder.build();
    }


    public List<String> getAddress(List<Integer> ids) {
        List<String> address = new ArrayList<>();

        try (Connection con = DriverManager.getConnection(settingInfo.getUrl(), settingInfo.getUserName(), settingInfo.getPassword())) {
            DSLContext dslContext = DSL.using(con, SQLDialect.MYSQL_5_7);

            Result result = dslContext
                    .select(ADDRESS1.ADDRESS1_)
                    .from(ADDRESS1)
                    .where(ADDRESS1.PEOPLE_ID.in(ids))
                    .fetch();

            result.forEach(r -> address.add(r.toString()));

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return address;

    }


}
