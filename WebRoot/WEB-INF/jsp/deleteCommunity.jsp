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
                    居民管理 > 删除居民信息
                </div>
                 <form action="${pageContext.request.contextPath }/community/deleteCommunityController" method="post">
                    <fieldset>
                        <legend>删除居民信息</legend>
                        <table class="formtable">
                        <tr>
                                <td>输入要删除居民编号：
                                    <input type="text" id="rId" name="residentId" maxlength="20"/>
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
					<h3 style="text-align:center;color:black">居民列表</h3>
                </div>

                <table class="listtable">
                    <tr class="listheader">

                        <th>居民编号</th>
                        <th>居民姓名</th>
                        <th>住址单元</th>
                        <th>联系方式</th>

                    </tr>
                    <c:if test="${empty communities}">
                        <tr>
                            <td colspan="7" align="center">暂无数据！</td>
                        </tr>
                    </c:if>
                    <c:forEach items="${communities }" var="community">
                        <tr>

                            <td>${community.residentID }</td>
                            <td>${community.residentName }</td>
                            <td>${community.residentAddress }</td>
                            <td>${community.residentTelephone }</td>


                        </tr>
                    </c:forEach>
                </table>
                </div>

</body>
</html>
