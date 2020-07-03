package com.test.springboot.mapper;

import com.test.springboot.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author BGY
 * @date 2020/7/2 - 21:19
 */
@Repository
public interface UserMapper {

    @Select("select * from user where id=#{id}")
    User Sel(@Param(value="id") int id);


    @Select("select * from user")
    List<User> queryAllUser();



}
