FROM openjdk:17-jdk-alpine
EXPOSE 8080
ADD /target/customer-0.0.1-SNAPSHOT.jar customer.jar
ENTRYPOINT ["java","-jar","customer.jar"]