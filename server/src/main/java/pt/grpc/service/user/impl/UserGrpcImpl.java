package pt.grpc.service.user.impl;

import pt.grpc.service.user.GetUserNameResponse;
import pt.grpc.service.user.UserGrpc;

public class UserGrpcImpl extends UserGrpc.UserImplBase {
    @Override
    public void getUserName(pt.grpc.service.user.GetUserNameRequest request,
                            io.grpc.stub.StreamObserver<pt.grpc.service.user.GetUserNameResponse> responseObserver) {
        System.out.println("获取用户名，参数：id=" + request.getId());

        GetUserNameResponse response = GetUserNameResponse.newBuilder().setName("我是测试用户").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
