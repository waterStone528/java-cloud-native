FROM adoptopenjdk/openjdk11:aarch64-ubuntu-jre-11.0.14.1_1
RUN mkdir /opt/app
EXPOSE 8080
COPY ./zx-web-1.0-SNAPSHOT.jar /opt/app/zx-web.jar
CMD ["java", "-jar", "/opt/app/zx-web.jar"]