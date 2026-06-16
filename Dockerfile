FROM eclipse-temurin:11-jre-alpine
WORKDIR /app
COPY target/gir-app-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
