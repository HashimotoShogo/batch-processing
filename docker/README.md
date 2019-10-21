# docker-composeによるローカルDB作成方法

<<<<<<< HEAD
<<<<<<< HEAD
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

ここでは、作成されたDBを橋本が作成したサンプルバッチの接続先として利用する。

<<<<<<< HEAD
>>>>>>> 文章の追加といくつかの修正を行いました。
=======
init.sqlに書かれている内容を変更することでdocker-compose立ち上げ時に挿入されるデータを編集することが出来る。
>>>>>>> ファイルの説明文を追加しました。
=======
Docker-composeを利用し、開発環境のテスト時に利用するローカルDBの作成を行う。

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
ここでは橋本が作成した、人のフルネーム・住所を取得するサンプルバッチの接続先としてdocker-composeを利用
>>>>>>> 使用用途を追加しました。
=======
ここでは橋本が作成した、人のフルネーム・住所を取得するサンプルバッチの接続先として利用
>>>>>>> サンプルバッチで利用するという旨を追加しました。
=======
>>>>>>> 少し修正を行いました。

=======
>>>>>>> bash部分の改行を削除しました。
## docker-composeを実行するために必要なファイルの構成
=======
>>>>>>> 行間隔の調整を行いました。##の上は2行　*の上は1行にしています。
=======
docker-composeを利用し、開発環境のテスト時に利用するローカルDBの作成を行う。

本READMEはUbuntu環境のもの
>>>>>>> ディレクトリの違うものをコミットしてしまったので再度アップロード

## 事前準備

* docker engine のインストール
```bash
$ sudo apt-get install docker-ce docker-ce-cli containerd.io
```

* docker-compose のインストール
```bash
$ sudo curl -L \
"https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" \ 
-o /usr/local/bin/docker-compose
```

* docker-compose.yml に設定を記載

例：https://github.com/HashimotoShogo/batch-processing/blob/docker-compose/docker/docker-compose.yml

* init.sql にSQLを記載

例：https://github.com/HashimotoShogo/batch-processing/blob/docker-compose/docker/initDB/init.sql

## docker-composeの実行

docker-composeの実行後、端末・プログラムからコンテナ内のDBに接続し情報を得ることが出来る。

```bash
cd docker/

$ export MYSQL_ROOT_PASSWORD=root

#docker-composeの起動  橋本環境では sudo -E で export した環境変数を引き継ぐ必要あり 
$ sudo -E docker-compose up -d 

#起動したコンテナに接続
$ sudo -E docker exec -it docker_mysql_1 bash
```

### dockerのステータス確認
```bash
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
sudo -E docker-compose ps -a
=======

sudo -E docker-compose ps -a #Statusの項目が up の場合稼働中 Exit の場合停止中

>>>>>>> 文章の追加といくつかの修正を行いました。
=======
sudo -E docker-compose ps -a #Statusの項目が up の場合稼働中 Exit の場合停止中
>>>>>>> bash部分の改行を削除しました。
```
=======
#Statusの項目が up の場合稼働中 Exit の場合停止中
$ sudo docker-compose ps
```     
>>>>>>> ディレクトリの違うものをコミットしてしまったので再度アップロード

### ターミナルからコンテナ内のMYSQLサーバに接続
```bash
#コンテナ外からコンテナ内のmysqlに接続
$ mysql -h 127.0.0.1 -u root -p  -P 3306 

#接続に成功すると以下のようなメッセージが表示される
Welcome to the MySQL monitor.　 Commands end with ; or \g.
```

### docker-composeの停止
```bash
$ sudo docker-compose down
```

### sudo について
* dockerグループにユーザーを追加することで sudo の回避可能

https://qiita.com/tifa2chan/items/9dc28a56efcfb50c7fbe


## 参考にしたページ

* docker のインストール

https://docs.docker.com/install/linux/docker-ce/ubuntu/

* docker-compose のインストール

https://docs.docker.com/compose/install/

* Dockerfile を利用した docker-compose 起動までの手順

https://mmtomitomimm.blogspot.com/2018/04/docker-mysqldb.html

* sudo -E について

https://forums.docker.com/t/docker-compose-not-seeing-environment-variables-on-the-host/11837/7 

* sudo 時の環境変数について

https://kawairi.jp/weblog/vita/2016040820298
 