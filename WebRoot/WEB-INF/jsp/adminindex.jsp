<!--  添加jsp指令-->
<%@page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
<title>小区便民信息管理系统</title>

<style type="text/css">
body{
 background:url(http://localhost:8080/convenint_information/images/2.jpg) ;

 background-size:cover;
}
</style>

</head>
<frameset rows="150,*,93" framespacing="0" frameborder="no" border="0">
 <frame src="${pageContext.request.contextPath }/user/topController" name="topFrame" scrolling="No" noresize="noresize" id="topFrame"  marginwidth="0" marginheight="0"  frameborder="0" />
 	<frameset cols="18%,*,5%" id="frame">
		<frame src="${pageContext.request.contextPath }/user/adminleftController" name="leftFrame" noresize="noresize" marginwidth="60px" marginheight="20" frameborder="0" scrolling="auto" target="main"  />
		<frame src="${pageContext.request.contextPath }/user/welcomeController" name="main" noresize="noresize" marginwidth="50px" marginheight="40px" frameborder="0" scrolling="auto" target="_self"  />
	    <frame src="${pageContext.request.contextPath }/user/adminrightController" name="rightFrame" noresize="noresize" marginwidth="60px" marginheight="20" frameborder="0" scrolling="auto" target="main"  />
    </frameset>
 <frame src="${pageContext.request.contextPath }/user/footController" name="bottomFrame" scrolling="No" noresize="noresize" id="bottomFrame" marginwidth="0" marginheight="0"/>
</frameset><noframes></noframes>
</html>
