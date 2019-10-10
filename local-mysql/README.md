# docker-composeによるローカルDB作成方法
ローカルDBを作成する手段の１つ

## docker-composeを実行するために必要なファイルの構成

```bash
batch-processing
 |-docker-compose.yml
 |-local-mysql
    　　|-Dockerfile 
        |-my.cnf
        |-db
        　 |-init.sql

```




## docker-compose.ymlの作成

* 任意のディレクトリにdocker-compose.ymlを作成

```bash
touch docker-compose.yml
```



* ymlファイル作成後

下記をymlファイルに記載

```bash
version: '3'
services:
 mysql:
   build: ./local-mysql/　#dockerfileがこのディレクトリ内にあることを教える。
   volumes:
     - ./local-mysql/db:/docker-entrypoint-initdb.d　#DB作成時に流し込むSQLのディレクトリを教える。
   environment:
     - MYSQL_ROOT_PASSWORD=root　#環境変数の指定
```




## Dockerfileの作成



* Dockerfileの作成

```bash
cd local-mysql/
touch Dockerfile
```


* 下記をDockerfileに記載

```bash
FROM mysql  #使用するイメージの指定

EXPOSE 3306 #使用するポートを開放する

ADD ./my.cnf /etc/mysql/conf.d/my.cnf　#MYSQLの設定ファイルのディレクトリを教える。

CMD ["mysqld"]　#docker run に実行させるコマンドの指定
```





## my.cnfの作成

* my.cnfの作成
```bash
touch my.cnf
```


* 下記をmy.cnfに記載

```bash
[mysqld]
character-set-server=utf8

[mysql]
default-character-set=utf8

[client]
default-character-set=utf8
```




## init.sqlの作成

* ディレクトリ・.sqlの作成
```bash
mkdir db

cd db

touch init.sql
```


* init.sqlに以下を記載

```bash
create database human;
use human;

CREATE TABLE people  (
    person_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(20),
    last_name VARCHAR(20)
);

insert into people (first_name,last_name) values ('Jill','Doe'),('Joe','Doe'),('Justin','Doe'),('Jane','Doe'),('John','Doe');
```


## docker-composeの実行

* docker-composeの起動

```bash
cd docker-composeがあるディレクトリ

sudo docker-compose up -d  #docker-composeの起動

sudo docker exec -it batch-processing_mysql_1 bash #起動したコンテナに接続

```

* コンテナに接続後

```bash
mysql -u root -p
#パスワードは環境変数で指定したもの

#接続に成功すると以下のようなメッセージが表示される
 Welcome to the MySQL monitor.　 Commands end with ; or \g.
```

## 参考にしたページ

* https://mmtomitomimm.blogspot.com/2018/04/docker-mysqldb.html