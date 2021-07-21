FROM openjdk:8
EXPOSE 8080
ADD target/spring-with-docker.jar spring-with-docker.jar
ENTRYPOINT ["java", "-jar", "/spring-with-docker.jar"]