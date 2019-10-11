FROM mysql:5.7.27

RUN touch ./mysqld.log

ADD ./my.cnf /etc/mysql/conf.d/my.cnf

CMD ["mysqld"]
