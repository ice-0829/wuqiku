package com.liyu.springboot_liyu.controller;

import com.liyu.springboot_liyu.pojo.dto.UserDto;
import com.liyu.springboot_liyu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //接口的方法返回对象 转换成Json文本
@RequestMapping("/user")        //localhost:8088/user/**
public class UserController {

    @Autowired
    IUserService userService;
    //增加
    @PostMapping
    public String add(@RequestBody UserDto user) {
        userService.add(user);
        return "success!";
    }

    //查询


    //修改


    //删除
}
