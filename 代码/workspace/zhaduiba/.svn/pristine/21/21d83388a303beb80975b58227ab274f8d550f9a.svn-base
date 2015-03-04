<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
 	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>My JSP 'ad_list.jsp' starting page</title>
    <link href="css/data_table.css" rel="stylesheet" type="text/css" />
    <style type="text/css">
    	.search li{
    		list-style: none;
    		float: left;
    		height: 50px;
    		line-height: 50px;
    		font-size: 16px;
    	}
    	.inputText{
    		height: 20px;
    		width: 150px;
    		font-size: 15px
    	}
    	.inputSelect{
    		height: 20px;
    		width: 100px;
    		font-size: 14px;
    		text-align: center;
    	}
    	a { color:#333; text-decoration:none;}
		ul { list-style:none; font-size: 14px;font-family:Verdana;}
		#pagelist {width:400px; margin:0px; padding:6px 0px; height:20px;}
		#pagelist ul li { float:left; border:1px solid #5d9cdf; height:20px; line-height:20px; margin:0px 2px;}
		#pagelist ul li a, .pageinfo { display:block; padding:0px 6px; background:#e6f2fe;}
		.pageinfo  { color:#555;}
		.current { background:#a9d2ff; display:block; padding:0px 6px; font-weight:bold;}
    </style>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="js/jquery-1.11.1.js"></script>
	<script type="text/javascript" src="js/Validform_v5.3.2_min.js"></script>
	<script type="text/javascript">
		$(function(){
			$("#searchDuierForm").Validform({
				btnSubmit:"#searchBtn",
				tiptype:1,
				tipSweep:true
				}); 
		});
	</script>
</head>
<body>
<div style="height:50px; width:500px;">
	<a href="javascript:void(0);"><img style="margin-top:10px; margin-left:10px;" src="images/add.png" /></a>
</div>
<div>
<table class="data_table" border="1" cellpadding="0" cellspacing="0">
	<tr style="height: 50px;" class="search">
		<td colspan="8">
			<form action="" method="post" id="searchDuierForm">
			<ul>
				<li style="margin-left: 10px;">名称：<s:textfield  name="duierName" cssClass="inputText" ></s:textfield></li>
				<li style="margin-left: 10px;">状态：<s:select  name="duierStatus" cssClass="inputSelect" list="#{999:'全部',0:'已失败',1:'参与中',2:'活动中',3:'已完成'}"></s:select></li>
				<li style="margin-left: 10px;">人数：<input name="peopleNum" datatype="n" value="0"  ignore="ignore" errormsg="人数应该为数字格式"  class="inputText" style="width: 50px;" type="text" /></li>
				<li style="margin-left: 20px;"><a id="searchBtn" href="javascript:void(0);" style="padding: 5px 10px; border-radius:5px; background-color: #1574B8; color:#FFF; font-size: 14px;">检索</a></li>
			</ul>
			</form>
		</td>
	</tr>
	<tr class="t_head">
    	<td width="21%">堆名称</td>
        <td width="20%">创建时间</td>
        <td width="20%">最近操作时间</td>
        <td width="7%">人数</td>
        <td width="7%">状态</td>
        <td width="10%">活动地点</td>
        <td width="15%" colspan="2">操作</td>
    </tr>
    <s:iterator value="duierList" var="duier">
	<tr>
    	<td><s:property value="#duier.duierInfoName" /></td>
        <td><s:date name="#duier.duierInfoCreateTime" format="yy/MM/dd hh:mm"/></td>
        <td><s:date name="#duier.duierInfoUpdateTime" format="yy/MM/dd hh:mm"/></td>
        <td><s:property value="#duier.duierInfoLowlimitPerson" />-<s:property value="#duier.duierInfouplimitPerson" /></td>
        <td>
        	<s:if test="#duier.duierInfoActivityStatus==0">已失败</s:if>
        	<s:elseif test="#duier.duierInfoActivityStatus==1">参与中</s:elseif>
        	<s:elseif test="#duier.duierInfoActivityStatus==2">活动中</s:elseif>
        	<s:else>完成</s:else>
        </td>
        <td><s:property value="#duier.duierInfoLocation" /></td>
        <td><a href="javascript:void(0);">查看</a></td>
        <td><a href="javascript:void(0);">删除</a></td>
    </tr>
    </s:iterator>
</table>
</div>
<div id="pagelist">
  <ul>
    <li>
    	<form name="firstPageForm" action="toDuierList" method="post">
    	<input type="hidden" name="duierName" value="<s:property value='duierName'></s:property>" />
    	<input type="hidden" name="duierStatus" value="<s:property value='duierStatus'></s:property>" />
    	<input type="hidden" name="peopleNum" value="<s:property value='peopleNum'></s:property>" />
    	<input type="hidden" name="currentPage" value="1" />
    		<a onclick="javascript:document.firstPageForm.submit();" href="javascript:void(0)">首页</a>
    	</form>
    </li>
    <s:if test="currentPage==1">
    	<li><a href="javascript:void(0);">上页</a></li>
    </s:if>
    <s:else>
    	<li>
    		<form name="prePageForm" action="toDuierList" method="post">
    		<input type="hidden" name="duierName" value="<s:property value='duierName'></s:property>" />
	    	<input type="hidden" name="duierStatus" value="<s:property value='duierStatus'></s:property>" />
	    	<input type="hidden" name="peopleNum" value="<s:property value='peopleNum'></s:property>" />
	    	<input type="hidden" name="currentPage" value="<s:property value='currentPage-1'></s:property>" />
    		<a  onclick="javascript:document.prePageForm.submit();" href="javascript:void(0);">上页</a>
    		</form>
    	</li>
    </s:else>
    <s:if test="currentPage==totalPage">
    	<li><a href="javascript:void(0);">下页</a></li>
    </s:if>
    <s:else>
    	<li>
    		<form name="nextPageForm" action="toDuierList" method="post">
    		<input type="hidden" name="duierName" value="<s:property value='duierName'></s:property>" />
	    	<input type="hidden" name="duierStatus" value="<s:property value='duierStatus'></s:property>" />
	    	<input type="hidden" name="peopleNum" value="<s:property value='peopleNum'></s:property>" />
	    	<input type="hidden" name="currentPage" value="<s:property value='currentPage+1'></s:property>" />
    		<a  onclick="javascript:document.nextPageForm.submit();" href="javascript:void(0);">下页</a>
    		</form>
    	</li>
    </s:else>
    <li>
    	<form name="lastPageForm" action="toDuierList" method="post">
    	<input type="hidden" name="duierName" value="<s:property value='duierName'></s:property>" />
    	<input type="hidden" name="duierStatus" value="<s:property value='duierStatus'></s:property>" />
    	<input type="hidden" name="peopleNum" value="<s:property value='peopleNum'></s:property>" />
    	<input type="hidden" name="currentPage" value="<s:property value='totalPage'></s:property>" />
    	<a  onclick="javascript:document.lastPageForm.submit();" href="javascript:void(0);">尾页</a>
    	</form>
    </li>
    <li class="pageinfo">第<s:property value="currentPage" />页</li>
    <li class="pageinfo">共<s:property value="totalPage" />页</li>
  </ul>
</div>
</body>
</html>
    