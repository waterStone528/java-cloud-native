package zx.com.web.controller;

import com.alibaba.fastjson.JSON;
import jdk.jfr.DataAmount;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class WebController {
    @RequestMapping("/echo/{value}")
    public String Echo(@PathVariable String value){
        System.out.println("echo value={}" + value);

        return value;
    }

    private static class User {
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }


    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1);
        user1.setName("zk da sha bi");

        User user2 = new User();
        user2.setId(2);
        user2.setName("zk da sha cha");

        List<User> users = Arrays.asList(user1, user2);

        String userStr = JSON.toJSONString(users);
        System.out.println(userStr);

        List<User> userDes = JSON.parseArray(userStr, User.class);
        System.out.println(userDes);
    }
}
