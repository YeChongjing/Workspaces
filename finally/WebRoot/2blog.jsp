<%@ page language="java" import="java.util.*"  contentType="text/html ; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP '2blog.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
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
    <div>
    <jsp:include page="header.jsp"></jsp:include>
    <%--<%@ include file="header.jsp" %> --%>
    <jsp:useBean id="menu" class=com.dao.entity></jsp:useBean>
    <jsp:setProperty property="name" name="menu" value="叶崇京"/>
    <p>输出信息</p>
    <table>
    	<tr>
    		<td>${menu.titles[0]}</td>
    		<td>${menu.titles[1]}</td>
    		<td>${menu.titles[2]}</td>
    		<td>${menu.titles[3]}</td>
    		<td>${menu.titles[4]}</td>
    		<td>${menu.titles[5]}</td>
    		<td>欢迎访问"<jsp:getProperty property="name" name="menu"/>"的博客！</td>
    	</tr>
    </table>
    </div>
  </body>
</html>
