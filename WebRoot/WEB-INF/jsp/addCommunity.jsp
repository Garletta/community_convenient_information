<%@page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>小区便民信息管理系统</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath }/styles/common03.css" />
	</head>
<body>
	<div class="page-content">
				</br>
                <div class="content-nav" style="font-size:20px">
                居民管理 > 新增居民信息
                </div>
                  <form action="${pageContext.request.contextPath }/community/addCommunityController" method="post">
                    <fieldset>
                        <legend>新增居民信息</legend>
                        
                                            居民编号:
                        <input type="text" id="rID" name="residentID" maxlength="20"/><br><br>
                                            居民姓名:
                        <input type="text" id="rName" name="residentName" maxlength="20"/><br><br>					
						 住址单元:
						<input type="text" id="rAddress" name="residentAddress"  maxlength="20"/><br><br>									   
					        联系方式:
					    <input type="text" id="rTelephone" name="residentTelephone"  maxlength="20"/><br><br>	
					    				     
                        <input type="submit" class="clickbutton" value="新增居民"/>
                        
                    </fieldset>
                </form>              
            </div>       
    </body>
</html>
