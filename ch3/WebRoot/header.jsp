<%@ page language="java" import="java.util.*" contentType="text/html ; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 值得注意的是不管是静态还是动态文件，用include被包含的文件都不应该含有<html>和<body>标签否则会重叠报错 -->

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'logo1.jsp' starting page</title>
    
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
    <img src="images/discount.jpg">
    <a>神奇的世界</a>
  </body>
</html>


