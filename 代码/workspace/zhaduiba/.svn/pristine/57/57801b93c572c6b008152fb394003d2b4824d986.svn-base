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
    <title>广告列表</title>
    <link href="css/data_table.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="js/jquery-1.11.1.js"></script>
    <script type="text/javascript">
    $(function(){
    	$(".ad_delete").click(function(){
    		window.location.href="deleteAd?adId="+$(this).attr("src");
    	});
    });
    </script>
</head>
<body>
<div style="height:50px; width:500px;">
	<a href="toAddAd"><img style="margin-top:10px; margin-left:10px;" src="images/add.png" /></a>
</div>
<div>
<table class="data_table" border="1" cellpadding="0" cellspacing="0">
	<tr class="t_head">
    	<td width="30%">显示图片</td>
        <td width="10%">显示设备</td>
        <td width="30%">图片摘要</td>
        <td width="30%" colspan="2">操作</td>
    </tr>
    <s:iterator value="adList" var="ad">
	<tr class="data_table_row">
    	<td><img src="<s:property value='#ad.duierClassImageUrl'/>" /></td>
        <td>
        	<s:if test="#ad.duierClassImageType==0">
        		手机
        	</s:if>
        	<s:else>
        		电脑
        	</s:else>
        </td>
        <td><s:property value="#ad.duierClassImageSummary"/></td>
        <td><a target="blank" href="<s:property value='#ad.duierClassImageInfoUrl'/>">查看</a></td>
        <td><a class="ad_delete" href="javascript:void(0);" src="<s:property value='#ad.duierClassImageId'/>">删除</a></td>
    </tr>
    </s:iterator>
</table>
</div>
</body>
</html>
    