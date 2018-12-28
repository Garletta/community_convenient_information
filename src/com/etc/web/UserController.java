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
@Controller  // ��spring�й�
@RequestMapping(value="/user") // ����·��
public class UserController {
	
	
	// @Autowired  ��service ע�� �൱��  new UserService
	@Autowired
	private UserService userService;
	
	/**
	 * ��ת����¼ҳ��ķ���
	 * @return
	 */
	@RequestMapping(value="/toLoginController")
	public String toLoginController(){

		// ���ص��ַ���  ��ͼ
		return "login";
	}
  
	 
	/**
	 * ��¼����
	 * ��һ�ֻ�ȡֵ�ķ�ʽ �����Ĳ����б�  дҪ��ȡ����� name ���Ե�ֵ
	 * 
	 * Model Я�������Ľӿ�
	 * @return
	 */
	@RequestMapping(value="/loginController")
    public String loginController(User user,Model model,HttpSession session){
	
		User u = userService.queryUserByNameAndPwd(user);
		if(u == null){
			// loginError ��Ӧǰ̨�� ${loginError}
			model.addAttribute("loginError", "�û������������");
			return "login";
		}else{
			// ���û������������Ự��
			session.setAttribute("user", u);
			return "adminindex";
		}
		
	}
	
	//---------------------------����������ĸ�ҳ��------------------------------
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
