package pt.grpc.client.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.grpc.service.user.stub.UserStub;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    UserStub userStub;

    @RequestMapping("user/name/{id}")
    public String getUserName(@PathVariable String id){
        return userStub.getUserName(id);
    }

}
