FROM openjdk:11
WORKDIR /app
ADD target/*.jar discovery-server.jar
COPY . /app
EXPOSE 8081
CMD ["java","-jar","discovery-server.jar"]