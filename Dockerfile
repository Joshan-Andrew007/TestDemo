FROM openjdk:21
COPY ./target/customer.jar customer.jar
CMD ["java","-jar","customer.jar"]