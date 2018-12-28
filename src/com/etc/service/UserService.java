/**
 * 
 */
package com.etc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etc.mapper.UserMapper;
import com.etc.pojo.User;

/**
 * @author Administrator
 *
 */
@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public User queryUserByNameAndPwd(User user){
		return userMapper.queryUserByNameAndPwd(user);
	}
}
