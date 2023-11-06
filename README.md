https://www.baeldung.com/spring-boot-logging

commit 01: gradle build; default INFO
commit 02: gradle to maven; java -jar target/logging-demo-0.0.1-SNAPSHOT.jar --trace; default INFO
logging with fine-grained control using env variables to 
VM options: -Dlogging.level.org.springframework=TRACE -Dlogging.level.com.example=TRACE
e.g: C:\Users\Bhaskar\......\Java\zulu17-fx\bin\java.exe -Dvisualvm.id=412196483567100 -Dlogging.level.org.springframework=ERROR -Dlogging.level.com.example=TRACE -XX:TieredStopAtLevel=1 -Dspring.output.ansi.enabled=always -Dcom.sun.management.jmxremote -Dspring.jmx.enabled=true -Dspring.liveBeansView.mbeanDomain -Dspring.application.admin.enabled=true "-Dmanagement.endpoints.jmx.exposure.include=*" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1\lib\idea_rt.jar=11519:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Bhaskar\Downloads\....\logging-demo\target\classes;C:\Users\Bhaskar\.m2\repository\org\springframework\boot\spring-boot-starter-web\3.1.5\spring-boot-starter-web-3.1.5.jar;C:\Users\Bhaskar\.m2\repository\org\springframework\boot\spring-boot-starter\3.1.5\spring-boot-starter-3.1.5.jar;C:\Users\Bhaskar\.m2\repository\org\springframework\boot\spring-boot\3.1.5\spring-boot-3.1.5.jar;C:\Users\Bhaskar\.m2\repository\org\springframework\boot\spring-boot-autoconfigure\3.1.5\spring-boot-autoconfigure-3.1.5.jar;C:\Users\Bhaskar\.m2\repository\org\springframework\boot\spring-boot-starter-logging\3.1.5\spring-boot-starter-logging-3.1.5.jar;C:\Users\Bhaskar\.m2\repository\ch\qos\logback\logback-classic\1.4.11\logback-classic-1.4.11.jar;C:\Users\Bhaskar\.m2\repository\ch\qos\logback\logback-core\1.4.11\logback-core-1.4.11.jar;C:\Users\Bhaskar\.m2\repository\org\apache\logging\log4j\log4j-to-slf4j\2.20.0\log4j-to-slf4j-2.20.0.jar;C:\Users\Bhaskar\.m2\repository\org\apache\logging\log4j\log4j-api\2.20.0\log4j-api-2.20.0.jar;C:\Users\Bhaskar\.m2\repository\org\slf4j\jul-to-slf4j\2.0.9\jul-to-slf4j-2.0.9.jar;C:\Users\Bhaskar\.m2\repository\jakarta\annotation\jakarta.annotation-api\2.1.1\jakarta.annotation-api-2.1.1.jar;C:\Users\Bhaskar\.m2\repository\org\yaml\snakeyaml\1.33\snakeyaml-1.33.jar;C:\Users\Bhaskar\.m2\repository\org\springframework\boot\spring-boot-starter-json\3.1.5\spring-boot-starter-json-3.1.5.jar;C:\Users\Bhaskar\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.15.3\jackson-databind-2.15.3.jar;C:\Users\Bhaskar\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.15.3\jackson-annotations-2.15.3.jar;C:\Users\Bhaskar\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.15.3\jackson-core-2.15.3.jar;C:\Users\Bhaskar\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.15.3\jackson-datatype-jdk8-2.15.3.jar;C:\Users\Bhaskar\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.15.3\jackson-datatype-jsr310-2.15.3.jar;C:\Users\Bhaskar\.m2\repository\com\fasterxml\jackson\module\jackson-module-parameter-names\2.15.3\jackson-module-parameter-names-2.15.3.jar;C:\Users\Bhaskar\.m2\repository\org\springframework\boot\spring-boot-starter-tomcat\3.1.5\spring-boot-starter-tomcat-3.1.5.jar;C:\Users\Bhaskar\.m2\repository\org\apache\tomcat\embed\tomcat-embed-core\10.1.15\tomcat-embed-core-10.1.15.jar;C:\Users\Bhaskar\.m2\repository\org\apache\tomcat\embed\tomcat-embed-el\10.1.15\tomcat-embed-el-10.1.15.jar;C:\Users\Bhaskar\.m2\repository\org\apache\tomcat\embed\tomcat-embed-websocket\10.1.15\tomcat-embed-websocket-10.1.15.jar;C:\Users\Bhaskar\.m2\repository\org\springframework\spring-web\6.0.13\spring-web-6.0.13.jar;C:\Users\Bhaskar\.m2\repository\org\springframework\spring-beans\6.0.13\spring-beans-6.0.13.jar;C:\Users\Bhaskar\.m2\repository\io\micrometer\micrometer-observation\1.11.5\micrometer-observation-1.11.5.jar;C:\Users\Bhaskar\.m2\repository\io\micrometer\micrometer-commons\1.11.5\micrometer-commons-1.11.5.jar;C:\Users\Bhaskar\.m2\repository\org\springframework\spring-webmvc\6.0.13\spring-webmvc-6.0.13.jar;C:\Users\Bhaskar\.m2\repository\org\springframework\spring-aop\6.0.13\spring-aop-6.0.13.jar;C:\Users\Bhaskar\.m2\repository\org\springframework\spring-context\6.0.13\spring-context-6.0.13.jar;C:\Users\Bhaskar\.m2\repository\org\springframework\spring-expression\6.0.13\spring-expression-6.0.13.jar;C:\Users\Bhaskar\.m2\repository\org\slf4j\slf4j-api\2.0.9\slf4j-api-2.0.9.jar;C:\Users\Bhaskar\.m2\repository\org\springframework\spring-core\6.0.13\spring-core-6.0.13.jar;C:\Users\Bhaskar\.m2\repository\org\springframework\spring-jcl\6.0.13\spring-jcl-6.0.13.jar com.example.loggingdemo.LoggingDemoApplication
mvn cmd: mvn spring-boot:run -Dspring-boot.run.arguments="--logging.level.org.springframework=DEBUG, --logging.level.com.example=TRACE" (it works with quote and space)
or in application.properties: logging.level.root=WARN logging.level.com.example=TRACE

commit 03: added logging properties permanently in application.properties
commit 04:
./mvnw dependency:tree -Dincludes=ch.qos.logback
https://logback.qos.ch/manual/architecture.html 
default logback-spring or logback.xml file
commit 05: print logback internal status in case of no error during build
commit 06: file appender logback(along with console appender)
commit 07: logging file-name with timestamp appended