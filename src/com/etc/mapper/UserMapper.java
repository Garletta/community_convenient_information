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
	 * �����û�  ��ѯ �û�
	 * @param user
	 * @return
	 */
	public abstract User queryUserByNameAndPwd(User user);
	
	/**
	 * �����û�id��ѯ�û�
	 * @param userId
	 * @return
	 */
	public abstract User queryUserById(String userId);
	
	

}
