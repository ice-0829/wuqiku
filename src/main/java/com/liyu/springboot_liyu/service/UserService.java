package com.liyu.springboot_liyu.service;

import com.liyu.springboot_liyu.pojo.User;
import com.liyu.springboot_liyu.pojo.dto.UserDto;
import com.liyu.springboot_liyu.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service        //Spring的bean
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User add(UserDto user) {
        User userPoji = new User();
        BeanUtils.copyProperties(user,userPoji);
        return userRepository.save(userPoji);
        //调用数据

    }
}
