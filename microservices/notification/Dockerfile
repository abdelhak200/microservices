FROM openjdk:17-jdk-alpine
EXPOSE 8082
ADD /target/notification-0.0.1-SNAPSHOT.jar notification.jar
ENTRYPOINT ["java","-jar","notification.jar"]