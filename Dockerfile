FROM amazoncorretto:8-alpine-jdk

COPY build/libs/amti-back-1.0.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]

EXPOSE 8080