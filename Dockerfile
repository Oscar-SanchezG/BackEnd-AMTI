FROM eclipse-temurin:17-jdk-alpine

COPY build/libs/amti-back-1.0.jar app.jar

VOLUME /tmp

ENTRYPOINT ["java", "-jar", "/app.jar"]

EXPOSE 8080