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


## docker-composeの実行

* docker-composeの起動

```bash

cd docker-composeがあるディレクトリ

sudo docker-compose up -d  #docker-composeの起動

sudo docker exec -it batch-processing_mysql_1 bash #起動したコンテナに接続

```

* ターミナルからコンテナ内MYSQLサーバに接続

```bash

export MYSQL_ROOT_PASSWORD=root

mysql -h 127.0.0.1 -u root -p  -P 3306 --protocol=tcp

#接続に成功すると以下のようなメッセージが表示される
 Welcome to the MySQL monitor.　 Commands end with ; or \g.
 
```

* docker-composeの停止

```bash
sudo docker-compose down
```
## 参考にしたページ

* https://mmtomitomimm.blogspot.com/2018/04/docker-mysqldb.html