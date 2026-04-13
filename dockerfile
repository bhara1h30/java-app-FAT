FROM openjdk:8-jre-slim
# The filename must match the Maven output exactly
COPY target/simple-maven-app-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
