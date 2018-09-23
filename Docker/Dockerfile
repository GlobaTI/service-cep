FROM openjdk:8-jre-alpine
ADD service-cep-0.0.1-SNAPSHOT.jar service-cep.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/service-cep.jar"]
