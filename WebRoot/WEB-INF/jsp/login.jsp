<!--  添加jsp指令-->
<%@page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
<meta http-equiv="content-type" content="text/html;charset=utf-8">
        <title>小区便民信息管理系统</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath }/styles/common.css"/>
		<script language="JavaScript"> 
		   if (window != top) {
			   top.location.href = location.href;
		   }
		</script>
		
		<style type="text/css">
		body{
		 background:url(http://localhost:8080/convenint_information/images/2.jpg) ;
		
		 background-size:cover;
		}
		</style>
    </head>
    <body >
    		
             <div class="page-content">
                <div class="content-nav">
                </br></br></br></br></br></br></br></br>
                    	<h1 style="font-size:50px">小区便民信息管理系统登陆</h1>
                </div>
                <form action="${pageContext.request.contextPath }/user/loginController" method="post">
                    <fieldset>
                    
                        <legend style="font-size:25px">登录信息</legend>    
                           
                         <table class="formtable" style="width:100%">                 
                         <tr>                             
                                <td>
                                  <font color='red'> ${loginError }</font>
                                </td>
                         </tr>
                        
                       
                            <tr style="text-align:center">
                                <td style="font-size:20px">账户:
                                	&nbsp&nbsp&nbsp&nbsp&nbsp
                                    <input id="userName" name="userName" type="text" style="width:220px;font-size:17px"/>
                                </td>
                            </tr>
                            <tr style="text-align:center">
                                <td style="font-size:20px">密码:
                                	&nbsp&nbsp&nbsp&nbsp&nbsp
                                    <input id="password" name="password" type="password" style="width:220px;font-size:17px"/>
                                </td>
                            </tr>
                             <tr>
                                <td>
                              
                                </td>
                              <!--  <td>
                                    <select id="timelength" name="timelength">
                                    	<option value="0" selected>每次都需要登录</option>
                                    	<option value="10">10天内</option>
                                    	<option value="30">30天内</option>
                                    </select>
                                </td>-->
                            </tr>
                            <tr>
                                <td colspan="2" class="command">
                                    <input type="submit" value="登录" class="clickbutton" style="width:150px;font-size:25px"/>
                                  	<input type="button" value="返回" class="clickbutton" style="width:150px;font-size:25px" onclick="window.history.back();"/>
                                </td>
                            </tr>
                        </table>
                        </h3>
                    </fieldset>
                </form>
            </div>
 
    </body>
</html>