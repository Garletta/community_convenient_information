/**
 * 
 */
package com.etc.exception;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Administrator
 *
 */
public class ExceptionService implements HandlerExceptionResolver{
    
	/**
	 * �쳣��ͳһ����
	 */
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object arg2,
			Exception exception) {
		String msg = ""; // ��ӡ���쳣��Ϣ
		if(exception instanceof MyException){
			msg = exception.getMessage();
		}else{
			// ���������ʱ�쳣����ȡ�����ջ���Ӷ�ջ�л�ȡ�쳣��Ϣ
			Writer out = new StringWriter();
			PrintWriter s = new PrintWriter(out);
			exception.printStackTrace(s);
			msg = out.toString(); // ������쳣��Ϣ

		}
		ModelAndView andView = new ModelAndView();
		andView.setViewName("exception");
		andView.addObject("msg", msg);
		return andView;
	}

}
