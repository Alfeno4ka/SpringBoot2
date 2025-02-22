FROM openjdk:21-oracle
EXPOSE 8080
COPY target/SpringBoot2-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]

