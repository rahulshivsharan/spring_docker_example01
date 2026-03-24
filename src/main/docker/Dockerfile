FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ADD spring_docker_ex01.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]