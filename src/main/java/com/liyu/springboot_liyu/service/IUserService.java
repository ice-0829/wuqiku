package com.liyu.springboot_liyu.service;

import com.liyu.springboot_liyu.pojo.User;
import com.liyu.springboot_liyu.pojo.dto.UserDto;

public interface IUserService {
    /**
     * 插入用户
     *
     * @param user 参数
     * @return
     */
    User add(UserDto user);
}
