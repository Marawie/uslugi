FROM openjdk:21-jdk-slim
WORKDIR /app
COPY target/uslugi-0.0.1-SNAPSHOT.jar /app/uslugi.jar
ENTRYPOINT ["java", "-jar", "/app/uslugi.jar"]