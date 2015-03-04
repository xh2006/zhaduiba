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
<script type="text/javascript">
$(function(){
	$(".top_nav").click(function(){
		$this=$(this);
		$(".sec_nav").each(function(index, element) {
            $(this).slideUp();
			$(this).prev(".top_nav").children("img").attr("src","images/friend_list_up.png");
        });
		$(this).next(".sec_nav").slideDown();
		$(this).children("img").attr("src","images/friend_list_down.png");
	});
});
</script>
</head>
<body style="overflow:hidden;">
<div id="main_all">
	<div id="main_title">&nbsp;已扎的堆</div>
    <div id="main_center">
    	<div id="main_center_left">
        	<div style="height:5px;"></div>
        	<div id="main_left_content">
        		<s:iterator value="duierStatusList" var="duierstatus">
        			<ul class="duier_content">
                	<li class="content_title"><s:property value="#duierstatus.duierStatusDuier.duierInfoName" /></li>
                    <li class="content_line"></li>
                    <li class="content_duier">
                    <s:if test="%{null!=#duierstatus.duierStatusDuier.duierInfoActivityIntroduction && #duierstatus.duierStatusDuier.duierInfoActivityIntroduction.length()>150}">
                    	<s:property value="%{#duierstatus.duierStatusDuier.duierInfoActivityIntroduction.substring(0, 150)}" />...
                    </s:if>
                    <s:else>
                    	<s:property value="%{#duierstatus.duierStatusDuier.duierInfoActivityIntroduction}" />
                    </s:else>
                    </li>
                </ul>
        		</s:iterator>
            </div>
        </div>
        <%-- <div id="main_center_right">
        	<div style="height:5px;"></div>
        	<div id="friend_title"><span style="margin-left:20px;">我的好友</span>(<span>0</span>)</div>
            <div id="friend_search">
            	<input class="friend_search_input" type="text" />
            </div>
            <div id="friend_list">
            	<ul class="nav_top_ul">
                	<li>
                    	<a class="top_nav" href="javascript:void(0);"><img src="images/friend_list_down.png" />该功能正在完善(<span>0</span>)</a>
                        <ul class="sec_nav">
                        </ul>
                    </li>
                </ul>
            </div>
        </div> --%>
    </div>
</div>
</body>
</html>
