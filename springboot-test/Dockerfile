FROM openjdk:latest

RUN mkdir /etc/app/

COPY build/libs/springboot-test-0.0.1-SNAPSHOT.jar /etc/app/api.jar

EXPOSE 8080

ENTRYPOINT java -jar /etc/app/api.jar