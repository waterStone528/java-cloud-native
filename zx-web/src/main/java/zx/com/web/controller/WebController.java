package zx.com.web.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @RequestMapping("/echo/{value}")
    public String Echo(@PathVariable String value){
        System.out.println("echo value={}" + value);

        return value;
    }
}
