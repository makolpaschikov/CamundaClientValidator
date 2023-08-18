FROM amazoncorretto:17-alpine-jdk
COPY target/CamundaClientValidator-1.0.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
EXPOSE 8080