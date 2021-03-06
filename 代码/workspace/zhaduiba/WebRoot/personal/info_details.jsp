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
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>

</head>
<body>
<div id="main_all">
	<div id="main_title">&nbsp;个人资料</div>
    <div id="main_center">
    	<div style="height:10px; width:839px;"></div>
        <div class="bg">
        	<div style="width: 800px; float:left; height: 25px; font-family: '微软雅黑'; font-size: 15px; margin-left: 30px;">
        		<ul>
        			<li style="list-style: none;">基本&gt;&gt;</li>
        			<li style="list-style: none; border-bottom: 1px dotted #53868B;"></li>
        		</ul>
        	</div>
        	<div class="pInfo_spDiv">
                	<ul>
                    	<li class="first_li">昵称：</li>
                        <li class="sec_li"><s:property value="userInfo.userInfoName" /></li>
                        <li class="first_li">性别：</li>
                        <li class="sec_li">
                        <s:if test="userInfo.userInfoSex==1">男</s:if>
                		<s:else>女</s:else>
                        </li>
                    </ul>
                </div>
            <div class="pInfo_spDiv">
            	<ul>
                	<li class="first_li">出生日期：</li>
                    <li class="sec_li"><s:date name="userInfoDetail.userInfoDetailBornTime" format="yyyy年MM月dd日" /></li>
                    <li class="first_li">婚姻状况：</li>
                    <li class="sec_li">
                    <s:if test="userInfoDetail.userInfoDetailMarriageStatus==0">未婚</s:if>
                    <s:else>已婚</s:else>
                    </li>
                </ul>
            </div>
            <div class="pInfo_center_spDiv">
                <ul>
                    <li class="first_li">家乡：</li>
                    <li class="sec_li"><s:property value="userInfoDetail.userInfoDetailHometown" /></li>
                </ul>
            </div>
            <div style="width: 800px; float:left; height:25px; font-family: '微软雅黑'; font-size: 15px; margin-left: 30px;">
        		<ul>
        			<li style="list-style: none;">扩展&gt;&gt;</li>
        			<li style="list-style: none; border-bottom: 1px dotted #53868B;"></li>
        		</ul>
        	</div>
        	<div class="pInfo_spDiv">
                	<ul>
                    	<li class="first_li">职业：</li>
                        <li class="sec_li"><s:property value="userInfoDetail.userInfoDetailVocation" /></li>
                        <li class="first_li">学历：</li>
                        <li class="sec_li"><s:property value="userInfoDetail.userInfoDetailEducationStatus" /></li>
                    </ul>
                </div>
        	<div id="pInfo_center">
        	<div style="width: 800px; float:left; height:25px; font-family: '微软雅黑'; font-size: 15px; margin-left: 30px;">
        		<ul>
        			<li style="list-style: none;">安全&gt;&gt;</li>
        			<li style="list-style: none; border-bottom: 1px dotted #53868B;"></li>
        		</ul>
        	</div>
        	<div class="pInfo_spDiv">
            	<ul>
                	<li class="first_li">邮箱：</li>
                    <li class="sec_li"><s:property value="userInfo.userInfoEmail" /></li>
                    <li class="first_li">手机：</li>
                    <li class="sec_li"><s:property value="userInfo.userInfoPhoneNumber" /></li>
                </ul>
            </div>
            <div style="width: 800px; float:left; height:25px; font-family: '微软雅黑'; font-size: 15px; margin-left: 30px;">
        		<ul>
        			<li style="list-style: none;">个性&gt;&gt;</li>
        			<li style="list-style: none; border-bottom: 1px dotted #53868B;"></li>
        		</ul>
        	</div>
            <div class="pInfo_center_spDiv">
                <ul>
                    <li class="first_li">个性签名：</li>
                    <li class="sec_li"><s:property value="userInfoDetail.userInfoDetailSignal" /></li>
                </ul>
            </div>
            <div class="pInfo_center_spDiv">
                <ul>
                    <li class="first_li">爱好：</li>
                    <li class="sec_li"><s:property value="userInfoDetail.userInfoDetailHobby" /></li>
                </ul>
            </div>
            <div class="pInfo_center_spDiv">
                <ul>
                    <li class="first_li">自我介绍：</li>
                    <li class="sec_li"><s:property value="userInfoDetail.userInfoDetailSelfIntroduction" /></li>
                </ul>
            </div>
        </div>
        </div>
	</div>
</div>
</body>
</html>

