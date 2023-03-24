FROM openjdk:11
WORKDIR /app
ADD target/*.jar user-service.jar
COPY . /app
EXPOSE 8500
CMD ["java","-jar","user-service.jar"]