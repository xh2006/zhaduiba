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
<title>个人中心</title>
<link type="text/css" rel="stylesheet" href="css/head.css" />
<style type="text/css">
*{
	margin:0px;
	padding:0px;
}
#personal_all{
	width:1000px;
	margin:0px auto;
	}
#personal_all a{
	text-decoration:none;
	}
#personal_top{
	width:1000px;
	height:260px;
	background:url(images/personal_top_bg.jpg);
	}
#personal_top_left{
	width:160px;
	height:260px;
	float:left;
	text-align:center;
	}
#personal_top_left img{
	width:148px;
	height:147px;
	vertical-align:bottom;
	border: 1px solid #FFF;
	border-radius: 5px;
	}
#personal_top_right{
	width:840px;
	height:260px;
	float:left;
	}
#top_right_top{
	width:840px;
	height:110px;
	}
#top_right_center{
	width:840px;
	height:40px;
	line-height:40px;
	font-size:18px;
	font-family:"微软雅黑";
	color:#FFF;
	font-weight:600;
	}
#top_right_bottom{
	width:840px;
	height:23px;
	line-height:23px;
	/* background:url(images/info_bg2.png); */
	/* background:#CCC; */
	color:#CCC;
	}
#top_right_bottom span{
	display:block;
	float:left;
	font-family:"微软雅黑";
	line-height:23px;
	font-size:14px;
	text-align:left;
	}
.btn_details{
	padding: 1px 8px;
	color: #FFF;
	font-family:"微软雅黑";
	background:url(images/btn_details.png);
	font-size: 15px;
	text-decoration: underline;
	}
#personal_center{
	width:1000px;
	height:500px;
	background-color:#FFF;
	}
#personal_center_left{
	width:160px;
	height:500px;
	float:left;
	border-right:1px solid #CCC;
	}
#center_left_top{
	width:160px;
	height:50px;
	line-height:50px;
	text-align:center;
	font-size:14px;
	font-family:"宋体";
	border-bottom:1px solid #CCC;
	}
#center_left_center{
	width:160px;
	}
#center_left_center ul li{
	width:150px;
	height:30px;
	line-height:30px;
	text-align:left;
	list-style:none;
	margin-left:10px;
}
.nav_icon{
	vertical-align:middle;
	margin-right:8px;
	border:none;
	}
#center_left_center a{
	font-family:"微软雅黑";
	font-size:15px;
	color:#666;
	}
#personal_center_center{
	width:839px;
	height:500px;
	float:left;
	}
</style>
<script type="text/javascript">
if(window.top.location!=window.location){
		window.top.location=window.location;
	}
</script>
</head>
<body> 
<!--网站头部-->
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
					<a href="../logout_web">退出</a>
				</s:if>
				<s:else>
					<a href="login">登录</a>&nbsp;|&nbsp;<a href="register">注册</a>
				</s:else>
            </div>
        </div>
    </div>
</div>
<!--网站头部结束-->
<!--导航栏begin-->
<div id="nav">
    <div id="nav_main">
        <ul>
            <li><a class="nav_link" href="#about">扎堆</a></li>
            <li><a class="nav_link" href="#about">运动</a></li>
            <li><a class="nav_link" href="#about">任性</a></li>
            <li><a class="nav_link" href="#about">去野</a></li>
            <li><a class="nav_link" href="#about">小聚</a></li>
            <li><a class="nav_link" href="#about">小钱</a></li>
            <li><a class="nav_link" href="#about">二手</a></li>
            <li><a class="nav_link" href="#about">教育</a></li>
            <li><a class="nav_link" href="#about">爱心</a></li>
            <li><a class="nav_link" href="#about">联谊</a></li>
        </ul>
    </div>
</div>
<!--导航栏end-->
<div id="personal_all">
	<div id="personal_top">
    	<div id="personal_top_left">
        	<div style="width:100%; height:113px;"></div>
        	<!--用户头像-->
        	<s:if test="userInfo.userInfoHeadImage!=null">
        		<img src="<s:property value='userInfo.userInfoHeadImage' />" />
        	</s:if>
        	<s:else>
        		<img src="images/header.jpg" />
        	</s:else>
        </div>
        <div id="personal_top_right">
        	<div id="top_right_top"></div>
        	<!-- 用户昵称 -->
            <div id="top_right_center"><s:property value="userInfo.userInfoName" /></div>
            <%-- <div id="top_right_bottom">
            	<span><s:property value="userInfoDetail.userInfoDetailSignal" /></span>
            </div> --%>
            <!-- 修改资料按钮 -->
            <div id="top_right_center">
            	<a class="btn_details" href="toInfoDetails" target="main_content">详细资料</a>
            </div>
            <div id="top_right_bottom">
            	<span style="width:20px;">
                <s:if test="userInfo.userInfoSex==1">男</s:if>
                <s:else>女</s:else>
                </span>
                <span>&nbsp;</span>
                <span>
                <%
                	Date date=(Date)request.getAttribute("userInfoDetail.userInfoDetailBornTime");
                	int bronY=date.getYear();
                	int nowY=new Date().getYear();
                	out.print(nowY-bronY);
                 %>
                <%-- <s:property value="userInfoDetail.userInfoDetailVocation" /> --%></span>
            	<%-- <span style=" ">职业：<s:property value="userInfoDetail.userInfoDetailVocation" /></span> --%>
            </div>
            <div id="top_right_bottom">
            	<span>职务：<s:property value="userInfoDetail.userInfoDetailVocation" /></span>
            </div>
            <div id="top_right_bottom">
            	<span><s:property value="userInfoDetail.userInfoDetailHometown" /></span>
            	<%-- <span><s:property value="userInfoDetail.userInfoDetailVocation" /></span>
            	<span>&nbsp;</span>
            	<span><s:property value="userInfoDetail.userInfoDetailHobby" /></span> --%>
                <%-- <s:date name="userInfoDetail.userInfoDetailBornTime" format="yyyy-MM-dd" />  --%>
                <%-- <span>家乡:<s:property value="userInfoDetail.userInfoDetailHometown" /></span> --%>
            </div>
        </div>
    </div>
    <div id="personal_center">
    	<div id="personal_center_left">
        	<div id="center_left_top">
            	<a href="update_head.jsp" target="main_content">更改头像</a>&nbsp;
                <a href="toUpdateInfo" target="main_content">更改资料</a>
            </div>
            <div style="height:20px;"></div>
            <div id="center_left_center">
            	<ul>
                	<li><a href="toJoinedDuierList" target="main_content"><img class="nav_icon" src="images/join_duier.png" />已扎的堆(<span><s:property value="joinedNum" /></span>)</a></li>
                    <li><a href="toCreatedDuierList" target="main_content"><img class="nav_icon" src="images/add_duier.png" />已垒的堆(<span><s:property value="createdNum" /></span>)</a></li>
                    <li><a href="toUndertakeredDuierList" target="main_content"><img class="nav_icon" src="images/undertaked.png" />以承接的堆(<span><s:property value="undertakeredNum" /></span>)</a></li>
                    <li><a href="safe_center.jsp" target="main_content"><img class="nav_icon" src="images/safe_center.png" />安全中心</a></li>
                </ul>
            </div>
        </div>
        <div id="personal_center_center">
        	<iframe name="main_content" frameborder="0" style="width:100%; border:none; height:100%; overflow:hidden;" src="toInfoDetails"></iframe>
        </div>
    </div>
</div>
</body>
</html>

