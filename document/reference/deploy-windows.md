# Windows environment build

## IDEA

- Specific reference on the installation and use of IDEA [https://github.com/judasn/IntelliJ-IDEA-Tutorial] (https://github.com/judasn/IntelliJ-IDEA-Tutorial)
- Search plugin repository, install plugin lombok

## Eclipse

- Import project, import as maven project
    ![eclipse_import_1.png](https://github.com/macrozheng/mall/blob/master/document/resource/eclipse_import_1.png)  
    ![eclipse_import_2.png](https://github.com/macrozheng/mall/blob/master/document/resource/eclipse_import_2.png)
- Install lombok plugin, download address: https://projectlombok.org/downloads/lombok.jar
- Double click after download, use java program to open
- Follow the prompts to select the installation path of eclipse.exe to install the plugin, restart Eclipse when finished
- Start project: right-click com.macro.mall.MallAdminApplication main method, select run as Java Application

## mysql

- Download address: https://dev.mysql.com/downloads/mysql/5.7.html#downloads
- After download, follow the prompts to install
- Import mall.sql file under document/sql

## redis

- Download address: https://github.com/MicrosoftArchive/redis/releases
- After download, follow the prompts to install
- Start redis: redis-server.exe redis.windows.conf

## elasticsearch

- Download address: https://www.elastic.co/downloads/past-releases/elasticsearch-6-2-2
- Download the.zip file and extract it to the specified directory
- Install kibana, for access to es in your browser, please download version 6.2.2, refer to: https://www.elastic.co/downloads/kibana
- Download.zip package can be extracted, run bin\ kibana.bat, visit http://localhost:5601 to see if the installation was successful
- Chinese Word Partition Plug-in Address: https://github.com/medcl/elasticsearch-analysis-ik
- Install the Chinese word splicer plugin and execute the following command in elasticsearch-6.2.2\ bin directory:
elasticsearch-plugin install https://github.com/medcl/elasticsearch-analysis-ik/releases/download/v6.2.2/elasticsearch-analysis-ik-6.2.2.zip
- Start elasticsearch: Run elasticsearch-6.2.2\ bin\ elasticsearch.bat
- Do not use kibana can install head plugin, for specific reference: https://github.com/mobz/elasticsearch-head
- Note: If you modify the cluster-name of es in mall-search: mall-es, you need to use the 6.2.2\ config\ elasticsearch.yml file to modify cluster.name:mall-es

## mongodb

- Download address: https://fastdl.mongodb.org/win32/mongodb-win32-x86_64-2008plus-ssl-3 .2.21-signed.msi
- Select the path (c:\mongodb\) to install, create data\ db and data\ log folders under the installation path
- Server run program: mongodb\ bin\ mongod.exe
- Client run program: mongodb\ bin\ mongo.exe
- Create profile: mongodb\ mongod.cfg
    ``` lua
    systemLog:
        destination: file
        path: c:\mongodb\data\log\mongod.log
    storage:
        dbPath: c:\mongodb\data\db
    ```
- Install as a service (requires administrator privileges to run commands)：C:\mongodb\bin\mongod.exe —config "C:\mongodb \ mongod.cfg” —install
- Start service: net start MongoDB
- Close service: net stop MongoDB
- Removal service: C:\mongodb\bin\mongod.exe —remove
- Download the client program: https://download.robomongo.org/1.2.1/windows/robo3t-1.2.1-windows-x8 6_64-3e50a65.zip
- Unzip to the specified directory, open robo3t.exe and connect to localhost: 27017

## rabbitmq

- Install Erlang: http://erlang.org/download/otp_win64_21.3.exe
- Download rabbitmq: https://dl.bintray.com/rabbitmq/all/rabbitmq-server/3.7.14/ rabbitmq-server-3.7.14.exe
- Follow the prompts to install, enter the rabbitmq installation directory: D:\RabbitMQ Server\ rabbitmq_server- 3.7.14\ sbin
- Enter cmd in the address bar and enter the following command line: rabbitmq-plugins enable rabbitmq_management
- Visit the address to see if the installation was successful: http://127.0.0.1:15672/
- Enter your account password and login: guest guest
- Create users and set their role as admin: mall mall mall
    ![rabbitmq_install_2.png](https://github.com/macrozheng/mall/blob/master/document/resource/rabbitmq_install_2.png)
- Create virtual host: /mall
    ![rabbitmq_install_3.png](https://github.com/macrozheng/mall/blob/master/document/resource/rabbitmq_install_3.png)
- Configure permissions for the mall user to scope the virtual host
    ![rabbitmq_install_4.png](https://github.com/macrozheng/mall/blob/master/document/resource/rabbitmq_install_4.png)
- Rabbitmq Install Delay Message Plugin (optional):
- Download Delay Message Plugin (rabbitmq_delayed_message_exchange): https://www.rabbitmq.com/community-plugins.html
- Copy plugins to plug-in directory: D:\RabbitMQ Server\ rabbitmq_server-3.7.14\ plugins
- Run the following command in the sbin directory to enable the plugin: rabbitmq-plugins enable rabbitmq_delayed_message_exchange
    
## OSS

- The project file upload adopts OSS, you need to register OSS account and configure
- first set the mall-admin\ src\ main\ resources\ application.properties file with aliyun.oss. to your own configuration
- OSS uploader requires configuration of cross-domain resource sharing (CORS) rules, refer to the documentation: https://help.aliyun.com/document_detail/31928.html
- Upload method is the form of direct transmission after the signature of the server, refer to the documentation: https://help.aliyun.com/document_detail/31926.html

## mall-admin

- Start project: directly run com.macro.mall.MallAdminApplication main method can be
- Interface Document Address: http://localhost:8080/swagger-ui.html

## mall-search

- Start project: directly run com.macro.mall.search.MallSearchApplication main method can be
- Interface Document Address: http://localhost:8081/swagger-ui.html
- You need to call the interface to import data before use; http://localhost:8081/esProduct/importAll
- If the problem does not start, you can delete the data inside elasticsearch before starting

## mall-portal

- Launch mall-portal project: directly run com.macro.mall.portal.MallPortalApplication main method to
- Interface Document Address: http://localhost:8085/swagger-ui.html
