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
                资源管理 > 新增资源信息
                </div>
                  <form action="${pageContext.request.contextPath }/source/addSourceController" method="post">
                    <fieldset>
                        <legend>新增资源信息</legend>
                        
                                            资源编号:
                        <input type="text" id="sId" name="sourceId" maxlength="20"/><br><br>
                                            资源名称:
                        <input type="text" id="sName" name="sourceName" maxlength="20"/><br><br>					
						 容纳人数:
						<input type="text" id="fitnum" name="fitNum"  maxlength="20"/><br><br>									   
					        开放时间:
					    <input type="text" id="opentime" name="openTime"  maxlength="20"/><br><br>	
					    				     
                        <input type="submit" class="clickbutton" value="新增资源"/>
                        
                    </fieldset>
                </form>              
            </div>       
    </body>
</html>
