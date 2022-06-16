package zx.com.grpc.client.helloworld.sutb;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Component;
import zx.com.grpc.client.helloworld.GreeterGrpc;
import zx.com.grpc.client.helloworld.HelloRequest;

@Component
public class HelloWorldManager {

    @GrpcClient("greeter")
    private GreeterGrpc.GreeterBlockingStub greeterBlockingStub;

    public String receiveGreeter(String name){
        HelloRequest helloRequest = HelloRequest.newBuilder().setName(name).build();

        return greeterBlockingStub.sayHello(helloRequest).getMessage();
    }
}
