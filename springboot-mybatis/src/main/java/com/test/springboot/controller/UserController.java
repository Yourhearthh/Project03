package com.test.springboot.controller;

import com.test.springboot.entity.User;
import com.test.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author BGY
 * @date 2020/7/2 - 21:17
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/ssm")
    public List<User> findAllUser() throws Exception{
        return userService.queryAllUser();
    }



    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
        return userService.Sel(id).toString();
    }



    @RequestMapping(value="index",produces="text/plain;charset=UTF-8")
    public String hello(){
        return "hello springboot!";
    }


   @RequestMapping("/map")
    public Map<String,Object> map(){
       Map<String,Object> map = new HashMap<String,Object>();
       map.put("username", "张三丰");
       map.put("gender", "男");
       return map;
    }






}
