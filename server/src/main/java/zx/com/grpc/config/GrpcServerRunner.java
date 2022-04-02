package zx.com.grpc.config;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import zx.com.grpc.service.helloworld.impl.GreeterGrpcImpl;

/**
 * @author zhangxiong
 * @version 2022/4/2 15:57
 */
@Component
public class GrpcServerRunner implements ApplicationRunner {


    @Override
    public void run(ApplicationArguments args) throws Exception {
        int port = 50051;
        ServerBuilder.forPort(port)
                .addService(new GreeterGrpcImpl())
                .build().start();
        System.out.println("grpc server start");
    }
}
