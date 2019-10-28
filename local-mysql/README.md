# docker-composeによるローカルDB作成方法

ローカル環境テスト時に利用する、ローカル環境DBの作成をDockerに任せる

## docker-composeを実行するために必要なファイルの構成

```bash
batch-processing
 |-docker-compose.yml
 |-local-mysql
        |-db
        　 |-init.sql

```


## docker-composeの実行

* docker-composeの起動

```bash
cd docker-composeがあるディレクトリ

export MYSQL_ROOT_PASSWORD=root

sudo -E docker-compose up -d  #docker-composeの起動  橋本環境では　"sudo -E"　で　環境変数を引き継ぐ必要あり

sudo -E docker exec -it batch-processing_mysql_1 bash #起動したコンテナに接続
```

* dockerのステータス確認

```bash
sudo -E docker-compose ps -a
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
 