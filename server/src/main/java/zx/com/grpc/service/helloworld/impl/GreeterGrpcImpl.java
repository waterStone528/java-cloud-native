package zx.com.grpc.service.helloworld.impl;

import zx.com.grpc.service.helloworld.GreeterGrpc;
import zx.com.grpc.service.helloworld.HelloReply;
import zx.com.grpc.service.helloworld.HelloRequest;

/**
 * @author zhangxiong
 * @version 2022/4/2 15:49
 */
public class GreeterGrpcImpl extends GreeterGrpc.GreeterImplBase {
    @Override
    public void sayHello(HelloRequest request,
                         io.grpc.stub.StreamObserver<HelloReply> responseObserver) {
        HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + request.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

}
