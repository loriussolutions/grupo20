FROM openjdk:8-jdk-alpine

COPY target/api-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/app.jar"]