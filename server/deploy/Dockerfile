FROM adoptopenjdk/openjdk11:aarch64-ubuntu-jre-11.0.14.1_1
RUN mkdir /opt/app
EXPOSE 8081
COPY ./server-1.0-SNAPSHOT.jar /opt/app/grpc-server.jar
CMD ["java", "-jar", "/opt/app/grpc-server.jar"]
