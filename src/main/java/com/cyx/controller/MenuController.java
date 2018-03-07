package com.cyx.controller;

import com.cyx.domain.Menu;
import com.cyx.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    MenuService menuService;


    @RequestMapping("/addMenu")
    public String addMenu(Menu menu){
        int row = menuService.insertMenu(menu);
        if(row>0){
            return "插入成功";
        }
        return "插入失败";
    }
}
