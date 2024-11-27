# Dockerfile 수정
FROM openjdk:17-jdk-slim

VOLUME /tmp

# 실행 가능한 JAR 파일을 지정
ARG JAR_FILE=build/libs/Public-Cloud-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar"]