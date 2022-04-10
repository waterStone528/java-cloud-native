package zx.com.grpc.service.helloworld.stub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import zx.com.grpc.service.helloworld.GreeterGrpc;
import zx.com.grpc.service.helloworld.HelloReply;
import zx.com.grpc.service.helloworld.HelloRequest;

import javax.annotation.PostConstruct;

/**
 * @author zhangxiong
 * @version 2022/4/2 16:17
 */
@Component
public class HellowStub {
    @Value("${zx.grpc.server.host}")
    String host;
    @Value("${zx.grpc.server.port}")
    String port;
    private ManagedChannel managedChannel = null;
    private GreeterGrpc.GreeterBlockingStub greeterBlockingStub = null;

    @PostConstruct
    public void init(){
        System.out.println(String.format("grpc server host=%s, port=%s", host, port));

        managedChannel = ManagedChannelBuilder.forAddress(host, Integer.valueOf(port))
                .usePlaintext().build();
        greeterBlockingStub = GreeterGrpc.newBlockingStub(managedChannel);
    }

    public String request(String name){
        HelloRequest helloRequest = HelloRequest.newBuilder().setName(name).build();
        HelloReply helloReply = greeterBlockingStub.sayHello(helloRequest);
        System.out.println(helloReply.getMessage());

        return helloReply.getMessage();
    }

}
