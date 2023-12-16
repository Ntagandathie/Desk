#New docker file

FROM maven:3.8.5-openjdk-8 AS build

WORKDIR /travelapp
COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Create the final lightweight image
FROM openjdk:8-jre-slim

WORKDIR /app

COPY --from=build /app/target/travelapp-0.0.1-SNAPSHOT.jar /app/travelapp.jar

EXPOSE 8181

CMD ["java", "-Xmx512m", "-jar", "trav"]

