FROM azul/zulu-openjdk:17-latest

COPY build/libs/amti-back-1.0.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]