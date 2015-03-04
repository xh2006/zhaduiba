<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib  prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>登录网站后台</title>
<link href="<% out.print(basePath); %>/zhadui8admin/css/bg_login.css"  rel="stylesheet" type="text/css"/>
<link href="<% out.print(basePath); %>/zhadui8admin/css/style.css"  rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="<% out.print(basePath); %>/zhadui8admin/js/jquery-1.11.1.js"></script>
<script type="text/javascript" src="<% out.print(basePath); %>/zhadui8admin/js/Validform_v5.3.2_min.js"></script>
<script type="text/javascript" src="<% out.print(basePath); %>/zhadui8admin/js/jquery.md5.js"></script>
<script type="text/javascript">
$(function(){
	var winHeight=$(window).height();
	var winWidth=$(window).width();
	if(winHeight<($("#header").height()+$("#login_main_top").height()+$("#login_main_center").height())){
		$("#bg_login_all").height($("#header").height()+$("#login_main_top").height()+$("#login_main_center").height()+34);
	}else{
		$("#bg_login_all").height(winHeight);
	}
	$(window).resize(function(){
		var winHeight=$(window).height();
		var winWidth=$(window).width();
		if(winHeight<($("#header").height()+$("#login_main_top").height()+$("#login_main_center").height())){
		$("#bg_login_all").height($("#header").height()+$("#login_main_top").height()+$("#login_main_center").height()+34);
		}else{
			$("#bg_login_all").height(winHeight);
		}
	});
	$(".login_form").Validform({
		btnSubmit:"#login_a",
		tiptype:2,
		tipSweep:true,
		beforeSubmit:function(curform){
			var password=$.md5($("input[name='password']").val());
			$("input[name='password']").val(password);
		}
	});
	if(window.top.location!=window.location){
		window.top.location=window.location;
	}
});
</script>
<script type="text/javascript">
	    function refresh(obj) {
	        obj.src = "<% out.print(basePath); %>/getRandomCode?"+Math.random();
	    }
</script>
</head>
<body>
<div id="bg_login_all">
	<div id="header">
        <div id="header_logo"><img src="<% out.print(basePath); %>/zhadui8admin/images/logo.png" /></div>
        <div id="header_logo_word"><img src="<% out.print(basePath); %>/zhadui8admin/images/logo_word.png" /></div>
	</div>
    <div id="login_main">
    	<div id="login_main_top"></div>
        <div id="login_main_center">
        	<div id="login_main_center_login">
            	<div style="width:562px; height:40px;"></div>
                <div style="width:329px; height:33px; margin:0px auto; background:url(<% out.print(basePath); %>/zhadui8admin/images/login_title_bg.png);">
                	<div style="width:30px; height:30px; float:left; margin-left:10px; margin-top:2px;"><img src="<% out.print(basePath); %>/zhadui8admin/images/people.png" /></div>
                    <div style="width:30px; height:30px; float:left; margin-left:10px; margin-top:7px;"><img src="<% out.print(basePath); %>/zhadui8admin/images/zde.png" /></div>
                </div>
                <div style="width:562px; height:10px;"></div>
                <form class="login_form" method="post" action="adminLogin">
                <div style="width:562px; height:50px;">
                	<div style="width:300px; height:35px; margin:0px auto; line-height:35px; font-size:18px;">
                    	用户名：<s:textfield cssClass="input_text" name="adminUser" type="text" datatype="*" nullmsg="请输入用户名"></s:textfield><!-- <input class="input_text" name="adminUser" type="text" datatype="*" nullmsg="请输入用户名" /> -->
                    </div>
                    <div style=" height:15px; width:200px; margin:0px auto;"><s:fielderror cssClass="error_mind" fieldName="accountError"></s:fielderror></div>
                </div>
                <div style="width:562px; height:50px;">
                	<div style="width:300px; height:35px; margin:0px auto; line-height:35px; font-size:18px;">
                    	<span style="display:block; width:72px; float:left; text-align:right;">密码：</span><s:password cssClass="input_text" name="password" type="password" datatype="*" nullmsg="请输入密码"></s:password><!-- <input class="input_text" name="password" type="password" datatype="*" nullmsg="请输入密码" /> -->
                    </div>
                    <div style=" height:15px; width:200px; margin:0px auto;"><s:fielderror cssClass="error_mind" fieldName="pwdError"></s:fielderror></div>
                </div>
                <div style="width:562px; height:50px;">
                	<div style="width:300px; height:35px; margin:0px auto; line-height:35px; font-size:18px;">
                    	验证码：<input name="validateCode" style="width:80px; height:25px;" type="text"  datatype="*" nullmsg="请输入验证码" sucmsg="格式校验正确" />
                        <img style="vertical-align:middle;" title="点击切换" onclick="javascript:refresh(this);" src="<% out.print(basePath); %>/getRandomCode" />
                    </div>
                    <div style=" height:15px; width:200px; margin:0px auto;"><s:fielderror cssClass="error_mind" fieldName="codeError"></s:fielderror></div>
                </div>
                <div style="width:562px; height:10px;"></div>
                <div style="width:562px; height:40px;">
                	<div style="width:200px; height:40px; line-height:40px; margin:0px auto; text-align:center;">
                    	<a id="login_a" href="javascript:void(0);"><img src="<% out.print(basePath); %>/zhadui8admin/images/login_btn.png" /></a>
                        <a class="login_forget_a" href="javascript:void(0);"><img src="<% out.print(basePath); %>/zhadui8admin/images/forgetP_login.png" /></a>
                    </div>
                </div>
                </form>
                
            </div>
        </div>
    </div>
</div>
</body>
</html>