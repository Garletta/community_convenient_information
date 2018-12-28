<%@page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html >
<head>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<title>小区便民信息管理系统</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/styles/common02.css"/>

</head>
<body>
            <div class="page-sidebar">
            <c:if test="${sessionScope.user.isStore == 1 }">
                <div class="sidebar-menugroup">
                    <div class="sidebar-grouptitle" style="font-size:25px">管理员</div>
                    <ul class="sidebar-menu">
                    
                        <li class="sidebar-menuitem"><a href="${pageContext.request.contextPath }/community/searchCommunityController" target="main">查看居民信息</a></li>
                        <li class="sidebar-menuitem active"><a href="${pageContext.request.contextPath }/community/toAddCommunityController" target="main">添加居民</a></li>
                        <li class="sidebar-menuitem"><a href="${pageContext.request.contextPath }/community/toDeleteCommunityController" target="main">删除居民</a></li>
						<li class="sidebar-menuitem"><a href="${pageContext.request.contextPath }/community/toUpdateCommunityController" target="main">修改居民</a></li>
						</br>
						<li class="sidebar-menuitem"><a href="${pageContext.request.contextPath }/source/searchSourceController" target="main">查看资源信息</a></li>
                        <li class="sidebar-menuitem active"><a href="${pageContext.request.contextPath }/source/toAddSourceController" target="main">添加资源</a></li>
                        <li class="sidebar-menuitem"><a href="${pageContext.request.contextPath }/source/toDeleteSourceController" target="main">删除资源</a></li>
						<li class="sidebar-menuitem"><a href="${pageContext.request.contextPath }/source/toUpdateSourceController" target="main">修改资源</a></li>
						
                    </ul>
                </div>
                
                </c:if>
                
              <c:if test="${sessionScope.user.isStore == 0 }">
                <div class="sidebar-menugroup">
                    <div class="sidebar-grouptitle">居民</div>
                    <ul class="sidebar-menu">
            
                        <li class="sidebar-menuitem"><a href="${pageContext.request.contextPath }/source/searchSourceController" target="main">查看资源信息</a></li>
                   
                    </ul>
                </div>
              </c:if>
            </div>
</body>
</html>
