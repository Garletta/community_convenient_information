<%@page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<title>无标题文档</title>
 <link rel="stylesheet" href="${pageContext.request.contextPath }/styles/common.css"/>
 
</head>
<body>
  <div class="page-header">
            <div class="header-banner">
                <img src="http://localhost:8080/convenint_information/images/xiaoqu.jpg" alt="便民信息"/>
            </div>
            <div class="header-title">
                欢迎访问小区便民信息管理系统
            </div>
            <div class="header-quicklink">
              欢迎您，<strong>${sessionScope.user.userName }</strong>
       <a href="http://localhost:8080/convenint_information/user/toLoginController">退出</a>
            </div>
           
        </div>
</body>
</html>
