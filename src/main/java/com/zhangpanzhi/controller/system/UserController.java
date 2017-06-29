package com.zhangpanzhi.controller.system;

import com.zhangpanzhi.model.system.User;
import com.zhangpanzhi.service.system.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017-6-29.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping(value = "/add")
    public String add() {
        User user=new User();
        user.setEnable(1);
        user.setPassword("11");
        user.setUsername("23232");

        int i = userService.saveUserWithBackId(user);
       return i+"";
    }
}
