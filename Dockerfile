FROM openjdk:21
COPY ./target/customer.jar userr.jar
CMD ["java","-jar","customer.jar"]