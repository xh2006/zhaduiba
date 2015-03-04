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
	$(".data_table_delete_a").djectDialog(
		{
			"content":"你确定要删除该主题吗？",
			"callback":function(status,obj){
				if(status=="confirm"){
					location.href=obj.attr("src");
				}
			}
	});
});
</script>
</head>
<body>
<div style="width:100%; height:50px;">
	<a href="toAddTheme"><img style="margin-top:10px; margin-left:10px;" src="images/add.png" /></a>
</div>
<div style="width:100%; height:100%;">
<table class="data_table" cellpadding="0" cellspacing="0" border="1">
	<tr class="t_head">
    	<td width="30%">主题</td>
        <td width="20%">显示顺序</td>
        <td width="20%">热度</td>
        <td colspan="2" width="30%">操作</td>
    </tr>
    <s:iterator value="duierClassList" var="duierclass">
    <tr>
    	<td title="<s:property value='#duierclass.duierClassNote'/>"><s:property value="#duierclass.duierClassName" /></td>
        <td><s:property value="#duierclass.duierClassLayer" /></td>
        <td><s:property value="#duierclass.duierClassHotLevel" /></td>
        <td><a class="data_table_delete_a" href="javascript:void(0);" src="deleteTheme?duierClassId=<s:property value='#duierclass.duierClassId'/>">删除</a></td>
        <td><a class="data_table_update_a" href="toUpdateTheme?duierClassId=<s:property value='#duierclass.duierClassId'/>">编辑</a></td>
    </tr>
    </s:iterator>
</table>
</div>
</body>
</html>