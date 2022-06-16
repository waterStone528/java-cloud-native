package pt.grpc.service.user.stub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pt.grpc.service.user.GetUserNameRequest;
import pt.grpc.service.user.GetUserNameResponse;
import pt.grpc.service.user.UserGrpc;

import javax.annotation.PostConstruct;

@Component
public class UserStub {
    @Value("${pt.grpc.server.host}")
    String host;
    @Value("${pt.grpc.server.port}")
    String port;
    private ManagedChannel managedChannel = null;
    private UserGrpc.UserBlockingStub userBlockingStub = null;

    @PostConstruct
    public void init(){
        System.out.println(String.format("grpc server host=%s, port=%s", host, port));

        managedChannel = ManagedChannelBuilder.forAddress(host, Integer.valueOf(port))
                .usePlaintext().build();

        userBlockingStub = UserGrpc.newBlockingStub(managedChannel);
    }

    public String getUserName(String id){
        GetUserNameRequest request = GetUserNameRequest.newBuilder().setId(id).build();
        GetUserNameResponse response = userBlockingStub.getUserName(request);
        System.out.println("用户名称：" + response.getName());

        return response.getName();
    }
}
