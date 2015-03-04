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
        <div style="width:839px;">
        	<div style="width:800px; height:40px; line-height:40px; font-size:18px; font-family:'微软雅黑'; text-align:left; margin-left:20px;">修改手机</div>
            <s:if test="updateRemark==1">
            <div id="update_phone_1" style="width:670px; margin:0px auto;">
            	<div style="width:670px; height:45px;">
                	<img src="images/update_phone_1.png" />
                </div>
                <form action="sendUpdateValidMsg" method="post" id="sendUpdateMsgForm">
                <div>
                	<div class="u_pwd_splDiv">
                        <ul>
                            <li class="first_li">新手机号码：</li>
                            <li class="sec_li"><s:textfield datatype="/^1[3,4,5,7,8][0-9]{9}$/i" nullmsg="手机号码不能为空" errormsg="手机号码格式不正确" name="newPhone"></s:textfield></li>
                            <li class="error" style="font-size:14px;"><s:fielderror fieldName="phoneError"></s:fielderror></li>
                        </ul>
                    </div>
                    <div class="u_pwd_splDiv">
                        <ul>
                            <li class="first_li">登录密码：</li>
                            <li class="sec_li"><input datatype="/[\w\W]{6,20}/i" nullmsg="登陆密码不能为空" errormsg="密码格式不正确" name="loginPwd" type="password" /></li>
                            <li class="error" style="font-size:14px;"><s:fielderror fieldName="pwdError"></s:fielderror></li>
                        </ul>
                    </div>
                    <div class="u_pwd_splDiv" style="height:80px;">
                        <ul>
                            <li style="width:400px; height:80px; line-height:80px; text-align:right;"><a id="send_msg" href="javascript:void(0);"><img style="border:none; vertical-align:middle;" src="images/send_msg.png" /></a></li>
                        </ul>
                    </div>
                </div>
                </form>
                <script type="text/javascript">
				$(function(){
					$("#sendUpdateMsgForm").Validform({
						btnSubmit:"#send_msg",
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
            </div>
            </s:if>
            <s:elseif test="updateRemark==2">
            <div id="update_phone_2" style="width:670px; margin:0px auto;">
            	<div style="width:670px; height:45px;">
                	<img src="images/update_phone_2.png" />
                </div>
                <form action="checkValidCode" method="post" id="validCodeForm">
                <s:hidden name="newPhone"></s:hidden>
                <div>
                	<div class="u_pwd_splDiv">
                        <ul>
                            <li class="first_li">验证码：</li>
                            <li class="sec_li"><input name="validCode" datatype="n4-4" nullmsg="验证码不能为空" errormsg="验证码格式不正确" type="text" /></li>
                            <li class="error" style="font-size:14px;"><s:fielderror fieldName="validCodeError"></s:fielderror> </li>
                        </ul>
                    </div>
                    <div class="u_pwd_splDiv" style="height:80px;">
                        <ul>
                            <li style="width:400px; height:80px; line-height:80px; text-align:right;"><a id="phone_v_ok" href="javascript:void(0);"><img style="border:none; vertical-align:middle;" src="images/phone_confirm.png" /></a></li>
                        </ul>
                    </div>
                </div>
                </form>
                <script type="text/javascript">
				$(function(){
					$("#validCodeForm").Validform({
						btnSubmit:"#phone_v_ok",
						tiptype:2,
						tipSweep:true
					});
				});
				</script>
            </div>
            </s:elseif>
            <s:else>
            <div id="update_phone_3" style="width:670px; margin:0px auto;">
            	<div style="width:670px; height:45px;">
                	<img src="images/update_phone_3.png" />
                </div>
                <div style="width:362px; height:171px; margin:0px auto; margin-top:50px;">
                	<img src="images/phone_ok.jpg" />
                </div>
            </div>
            </s:else>
        </div>
	</div>
</div>
</body>
</html>
