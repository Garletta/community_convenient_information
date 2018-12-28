<!--  添加jsp指令-->
<%@page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
        <title>小区便民信息管理系统</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath }/styles/common03.css" />
    </head>
</head>
<body>
	
	<div class="page-content">
                </br>
                <div class="content-nav" style="font-size:20px">
                    资源管理 > 更新资源信息
                </div>
                 <form action="${pageContext.request.contextPath }/source/updateSourceController" method="post">
                    <fieldset>
                        <legend>修改资源信息</legend>
                        
                                            输入资源编号:
                        <input type="text" id="sId" name="sourceId" maxlength="20"/><br><br>	
                                            修改资源名称:
                        <input type="text" id="sName" name="sourceName" maxlength="20"/><br><br>					 
					        修改容纳人数:
					    <input type="text" id="fitnum" name="fitNum" maxlength="20"/><br><br>
					        修改开放时间:
						<input type="text" id="opentime" name="openTime" maxlength="20"/><br><br>		
					    
					    <h>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h>
                        <input type="submit" class="clickbutton" value="更新"/>
						<h>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h>
                        <input type="reset" class="clickbutton" value="清空"/>
                        
                    </fieldset>
                </form>
           
            </div>
	
</body>
</html>
