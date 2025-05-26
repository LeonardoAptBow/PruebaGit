FROM openjdk:21-jdk-slim
ARG JAR_FILE=target/primeraApi-0.0.1-SNAPSHOT.jar app.jar
COPY ${JAR_FILE} app_primeraApi.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app_primeraApi.jar"]
