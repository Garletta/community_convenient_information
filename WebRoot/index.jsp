<!-- 添加jsp指令-->
<%@page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>小区便民信息管理系统</title>
<style type="text/css">
body{
 background:url(http://localhost:8080/convenint_information/images/2.jpg) ;

 background-size:cover;
}
.bottom_footer{
	position: fixed; /*or前面的是absolute就可以用*/
	bottom:4%;
	left:40%;
	margin:0 auto;
}

.center_center{
	position:absolute;
	top:30%;
	left:25%;
	margin:0 auto;
}
</style>
</head>

<body  >
<!--${pageContext.request.contextPath } 获取项目的绝对路劲 http://localhost:8080/StuStaManage/-->

<div class="center_center">
	<a href="${pageContext.request.contextPath }/user/toLoginController"style="display:block;text-align:center;vertical-aling:middle;color:black; font-size:60px; " >小区便民信息管理系统登录</a>
</div>

<div class="bottom_footer">
	<p style="text-align:center;vertical-align:bottom;color:blue";>如有问题请联系服务人员:13270937053</p>
</div>

</body>
</html>
