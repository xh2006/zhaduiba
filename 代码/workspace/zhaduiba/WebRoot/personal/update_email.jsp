<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link type="text/css" rel="stylesheet" href="css/personal_content.css" />
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
<script type="text/javascript" src="js/Validform_v5.3.2_min.js"></script>
<script type="text/javascript" src="js/jquery.md5.js"></script>
</head>
<body>
<div id="main_all">
	<div id="main_title">&nbsp;安全中心</div>
    <div id="main_center">
    	<div style="height:20px;"></div>
    	<form action="updateEmail" id="updateEmailForm" method="post">
        <div style="width:839px;">
        	<div style="width:800px; height:40px; line-height:40px; font-size:18px; font-family:'微软雅黑'; text-align:left; margin-left:20px;">修改邮箱</div>
        	<div class="u_pwd_splDiv">
            	<ul>
                	<li class="first_li">原邮箱：</li>
                    <li class="sec_li"><s:textfield datatype="e" nullmsg="原邮箱不能为空" errormsg="邮箱格式不正确" name="oldEmail"></s:textfield></li>
                    <li class="error" style="font-size:14px;"><s:fielderror fieldName="oldEmailError"></s:fielderror></li>
                </ul>
            </div>
            <div class="u_pwd_splDiv">
            	<ul>
                	<li class="first_li">新邮箱：</li>
                    <li class="sec_li"><s:textfield datatype="e" nullmsg="新邮箱不能为空" errormsg="邮箱格式不正确" name="newEmail"></s:textfield></li>
                    <li class="error" style="font-size:14px;"><s:fielderror fieldName="newEmailError"></s:fielderror></li>
                </ul>
            </div>
            <div class="u_pwd_splDiv">
            	<ul>
                	<li class="first_li">登陆密码：</li>
                    <li class="sec_li"><input name="loginPwd" datatype="/[\w\W]{6,20}/i" name="password" nullmsg="密码不能为空" errormsg="密码格式不正确"  type="password" /></li>
                    <li class="error" style="font-size:14px;"><s:fielderror fieldName="loginPwdError"></s:fielderror></li>
                </ul>
            </div>
            <div class="u_pwd_splDiv">
            	<ul>
                	<li style="width:250px; height:80px; line-height:80px; text-align:right;">
                    	<a href="javascript:void(0);" style="background-color:#B7DB74; padding:6px 35px; text-decoration:none; color:#FFF; font-size:16px; border-radius:10px;">取消</a>
                    </li>
                    <li style="width:150px; height:80px; line-height:80px; text-align:right;">
                    	<a id="updateEmailBtn" href="javascript:void(0);" style="background-color:#B7DB74; padding:6px 35px; text-decoration:none; color:#FFF; font-size:16px; border-radius:10px;">修改</a>
                    </li>
                </ul>
            </div>
        </div>
        </form>
	</div>
</div>
<script type="text/javascript">
$(function(){
	$("#updateEmailForm").Validform({
		btnSubmit:"#updateEmailBtn",
		tiptype:2,
		tipSweep:true,
		beforeSubmit:function(curform){
			$(".error").children().remove();
			var oldPassword=$.md5($("input[name='loginPwd']").val());
			$("input[name='loginPwd']").val(oldPassword);
		}
	});
});
</script>
</body>
</html>
