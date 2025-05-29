# Використання офіційного образу Maven для білду
FROM maven:3.9.6-eclipse-temurin-21 AS build

WORKDIR /Cinema

COPY . .

RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jdk-jammy

WORKDIR /Cinema

COPY --from=build /Cinema/target/*.jar cinema.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "cinema.jar"]