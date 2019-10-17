# docker-composeによるローカルDB作成方法

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

## docker-composeを実行するために必要なファイルの構成
```bash
batch-processing
 |-docker-compose.yml
 |-initdb
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

sudo -E docker-compose up -d  #docker-composeの起動  橋本環境では "sudo -E" で環境変数を引き継ぐ必要あり dockerグループにユーザーを追加することでsudo回避可能

sudo -E docker exec -it batch-processing_mysql_1 bash #起動したコンテナに接続
```

* dockerのステータス確認
```bash
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
 
