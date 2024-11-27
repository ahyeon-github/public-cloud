# 1. Base image
FROM openjdk:17-jdk-slim

# 2. Add a volume to hold logs
VOLUME /tmp

# 3. Copy application JAR
ARG JAR_FILE=build/libs/Public-Cloud-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# 4. Expose port
EXPOSE 8080

# 5. Run the application
ENTRYPOINT ["java", "-jar", "/app.jar"]