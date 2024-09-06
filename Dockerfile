FROM gradle:jdk17 as builder

COPY --chown=gradle:gradle . ./gradle/src
WORKDIR ./gradle/src
RUN gradle build

FROM openjdk:17
COPY target/*.jar app-devops.jar
EXPOSE 80 
LABEL authors="aguignard2024"

CMD ["java", "-jar", "app-devops.jar", "--server.port=80"]
