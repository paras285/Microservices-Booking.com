FROM openjdk:11
WORKDIR /app
ADD target/*.jar notification-service.jar
COPY . /app
EXPOSE 9000
CMD ["java","-jar","notification-service.jar"]