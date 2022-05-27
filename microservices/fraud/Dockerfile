FROM openjdk:17-jdk-alpine
EXPOSE 8081
ADD /target/fraud-0.0.1-SNAPSHOT.jar fraud.jar
ENTRYPOINT ["java","-jar","fraud.jar"]