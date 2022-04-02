package zx.com.grpc.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zx.com.grpc.service.helloworld.stub.HellowStub;

import javax.annotation.Resource;

/**
 * @author zhangxiong
 * @version 2022/4/2 16:15
 */
@RestController
public class HelloController {
    @Resource
    HellowStub hellowStub;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        System.out.println("收到hello请求， name=" + name);
        String result = hellowStub.request(name);
        System.out.println("返回hello，result=" + result);

        return result;
    }
}
