package com.jiang.controller;

import com.alibaba.fastjson.JSON;
import com.jiang.dao.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller // 使用注解配置后，就不需要再springmvc配置文件中配置bean了
@RestController
@RequestMapping("/hello")
public class HelloController {

    // http://localhost:8080/hello/h1
    @RequestMapping("/h1")
    public String hello(Model model){
        // 封装数据
//        model.addAttribute("msg", "Hello SpringMVC......");
        // 会被视图解析器处理
        UserDao userDao = new UserDao();
        userDao.setName("zhangsan");
        userDao.setSex("man");
        return JSON.toJSONString(userDao);
    }
}
