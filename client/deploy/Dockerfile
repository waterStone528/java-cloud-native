# build
FROM swr.cn-east-3.myhuaweicloud.com/dangqu-powertrade/maven:3.6.3-adoptopenjdk-11 as builder
WORKDIR /usr/src/app
COPY . .
RUN mvn clean package -Dmaven.test.skip=true --settings ./deploy/.m2/settings.xml


FROM swr.cn-east-3.myhuaweicloud.com/dangqu-powertrade/adoptopenjdk/openjdk11:jdk-11.0.9.1_1 AS final
WORKDIR /opt/app
EXPOSE 8081
COPY --from=builder /usr/src/app/client/target/client-*.jar grpc-client.jar

ENTRYPOINT ["java", "-XX:+UseContainerSupport","-XX:InitialRAMPercentage=50","-XX:MaxRAMPercentage=70",  "-jar", "grpc-client.jar"]
