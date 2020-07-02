package com.test.springboot.service;

import com.test.springboot.entity.User;
import com.test.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author BGY
 * @date 2020/7/2 - 21:18
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel(int id){
        return userMapper.Sel(id);
    }




}
