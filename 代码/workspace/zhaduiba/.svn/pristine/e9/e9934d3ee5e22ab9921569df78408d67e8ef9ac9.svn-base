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
    <title>主题列表</title>
    <link href="css/data_table.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
<script type="text/javascript" src="js/jquery.dject.min-1.js"></script>
<script type="text/javascript">
$(function(){
	$(".downloadA").click(function(){
		var sss=$(this).attr("src");
		window.open("../downloadApk?downloadPath="+sss);
	});
});
</script>
</head>
<body>
<div style="width:100%; height:50px;">
	
</div>
<div style="width:100%; height:100%;">
<table class="data_table" cellpadding="0" cellspacing="0" border="1">
	<tr class="t_head">
    	<td width="30%">应用名称</td>
        <td width="10%">应用版本</td>
        <td width="10%">代码版本</td>
        <td width="25%">更新时间</td>
        <td colspan="2" width="25%">操作</td>
    </tr>
    <s:iterator value="appList" var="app">
    <tr>
    	<td title="<s:property value='#app.appInfoSummary'/>"><s:property value="#app.appInfoName" /></td>
    	<td><s:property value="#app.appInfoVersionName" /></td>
    	<td><s:property value="#app.appInfoVersionCode" /></td>
    	<td><s:date name="#app.appInfoUpdateTime" format="yy/MM/dd hh:mm" /></td>
    	<td><a href="deleteApp?phoneApkId=<s:property value='#app.appInfoId'/>">删除</a></td>
    	<td><a class="downloadA" href="javascript:void(0);" src="<s:property value='#app.appInfoDownloadUrl'/>" target="_top">下载</a></td><%-- downloadPath=<s:property value='#app.appInfoDownloadUrl'/> --%>
    </tr>
    </s:iterator>
</table>
</div>
</body>
</html>