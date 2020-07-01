package com.my.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.my.pojo.UserInfo;

public interface UserInfoDao {
	// 根据用户名和密码查询
	@Select("select * from user_info where userName = #{userName} and password = #{password}")
	public UserInfo findUserInfoByCond(@Param("userName") String userName, @Param("password") String password);

}
