<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'registResult.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
        <jsp:useBean id="user" class="com.User"></jsp:useBean>
        <jsp:setProperty property="*" name="user"/>
        <jsp:setProperty property="rePassword" name="user" param="password2"/>
        <%
        	if(!user.isValid()){
         %>
         两次输入的口令不相同，请重新<a href="#" onclick="javascript:history.go(-1)">注册！</a>
         <%}else{ %>
        确定注册信息
        您输入的注册信息是：<br/>
        用户名：<jsp:getProperty property="name" name="user"/><br/>
        网    名：<jsp:getProperty property="nickName" name="user"/><br/>
         口    令：<jsp:getProperty property="age" name="user"/><br/>
         年    龄：<jsp:getProperty property="desc" name="user"/><br/>
         <%} %>
  </body>
</html>
