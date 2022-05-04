package zx.com.grpc.service.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/server/echo/{name}")
    public String echo(@PathVariable String name){
        System.out.println("echo name=" + name);

        return name;
    }
}
