<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>扎堆吧后台管理系统</title>
	<link type="text/css" href="css/bg_index.css" rel="stylesheet" />
	<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
	<script type="text/javascript" src="js/jquery.dject.min-1.js"></script>
	<script type="text/javascript">
$(function(){
	var winHeight=$(window).height();
	var winWidth=$(window).width();
	$("#main_left").height(winHeight-122);
	$("#main_right_center").height($("#main_left").height()-$("#main_right_top").height());
	$(window).resize(function(){
		var winHeight=$(window).height();
		var winWidth=$(window).width();
		$("#main_left").height(winHeight-122);
		$("#main_right_center").height($("#main_left").height()-$("#main_right_top").height());
	});
	$(".quit_system").djectDialog({
			"content":"你确定要退出系统吗？",
			"callback":function(status){
				if(status=="confirm"){
					window.location.href="adminQuit";	
				}
			}
		});
});
</script>
</head>
<body>
<div id="header">
   	<div id="header_logo"><img src="images/logo.png" /></div>
    <div id="header_logo_word"><img src="images/logo_word.png" /></div>
    <div id="header_closeDiv"><a class="quit_system" href="javascript:void(0);"><img src="images/close .png" /></a></div>
</div>
<div id="main">
	<div id="main_left">
    	<iframe src="left.jsp" frameborder="0"></iframe>
    </div>
    <div id="main_right">
    	<div id="main_right_top"><span id="position_title">当前登录用户:</span><span id="position_word"><s:property value="#session.ZHADUI8ADMINUSER.userAccount" /></span></div>
        <div id="main_right_center">
        	<iframe name="content_iframe" src="welcome.jsp" frameborder="0"></iframe>
        </div>
    </div>
</div>
</body>
</html>
