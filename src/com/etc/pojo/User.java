
package com.etc.pojo;

/**
 * @author Administrator
 *  用户
 */
public class User {
   
	private String userId;
	
	private String userName; 
	 
	private String password;
	
	private int isManager; // 1 仓库管理员  0  收银员


	public User() {
		super();
	}

	public User(String userId, String userName, String password, int isStore, String vipNum, int score) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.isManager = isManager;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIsStore() {
		return isManager;
	}

	public void setIsStore(int isStore) {
		this.isManager = isManager;
	}
	
}
