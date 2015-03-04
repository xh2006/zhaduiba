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
    <title>添加主题</title>
<style type="text/css">
*{
	margin:0px;
	padding:0px;
}
body{
	font-family:"微软雅黑";
	}
.input_text{
	width:300px;
	height:25px;
	font-size:18px;
	}
</style>
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
<script type="text/javascript">
$(function(){
	$(".submitForm").click(function(){
		$("#updateDuierClassForm").submit();
	});
});
</script>
</head>
<body>
<div style="height:50px; width:100%;">
	<a href="javascript:history.go(-1);" title="返回"><img style="margin-top:20px; margin-left:30px;" src="images/back.png" /></a>
</div>
<form action="updateTheme" method="post" id="updateDuierClassForm">
<s:hidden name="duierClass.duierClassId" ></s:hidden>
<div style="width:600px; margin:0px auto;">
	<div style="width:360px; height:50px; font-size:16px;">
    	主题：<s:textfield class="input_text" name="duierClass.duierClassName" ></s:textfield>
    </div>
    <div style="width:360px; height:30px; font-size:16px;">
    	主题备注：
    </div>
    <div style="width:500px; height:150px; font-size:16px;">
    	<div style="width:440px; margin-left:60px; height:150px;">
    		<s:textarea name="duierClass.duierClassNote" cssStyle="width:100%; height:100%;"></s:textarea>
        </div>
    </div>
    <div style="width:500px; height:100px; text-align:right; line-height:100px;">
    	<a class="submitForm" href="javascript:void(0);" style="font-size:16px; padding:5px 15px; background-color:#1574B8; color:#FFF; text-decoration:none; border-radius:5px;">添加</a>
    </div>
</div>
</form>
</body>
</html>