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
                    居民管理 > 更新居民信息
                </div>
                 <form action="${pageContext.request.contextPath }/community/updateCommunityController" method="post">
                    <fieldset>
                        <legend>修改居民信息</legend>
                        
                                            修改居民编号:
                        <input type="text" id="rId" name="residentID" maxlength="20"/><br><br>	
                                            修改居民姓名:
                        <input type="text" id="rName" name="residentName" maxlength="20"/><br><br>					 
					        修改住址单元:
					    <input type="text" id="rAddress" name="residentAddress" maxlength="20"/><br><br>
					        修改联系方式:
						<input type="text" id="rTelephone" name="residentTelephone" maxlength="20"/><br><br>		
					    
					    <h>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h>
                        <input type="submit" class="clickbutton" value="更新"/>
						<h>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h>
                        <input type="reset" class="clickbutton" value="清空"/>
                        
                    </fieldset>
                </form>
           
            </div>
	
</body>
</html>
