package com.liyu.springboot_liyu.repository;

import com.liyu.springboot_liyu.pojo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository     //spring  bean
public interface UserRepository extends CrudRepository<User, Integer>{
}
