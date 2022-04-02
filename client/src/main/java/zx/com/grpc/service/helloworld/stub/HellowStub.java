package zx.com.grpc.service.helloworld.stub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
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
    private ManagedChannel managedChannel = null;
    private GreeterGrpc.GreeterBlockingStub greeterBlockingStub = null;

    @PostConstruct
    public void init(){
        String host = "localhost";
        int port = 50051;

        managedChannel = ManagedChannelBuilder.forAddress(host, port)
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
