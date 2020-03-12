FROM openjdk:8
ADD target/MyDemo-0.0.1-SNAPSHOT.jar updated.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","updated.jar"]