FROM alpine:3.16

RUN apk add openjdk11

COPY target/microservice_from_zero-0.0.1-SNAPSHOT.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]