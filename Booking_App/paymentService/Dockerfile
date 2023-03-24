FROM openjdk:11
WORKDIR /app
ADD target/*.jar payment-service.jar
COPY . /app
EXPOSE 8900
CMD ["java","-jar","payment-service.jar"]