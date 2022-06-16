package zx.com.grpc.client.helloworld.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zx.com.grpc.client.helloworld.sutb.HelloWorldManager;

import javax.annotation.Resource;

/**
 * @author zhangxiong
 * @version 2022/4/2 16:15
 */
@RestController
public class HelloController {
    @Resource
    HelloWorldManager helloWorldManager;

    @RequestMapping("/client/echo/{name}")
    public String echo(@PathVariable String name){
        System.out.println("echo name=" + name);

        return name;
    }

    @RequestMapping("/grpc/hello/{name}")
    public String hello(@PathVariable String name){
        System.out.println("收到hello请求， name=" + name);
        String result = helloWorldManager.receiveGreeter(name);
        System.out.println("返回hello，result=" + result);

        return result;
    }


}
