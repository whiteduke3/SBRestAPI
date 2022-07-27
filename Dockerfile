FROM openjdk:18
LABEL maintainer="dino.celikovic@gmail.com"
ADD target/demo2-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]