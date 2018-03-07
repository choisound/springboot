package com.cyx.controller;

import com.cyx.domain.RespCode;
import com.cyx.domain.RespData;
import com.cyx.domain.User;
import com.cyx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/resiger")
    @ResponseBody
    public String resiger(User user) {
        int row = userService.insertUser(user);
        if (row > 0) {
            return "插入成功";
        }
        return "插入失败";
    }

    @GetMapping("/hello")
    public String hello() {
        System.out.println("Hello");
        return "hello";
    }

    @PostMapping("/login")
    //   @GetMapping("/login")
    public RespData login(User user) {
        System.out.println(user.getName());
        System.out.println(user.getPassword());
        User respuser = userService.selectUser(user.getName(), user.getPassword());
        if (respuser == null) {
            return new RespData("登录失败", RespCode.FAIL.getCode(), respuser);
        }
        return new RespData("登录成功", RespCode.SUCCESS.getCode(), respuser);
    }
}
