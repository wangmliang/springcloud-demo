package com.springcloud.controller;

import com.springcloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <pre>
 * <b>Title：</b>AppController.java<br/>
 * <b>@author：</b>WML<br/>
 * <b>@date：</b>2018/4/25 - 12:00<br/>
 * <b>@version V1.0</b></br/>
 * <b>Copyright (c) 2018 ASPire Tech.</b>
 * </pre>
 */
@RestController
public class AppController {

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi " + name + ",i am from port:" + port;
    }

    @RequestMapping("/app1/test")
    @ResponseBody
    public User test() {
        User user = new User();
        user.setId(1);
        user.setAddress("广东省深圳市");
        user.setUserName("张三");
        return user;
    }
}
