FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
COPY target/*.jar api-0.0.1-SNAPSHOT.jar
CMD java ${JAVA_OPTS} -jar api-0.0.1-SNAPSHOT.jar
