FROM openjdk:11
WORKDIR /app
ADD target/*.jar api-gateway.jar
COPY . /app
EXPOSE 8500
CMD ["java","-jar","api-gateway.jar"]