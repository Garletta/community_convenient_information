/**
 * 
 */
package com.etc.mapper;

import com.etc.pojo.User;

/**
 * @author Administrator
 *
 */
public interface UserMapper {
	
	/**
	 * 根据用户  查询 用户
	 * @param user
	 * @return
	 */
	public abstract User queryUserByNameAndPwd(User user);
	
	/**
	 * 根据用户id查询用户
	 * @param userId
	 * @return
	 */
	public abstract User queryUserById(String userId);
	
	

}
