package com.lwl.springbootmybatis2;


import com.lwl.springbootmybatis2.mapper.UserMapper;
import com.lwl.springbootmybatis2.model.User;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatis2ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {

    }

    @Test
    void testFindById() {
        User user = userMapper.findById(1);
        System.out.println("id="+user.getId());
        System.out.println("name+"+user.getName());
    }

}
