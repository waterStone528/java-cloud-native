package pt.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import pt.grpc.service.user.impl.UserGrpcImpl;

@Component
public class GrpcServerRunner implements ApplicationRunner {
    private int port = 50051;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ServerBuilder.forPort(port)
                .addService(new UserGrpcImpl())
                .build()
                .start();

        System.out.println("grpc server 启动");
    }
}
