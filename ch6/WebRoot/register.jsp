<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
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
    用户注册 <br>
     <form action="registResult.jsp" method="post">
    	用户名：<input type="text" name="userName"/><br/>
    	网    名：<input type="text" name="nickName"/><br/>
    	口    令：<input type="password" name="password"/><br/>
    	确认口令：<input type="password" name="password2"/><br/>
    	年    龄：<input type="text" name="age"/><br/>
    	<input type="submit" value="提交查询信息"/>
    	<input type="reset" value="重置">
    </form>
  </body>
</html>
