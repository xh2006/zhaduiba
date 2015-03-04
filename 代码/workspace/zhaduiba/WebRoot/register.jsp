<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!doctype html>
<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

	<title>扎堆吧  注册</title>
	<meta name="description" content="">
	<meta name="author" content="">
	<meta name="viewport" content="">
	<link href="css/base.css" type="text/css" rel="stylesheet" />
	<link href="css/style.css" type="text/css" rel="stylesheet" />
	
	<style type="text/css">

		body{
			background-image:url('images/reg/bg_body.jpg');
		}
		#page{
			margin:0px auto;
			width:1000px;
			position:relative;
		}
		#pageHeader{
			height:100px;
			padding:10px;
		}
		#pageBody{
			height:450px;
			padding:10px;
		}
		#pageFooter{
			
		}
		#showImg{
			width:500px;
			height:450px;
			padding-top:30px;
			padding-left:10px;
			float:left;
		}
		#registerBlock{
			background-image:url('images/reg/bg_regBlock1.jpg');
			width:400px;
			height:450px;
			float:right;
			padding-right:30px;
		}
		#regItem{
			
		}
		#regNowBtn{
			width:120px;
			background-image:url('images/reg/regNow.png');
		}
		.inputStyle{
			width:240px;
			height:30px;
			margin-top:8px;
		}
		.verifyCode{
			width:100px;
			font-size:12px;
		}
		.error{
			padding-left:60px;color:red;
			font-size:12px;
		}
	</style>
	<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
	<script type="text/javascript" src="js/Validform_v5.3.2.js"></script>
	<script type="text/javascript" src="js/jquery.md5.js"></script>
	<script type="text/javascript" src="js/jquery.dject.min-2.js"></script>
	<script type="text/javascript">

		$(document).ready(function(){
			$("#regItem").Validform({
				tiptype:4,
				ajaxPost:true,
				beforeSubmit:function(curform){
					$("#pwdFirstInput").val($.md5($("#pwdFirstInput").val()));
					$("#pwdSecondInput").val($("#pwdFirstInput").val());
				},
				callback:function(data){
					if(data.status == 200){
						$("#test").trigger("click");
					}
					else{
						alert("Error！");
					}
				}
			});			
		});
	</script>
	
	<script type="text/javascript">
		function refresh(obj) {
	        obj.src = "getRandomCode?"+Math.random();
	    }
	</script>
	
	<script type="text/javascript">
		$(function(){
			var content = '<div id="content" style="display:block">	<div style="height:60px;padding-left:60px;text-align:left;display:block;">					<img src="images/reg/popSuc.png"><span style="">&nbsp;&nbsp;恭喜你，注册成功！</span>				</div>						<div style="height:140px;display:block;padding-top:20px;">			<span style="color:#38B34B;vertical-align:middle;">扫一扫下载手机端<img src="images/code.jpg" width="137" height="137" style="padding-left:100px;vertical-align:middle;"></img></span>							</div>	<div style="height:60px;">	<a href="fillingInfo"><img src="images/reg/loginNow.png" border="0"></a>			</div>			</div>';
			
			$("#test").djectDialog({
				"title":"提示",
				"titleColor":"#38B34B",
				"width":"600",
				"height":"380",
				"content":content,
				"btnDisplay":"none",
				"closeDisplay":"none"
			});
/*			
			$("#regNowBtn").click(function(){
				var phoneNumber,password;
				phoneNumber = $("#phoneNumberInput").val();
				password = $("#pwdFirstInput").val();
				alert(phoneNumber + "+" + password);
				$.ajax({
					type : 'post',
					url : 'register',
					data : {
						pn : phoneNumber,
						pwd : password
					},
					cache : false,
					dataType : 'json',
					success : function(data) {
						// 解析Json
						
					}
				}); 
			});
*/			
		});
	</script>
</head>

<body>
<div id="page">
	<div id="pageHeader">
		<img src="images/logo.png"><span style="font-size:20px;">注册</span></img>
	</div>
	<div id="pageBody">
		<div id="showImg">
			<img src="images/reg/imgDisplay001.jpg"></img>
		</div>
		<div id="registerBlock">
			<div style="font-size:32px;color:#B3B3B3;">欢迎加入扎堆儿！</div>
			<div><img src="images/reg/splitLine.png" /></div>
			<form id="regItem" action="register_web_front"> 
				<div>
					&nbsp;&nbsp;&nbsp;&nbsp;手机号:
					<input id="phoneNumberInput" class="inputStyle" type="text" name="pn" datatype="/^1[3,4,5,7,8][0-9]{9}/i" ajaxurl="isExisted" errormsg="手机号码不正确！" nullmsg="请填写手机号！" sucmsg="手机号可以使用！"></input><br />
				</div>
	
				<div>
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;密码: 
					<input id="pwdFirstInput" class="inputStyle" type="password" name="pwd" datatype="/^[a-zA-Z]\w{5,17}$/i" errormsg="请输入以字母开始，以字母、数字、！、@、#、_混合组成的密码。" nullmsg="请填写密码！" sucmsg="符合要求"></input><br />
				</div>
				
				<div>
					确认密码: <input id="pwdSecondInput" class="inputStyle" type="password" name="pwd_confirm" datatype="*" recheck="pwd" errormsg="两次密码输入不一致！" nullmsg="请再次输入密码！" sucmsg="输入一致"></input><br />
				</div>

				<div>
					&nbsp;&nbsp;&nbsp;&nbsp;验证码: <input id="" class="inputStyle verifyCode" type="text" datatype="*" nullmsg="请输入验证码！" sucmsg=""></input>
					<img style="vertical-align:middle;" title="点击切换" onclick="javascript:refresh(this);" src="getRandomCode"></img><br />
				</div>
				
				<div>
					手机验证码: <input id="verfyCodeInput" class="inputStyle verifyCode" type="text" name="verfyCode" ajaxurl="verfy"></input>
					<button id="verifyCode" class="inputStyle verifyCode" >点我获取验证码</button><br />
				</div>
				<span id="errShow5" class="error"></span><br>
				<input id="regNowBtn" class="inputStyle" type="submit" value=""></input>		
			</form>
		</div>
	</div>
	<button id="test" style="display:none;">test1</button>
	<div id="pageFooter">
	</div>
</div>
</body>
</html>
