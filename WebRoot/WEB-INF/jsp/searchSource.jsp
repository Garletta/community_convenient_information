
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
<body>
	
	<div class="page-content">
                </br>
                <div class="content-nav" style="font-size:20px">
                    资源管理 > 资源信息
                </div>
                
                <table>
                	<td>
                		<div>
		                <form action="${pageContext.request.contextPath }/source/querySourceByIdController" method="post">
		                    <fieldset>
		                        <legend>搜索资源</legend>
		                        <table class="formtable">
		                            <tr>
		                                <td>按资源编号：
		                                    <input type="text" id="sId" name="sourceId" maxlength="20" />
		                                </td> 
		                            </tr>
		                            <tr>
		                                <td colspan="7" class="command">
		                                    <input type="submit" class="clickbutton" value="查询"/>
		                                    <input type="reset" class="clickbutton" value="重置"/>
		                                </td>
		                            </tr>
		                        </table>
		                    </fieldset>
		                </form>
                		</div>
                	</td>
                	
                	<td>
                		<div>
		                <form action="${pageContext.request.contextPath }/source/querySourceByNameController" method="post">
		                    <fieldset>
		                        <legend>搜索资源</legend>
		                        <table class="formtable">
		                            <tr>
		                                <td>按资源名：
		                                    <input type="text" id="sName" name="sourceName" maxlength="20" />
		                                </td> 
		                            </tr>
		                            <tr>
		                                <td colspan="7" class="command">
		                                    <input type="submit" class="clickbutton" value="查询"/>
		                                    <input type="reset" class="clickbutton" value="重置"/>
		                                </td>
		                            </tr>
		                        </table>
		                    </fieldset>
		                </form>
                		</div>
                	</td>
                	
                </table>
                
                <div>
                    <h3 style="text-align:center;color:black">查询结果</h3>
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
	                        <td colspan="7" align="center">暂无数据！</td> 
                        </tr>
                    </c:if>
                    <c:forEach items="${sources }" var="source">
                       <tr>
	                        
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
