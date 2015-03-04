<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>My JSP 'welcome.jsp' starting page</title>
<style type="text/css">
*{
	margin:0px;
	padding:0px;
	}
body{
	overflow-x:hidden;
	}
#welcome{
	width:820px;
	height:400px;
	margin:0px auto;
	}
</style>
</head>
<body>
<div id="welcome">
	<img src="images/welcome.jpg" style="width:100%; height:100%;" />
</div>
</body>
</html>
    