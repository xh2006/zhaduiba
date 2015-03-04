<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>扎堆吧</title>
<link href="css/base.css" type="text/css" rel="stylesheet" />
<link href="css/head.css" type="text/css" rel="stylesheet" />
<style type="text/css">
	#finish{
		float:right;
		margin-top:10px;
		margin-right:140px;
	}
	#footer{
		width:1000px;
		margin:0 auto;
		text-align:center;
		padding:10px;
	}
	.inputStyle{
		width:100px;
		height:22px;
		margin:3px;
	}
	#introduce{
		width:840px;height:200px;
	}

</style>
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
<script type="text/javascript" src="js/WdatePicker/WdatePicker.js"></script>
<script type="text/javascript">

		$(document).ready(function(){
			$("#introduce").keyup(function(){
				var len = ($("#introduce").val()).length;
				$("#wordSum").text(len + '/500');
			});
			
			$("#finish").click(function(){
				$("#save").trigger("click");
			});
			
		});
		

</script>

</head>
<body>
<!--网站头部begin-->
<div id="head">
	<div id="head_main">
    	<div id="head_main_left_logo"></div>
        <div id="head_main_left_world"></div>
        <div id="head_main_left_empty"></div>
        <div id="head_main_center_search_input">
        	<input id="search_input" type="text" />
        </div>
        <div id="head_main_center_search_btn">
        	<input id="search_btn" type="button" />
        </div>
        <div id="head_main_right_phone"></div>
        <div id="head_main_right_login">
        	<div id="head_main_right_login_a">
				<s:if test="#session.zhadui_loginStatus!=null">
					<a href="personal/toPersonalCenter">个人主页</a>&nbsp;|&nbsp;<a href="logout_web">退出</a>
				</s:if>
				<s:else>
					<a href="login">登录</a>&nbsp;|&nbsp;<a href="register">注册</a>
				</s:else>
			</div>
        </div>
    </div>
</div>
<!--网站头部end-->
<!--导航栏begin-->
<div id="nav">
	<div id="nav_main">
    	<ul>
			<li><a class="nav_link" href="category?id=1">扎堆</a></li>
			<li><a class="nav_link" href="category?id=2">运动</a></li>
			<li><a class="nav_link" href="category?id=3">任性</a></li>
			<li><a class="nav_link" href="category?id=4">去野</a></li>
			<li><a class="nav_link" href="category?id=5">小聚</a></li>
			<li><a class="nav_link" href="category?id=6">小钱</a></li>
			<li><a class="nav_link" href="category?id=7">二手</a></li>
			<li><a class="nav_link" href="category?id=8">教育</a></li>
			<li><a class="nav_link" href="category?id=9">爱心</a></li>
			<li><a class="nav_link" href="category?id=10">联谊</a></li>
        </ul>
    </div>
</div>
<div id="" style="width:1000px;height:1300px;margin:0px auto;">
	<div style="height:40px;margin:10px;">
		<span style="font-size:28px;color:#000000;">垒堆儿</span>
	</div>
	<div style="height:600px;background-color:#FFFFFF">
		<form action="createDuier" method="post" style="padding:30px;">
			堆儿名: <input class="inputStyle" name="duier.duierInfoName" type="text" style="width:200px;"></input><br />
			开始时间: <input id="t_s" class="inputStyle" name="duier.duierInfoStartTime" type="text" onFocus="WdatePicker({minDate:'%y-%M-%d'})"></input>
			结束时间: <input id="t_e" class="inputStyle" name="duier.duierInfoEndTime" type="text" onFocus="WdatePicker({minDate:'#F{$dp.$D(\'t_s\')}'})"></input><br />
			地点: <input class="inputStyle" name="duier.duierInfoLocation" type="text" style="width:280px;"></input><br />
			费用: <input class="inputStyle" name="duier.duierInfoActivityFee" type="text"></input><br />
			人数下限: <input class="inputStyle" name="duier.duierInfoLowlimitPerson" type="text"></input>
			人数上限: <input class="inputStyle" name="duier.duierInfouplimitPerson" type="text"></input><br />
			活动属于: 
				<s:select list="duierClassList"  listKey="duierClassId" listValue="duierClassName" name="duier.duierInfoClass.duierClassId"></s:select>
			<br />
			<div style="margin-top:3px;margin-bottom:3px;">
				是否需要承接人: <input type="radio" name="duier.duierInfoNeedUndertaker" value="1"> 是&nbsp;&nbsp;<input type="radio" name="duier.duierInfoNeedUndertaker" value="0" checked> 否<br />
			</div>
			<span>内容:</span><span id="wordSum" style="float:right;margin-right:100px;">0/500</span>
			<div>
				<textarea name="duier.duierInfoActivityIntroduction" id="introduce" placeholder="文字输入请不要超过500个。"></textarea><br />
			</div>
			<a id="finish" href="javascript:void(0);"><img src="images/finish.png" /></a>
			<input id="save" type="submit" style="display:none;"></input>
		</form>
	</div>
</div>
<!--  
<div id="footer">
	<a href="javascript:void(0);">页尾</a>
	<a href="javascript:void(0);">页尾</a>
	<a href="javascript:void(0);">页尾</a>
	<a href="javascript:void(0);">页尾</a>
	<a href="javascript:void(0);">页尾</a>
</div>
-->
</body>
</html>


