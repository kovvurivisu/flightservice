FROM openjdk:8
ADD target/flight-service-0.0.1.jar flight-service-0.0.1.jar
ENTRYPOINT [ "sh", "-c", "java -jar /flight-service-0.0.1.jar -web -webAllowOthers -tcp -tcpAllowOthers -browser" ]
EXPOSE 8080