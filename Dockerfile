# 1. Base image
FROM openjdk:17-jdk-slim

# 2. Add a volume to hold logs
VOLUME /tmp

# 3. Copy application JAR
ARG JAR_FILE=build/libs/Public-Cloud-0.0.1-SNAPSHOT-plain.jar
COPY ${JAR_FILE} app.jar

# 4. Expose port
EXPOSE 8080

# 5. Run the applicationdocker images
ENTRYPOINT ["java", "-jar", "/app.jar"]