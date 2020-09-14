# Test

Run with

```shell script
mvn install
```

and

```shell script
java -Dotel.exporter=logging\
     -Dio.opentelemetry.javaagent.slf4j.simpleLogger.defaultLogLevel=debug\
     -javaagent:/opt/opentelemetry-javaagent-all.jar\
     -jar target/test-desktop-app-1.0-SNAPSHOT.jar
```
