package zx.com.grpc.server.helloworld.impl;

import net.devh.boot.grpc.server.service.GrpcService;
import zx.com.grpc.server.helloworld.GreeterGrpc;
import zx.com.grpc.server.helloworld.HelloReply;
import zx.com.grpc.server.helloworld.HelloRequest;

import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

@GrpcService
public class GreeterGrpcImpl extends GreeterGrpc.GreeterImplBase {

    @Override
    public void sayHello(HelloRequest request,
                         io.grpc.stub.StreamObserver<HelloReply> responseObserver) {
        HelloReply reply = HelloReply.newBuilder().setMessage("receive message: " + request.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
