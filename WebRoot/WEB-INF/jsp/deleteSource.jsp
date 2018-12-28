<%@page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
        <title>小区便民信息系统</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath }/styles/common03.css" />
    </head>
</head>
<body>
	
	<div class="page-content">
                </br>
                <div class="content-nav" style="font-size:20px">
                    资源管理 > 删除资源信息
                </div>
                 <form action="${pageContext.request.contextPath }/source/deleteSourceController" method="post">
                    <fieldset>
                        <legend>删除资源信息</legend>
                        <table class="formtable">
                        <tr>
                                <td>输入要删除资源编号：
                                    <input type="text" id="sId" name="sourceId" maxlength="20"/>
                                </td>
                            </tr>
                            <tr>
                            <td colspan="6" class="command">
                                    <input type="submit" class="clickbutton"  value="删除"/>
                            </td>
                            </tr>
                        </table>
                    </fieldset>
                </form>
                <div>
					<h3 style="text-align:center;color:black">删除结果</h3>
                  
                </div>
                <table class="listtable">
                    <tr class="listheader">
                        <th>资源编号</th>
                        <th>资源名称</th>
                        <th>容纳人数</th>
                        <th>开放时间</th>                                        
                    </tr>
                    <c:if test="${empty sources}">
                       <tr>
	                        <td colspan="7" align="center">暂无可用结果！</td> 
                        </tr>
                    </c:if>
                    <!-- 遍历数据库中学生信息 
                     items  集合List<Students>
                     var 集合中遍历出的每一个结果  students
                    -->
                    <c:forEach items="${sources }" var="source">
                       <tr class="listheader">
                       
                       		<td>${source.sourceId }</td>
	                        <td>${source.sourceName }</td>
	                        <td>${source.fitNum }</td>
	                        <td>${source.openTime }</td>
	                        
                        </tr>
                    </c:forEach>
                </table>
            </div>
	
</body>
</html>
