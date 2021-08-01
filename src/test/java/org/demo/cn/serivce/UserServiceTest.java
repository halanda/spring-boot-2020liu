package org.demo.cn.serivce;

import org.demo.cn.model.User;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void insertTest(){
        User u = new User("user","123456");
        userService.insert(u);
    }

    @Test
    public void getTest(){
        User u = userService.get("user");
        System.out.println(u);
    }
}
