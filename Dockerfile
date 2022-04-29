FROM openjdk:8-jdk
EXPOSE 8080
ADD target/sample.jar sample.jar
ENTRYPOINT ["java","-jar","sample.jar"]
