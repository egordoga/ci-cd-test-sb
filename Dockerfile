FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/cd-ci-test-1.0-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]