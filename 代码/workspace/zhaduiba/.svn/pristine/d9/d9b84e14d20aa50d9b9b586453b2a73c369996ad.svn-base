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
    <title>主题排序</title>
    <style type="text/css">
*{
	margin:0px;
	padding:0px;
	}
.duierClass_show li{
	list-style:none;
	float:left;
	width:112px;
	height:51px;
	line-height:51px;
	text-align:center;
	font-size:16px;
	color:#FFF;
	font-family:"微软雅黑";
	margin:2px;
	background:url(images/class_bg.png);
	}
.duierClass_update li{
	list-style:none;
	float:left;
	width:112px;
	height:51px;
	line-height:51px;
	text-align:center;
	font-size:16px;
	color:#FFF;
	font-family:"微软雅黑";
	margin:2px;
	cursor:move;
	background:url(images/class_bg.png);
	}
</style>
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
<script type="text/javascript" src="js/jquery.sortable.js"></script>
<script type="text/javascript">
$(function(){
	$(".btn_update_sort").click(function(){
		$(".show_sort").css("display","none");
		$("#update_sort").css("display","block");
	});
	$(".btn_cancle").click(function(){
		$("#update_sort").css("display","none");
		$(".show_sort").css("display","block");
	});
	$(".btn_update").click(function(){
		var result="";
		$(".duierClass_update li").each(function(){
			result+=$(this).attr("id")+",";
		});
		$.ajax({
			url:"sortTheme",
			type:"post",
			data:{"sortStr":result},
			success:function(){
				window.location.href="toSortTheme";
			},
			error:function(){
				alert("排序失败，请稍候重试");
			}
		});
	});
});
</script>
</head>
<body>
<div style="width:100%; height:50px;">
	
</div>
<div class="show_sort">
	<div style="width:600px; height:30px; margin:0px auto; font-size:18px; color:#CCC;">当前显示顺序</div>
    <div style="width:600px; height:200px; margin:0px auto;">
        <ul class="duierClass_show">
        <s:iterator value="duierClassList" var="theme">
            <li id="<s:property value='#theme.duierClassId'/>" sort="<s:property value='#theme.duierClassLayer'/>"><s:property value="#theme.duierClassName" /></li>
        </s:iterator>
        </ul>
    </div>
    <div style="width:600px; height:50px; margin:0px auto; text-align:right; line-height:50px;">
        <a class="btn_update_sort" href="javascript:void(0);" style="font-size:16px; padding:5px 15px; background-color:#1574B8; color:#FFF; text-decoration:none; border-radius:5px;">编辑</a>
    </div>
</div>
<div id="update_sort" style="display:none;">
	<div style="width:600px; height:30px; margin:0px auto; font-size:18px; color:#CCC;">拖动项目排序</div>
	<div style="width:600px; height:200px; margin:0px auto;">
        <ul class="duierClass_update">
        <s:iterator value="duierClassList" var="theme">
            <li id="<s:property value='#theme.duierClassId'/>" sort="<s:property value='#theme.duierClassLayer'/>"><s:property value="#theme.duierClassName" /></li>
        </s:iterator>
        </ul>
    </div>
    <div style="width:600px; height:50px; margin:0px auto; text-align:right; line-height:50px;">
        <a class="btn_update" href="javascript:void(0);" style="font-size:16px; padding:5px 15px; background-color:#1574B8; color:#FFF; text-decoration:none; border-radius:5px;">保存</a>
         <a class="btn_cancle" href="javascript:void(0);" style="font-size:16px; padding:5px 15px; background-color:#1574B8; color:#FFF; text-decoration:none; border-radius:5px;">取消</a>
    </div>
</div>
 <script type="text/javascript">
    $(function(){
		$('.duierClass_update').sortable();
	});
    </script>
</body>
</html>