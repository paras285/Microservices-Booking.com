FROM openjdk:11
WORKDIR /app
ADD target/*.jar user-booking.jar
COPY . /app
EXPOSE 9100
CMD ["java","-jar","user-booking.jar"]