<%@ page language="java" import="java.util.*" contentType="text/html ; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
<style>
	#login{
		height:50px;
		background:#f3f3f3;
	}
	#login td{
		background:green;
	}
</style>
  </head>
  
  
  	<body>
  		<div id="login">
  		<jsp:include page="header.jsp"></jsp:include>
  		<%--<%@ include file="header.jsp" %> ok --%>
	<jsp:useBean id="menu" class="com.dao.entity.Entity"></jsp:useBean>
	<jsp:setProperty property="name" name="menu" value="无知@蜕变"/>
    <p>输出信息...</p>
    <table>
    	<tr>
    		<td>${menu.titles[0]}</td>
    		<td>${menu.titles[1]}</td>
    		<td>${menu.titles[2]}</td>
    		<td>${menu.titles[3]}</td>
    		<td>${menu.titles[4]}</td>
    		<td>${menu.titles[5]}</td>
    		<td>欢迎"<jsp:getProperty property="name" name="menu"/>"访问博客！</td>
    	</tr>
    </table>
 	
  		
  		</div>
  </body>
</html>
