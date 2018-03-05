package com.cyx.controller;

import com.cyx.domain.User;
import com.cyx.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;

    @PostMapping("/saveUser")
    @ResponseBody
    public String saveUser(User user){
        int row = userService.insertUser(user);
        if(row>0){
            return "插入成功";
        }
        return "插入失败";
    }

    @GetMapping("/hello")
    public String hello(){
        System.out.println("Hello");
        return "hello";
    }
}
