package com.example.blog;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import tzb.BlogApplication;
import tzb.pojo.Users;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BlogApplication.class)
// 如果在根路径下没有application类则需要指定一个application类
@WebAppConfiguration
class BlogApplicationTests {
    @Autowired
    private tzb.service.impl.UsersServiceImpl usersService;
    @Test
    void contextLoads() {

    }
    @Test
    void testUsers() {
        Users users = usersService.getUserById(1);
        System.out.println(users.getEmail());
    }
}
