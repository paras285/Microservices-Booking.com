FROM openjdk:11
WORKDIR /app
ADD target/*.jar hotel-service.jar
COPY . /app
EXPOSE 8800
CMD ["java","-jar","hotel-service.jar"]