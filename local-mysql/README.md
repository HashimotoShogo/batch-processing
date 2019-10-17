# docker-composeによるローカルDB作成方法

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
ローカル環境テスト時に利用する、ローカル環境DBの作成をDockerに任せる
=======
テストで利用するローカルDBの作成をDocker-composeで作成する。
=======
テストで利用するローカルDBをDocker-composeで作成する。
>>>>>>> 文章の修正
=======
docker-composeを利用してローカル環境のDBを作成する。
>>>>>>> ファイルの説明文を追加しました。

作成されたDBを開発後のテストで利用する。

<<<<<<< HEAD
>>>>>>> 文章の追加といくつかの修正を行いました。
=======
init.sqlに書かれている内容を変更することでdocker-compose立ち上げ時に挿入されるデータを編集することが出来る。
>>>>>>> ファイルの説明文を追加しました。

## docker-composeを実行するために必要なファイルの構成

```bash

batch-processing
 |-docker-compose.yml
 |-local-mysql
        |-db
        　 |-init.sql


```

* docker-compose :DB立ち上げるための設定を記載
* init.sql:DBを立ち上げた際に挿入するSQLを記載
* デイレクトリ名は任意


## docker-composeの実行

docker-composeの実行後、端末・プログラムからコンテナ内のDBに接続し情報を得ることが出来る。


* docker-composeの起動


```bash
cd docker-composeがあるディレクトリ

export MYSQL_ROOT_PASSWORD=root

sudo -E docker-compose up -d  #docker-composeの起動  橋本環境では "sudo -E" で環境変数を引き継ぐ必要あり

sudo -E docker exec -it batch-processing_mysql_1 bash #起動したコンテナに接続
```

* dockerのステータス確認

```bash
<<<<<<< HEAD
sudo -E docker-compose ps -a
=======

sudo -E docker-compose ps -a #Statusの項目が up の場合稼働中 Exit の場合停止中

>>>>>>> 文章の追加といくつかの修正を行いました。
```

* ターミナルからコンテナ内のMYSQLサーバに接続

```bash
mysql -h 127.0.0.1 -u root -p  -P 3306 --protocol=tcp #コンテナ外からコンテナ内のmysqlに接続

#接続に成功すると以下のようなメッセージが表示される
 Welcome to the MySQL monitor.　 Commands end with ; or \g.
```


* docker-composeの停止

```bash
sudo -E docker-compose down
```


## 参考にしたページ

* https://mmtomitomimm.blogspot.com/2018/04/docker-mysqldb.html

* https://forums.docker.com/t/docker-compose-not-seeing-environment-variables-on-the-host/11837/7 


* https://kawairi.jp/weblog/vita/2016040820298 (sudo 時の環境変数について)
 