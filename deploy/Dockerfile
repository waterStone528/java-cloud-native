# build
FROM swr.cn-east-3.myhuaweicloud.com/dangqu-powertrade/maven:3.6.3-adoptopenjdk-11 as builder
WORKDIR /usr/src/app
COPY . .
RUN mvn clean package -Dmaven.test.skip=true --settings ./deploy/.m2/settings.xml


FROM swr.cn-east-3.myhuaweicloud.com/dangqu-powertrade/adoptopenjdk/openjdk11:jdk-11.0.9.1_1 AS final
WORKDIR /opt/app
EXPOSE 80
RUN curl http://repo.lumicable.cn/repository/misc/sykwalking-agent/skywalking-agent.tar.gz | tar -zxf -
COPY --from=builder /usr/src/app/document-digitization-app/target/document-digitization-app-*.jar document-digitization-app.jar

#ENV SW_AGENT_COLLECTOR_BACKEND_SERVICES=${SkyWalking__Transport__gRPC__Servers}

#ENTRYPOINT ["java", "-jar", "mail-api.jar", "--spring.profiles.active=${ASPNETCORE_ENVIRONMENT}"]
ENTRYPOINT ["java", "-XX:+UseContainerSupport","-XX:InitialRAMPercentage=50","-XX:MaxRAMPercentage=70", "-javaagent:skywalking-agent.jar=skywalking.agent.service_name=document-digitization", "-jar", "document-digitization-app.jar", "--spring.profiles.active=${ASPNETCORE_ENVIRONMENT}"]
