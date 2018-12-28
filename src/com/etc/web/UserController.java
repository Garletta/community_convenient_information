/**
 * 
 */
package com.etc.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.pojo.User;
import com.etc.service.UserService;

/**
 * @author Administrator
 *
 */
@Controller  // 被spring托管
@RequestMapping(value="/user") // 请求路径
public class UserController {
	
	
	// @Autowired  将service 注入 相当于  new UserService
	@Autowired
	private UserService userService;
	
	/**
	 * 跳转到登录页面的方法
	 * @return
	 */
	@RequestMapping(value="/toLoginController")
	public String toLoginController(){

		// 返回的字符串  视图
		return "login";
	}
  
	 
	/**
	 * 登录方法
	 * 第一种获取值的方式 方法的参数列表  写要获取表单里的 name 属性的值
	 * 
	 * Model 携带参数的接口
	 * @return
	 */
	@RequestMapping(value="/loginController")
    public String loginController(User user,Model model,HttpSession session){
	
		User u = userService.queryUserByNameAndPwd(user);
		if(u == null){
			// loginError 对应前台的 ${loginError}
			model.addAttribute("loginError", "用户名或密码错误");
			return "login";
		}else{
			// 将用户保存在整个会话中
			session.setAttribute("user", u);
			return "adminindex";
		}
		
	}
	
	//---------------------------访问主体的四个页面------------------------------
	@RequestMapping(value="/topController")
	public String topController(){
		return "top";
	}
	
	@RequestMapping(value="/adminleftController")
	public String adminleftController(){
		return "adminleft";
	}
	
	@RequestMapping(value="/welcomeController")
	public String welcomeController(){
		return "welcome";
	}
	
	@RequestMapping(value="/adminrightController")
	public String adminrightController() {
		return "adminright";
	}
	
	@RequestMapping(value="/footController")
	public String footController(){
		return "foot";
	}
}
