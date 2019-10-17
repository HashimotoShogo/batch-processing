# docker-composeによるローカルDB作成方法

Docker-composeを利用し、開発環境のテスト時に利用するローカルDBの作成を行う。

ここでは橋本が作成した、人のフルネーム・住所を取得するサンプルバッチの接続先として利用

## docker-composeを実行するために必要なファイルの構成

```bash

batch-processing
 |-docker-compose.yml
 |-local-mysql
        |-db
        　 |-init.sql

```

* docker-compose:DB立ち上げるための設定を記載
* init.sql:DBを立ち上げた際に予め挿入するSQLを記載
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

sudo -E docker-compose ps -a #Statusの項目が up の場合稼働中 Exit の場合停止中

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
 