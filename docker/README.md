# docker-composeによるローカルDB作成方法

docker-composeを利用し、開発環境のテスト時に利用するローカルDBの作成を行う。

本READMEはUbuntu環境のもの

## ローカルDBを立ち上げるまでに必要なこと

* docker のインストール
* docker-compose のインストール
* docker-compose で利用する DB のイメージをダウンロード
* docker-compose に DB を立ち上げるための設定を記載
* init.sql に DB を立ち上げた際に予め挿入する SQL を記載

### docker engine のインストール
```bash
$ sudo apt-get install docker-ce docker-ce-cli containerd.io
```

### docker-compose のインストール
```bash
$ sudo curl -L \

"https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" \ 

-o /usr/local/bin/docker-compose
```

### イメージのダウンロード
```bash
#mysql 5.7 のイメージダウンロード例
$ sudo docker pull mysql:5.7
```

## docker-composeの実行

docker-composeの実行後、端末・プログラムからコンテナ内のDBに接続し情報を得ることが出来る。

```bash
cd docker/

$ export MYSQL_ROOT_PASSWORD=root

#docker-composeの起動  橋本環境では sudo -E で export した環境変数を引き継ぐ必要あり 
$ sudo -E docker-compose up -d 

#起動したコンテナに接続
$ sudo -E docker exec -it batch-processing_mysql_1 bash
```

### dockerのステータス確認
```bash
#Statusの項目が up の場合稼働中 Exit の場合停止中
$ sudo -E docker-compose ps -a 
```     

### ターミナルからコンテナ内のMYSQLサーバに接続
```bash
#コンテナ外からコンテナ内のmysqlに接続
$ mysql -h 127.0.0.1 -u root -p  -P 3306 

#接続に成功すると以下のようなメッセージが表示される
Welcome to the MySQL monitor.　 Commands end with ; or \g.
```

### docker-composeの停止
```bash
$ sudo -E docker-compose down
```

### sudo について
dockerグループにユーザーを追加することで sudo の回避可能

## 参考にしたページ

docker のインストール

* https://docs.docker.com/install/linux/docker-ce/ubuntu/

docker-compose のインストール

* https://docs.docker.com/compose/install/

Dockerfile を利用した docker-compose 起動までの手順

* https://mmtomitomimm.blogspot.com/2018/04/docker-mysqldb.html

sudo -E について

* https://forums.docker.com/t/docker-compose-not-seeing-environment-variables-on-the-host/11837/7 

sudo 時の環境変数について

* https://kawairi.jp/weblog/vita/2016040820298
 
