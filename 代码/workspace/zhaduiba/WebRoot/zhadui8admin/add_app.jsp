<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>添加</title>
<link type="text/css" rel="stylesheet" href="css/add_app.css" />
<link type="text/css" rel="stylesheet" href="css/style.css"/>
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
<script type="text/javascript" src="js/Validform_v5.3.2_min.js"></script>
</head>
<body>
	<div id="add_app">
		<s:form action="addApp" name="add_form"  method="post" cssClass="addAppForm" enctype="multipart/form-data">
		<div class="add_app_top">
			<div>
				<ul>
					<li class="app_title">应用名称：</li>
					<li class="app_input"><s:textfield name="phoneApkName" datatype="*" nullmsg="应用名称不能为空" cssClass="inputText"></s:textfield><span
						class="must">*</span>
					</li>
					<li class="app_error"><s:fielderror cssClass="app_error" fieldName="appNameError"></s:fielderror></li>
				</ul>
			</div>
			<div>
				<ul>
					<li class="app_title">versionName：</li>
					<li class="app_input"><s:textfield name="phoneApkversionName" datatype="*" nullmsg="versionName不能为空" cssClass="inputText" ></s:textfield><span
						class="must">*</span>
					</li>
					<li class="app_error"><s:fielderror cssClass="app_error" fieldName="versionNameError"></s:fielderror></li>
				</ul>
			</div>
			<div>
				<ul>
					<li class="app_title">versionCode：</li>
					<li class="app_input"><s:textfield name="phoneApkversionCode" datatype="n" nullmsg="versionCode不能为空" errormsg="代码版本要求数字格式" cssClass="inputText"></s:textfield><span
						class="must">*</span>
					</li>
					<li class="app_error"><s:fielderror cssClass="app_error" fieldName="versionCodeError"></s:fielderror></li>
				</ul>
			</div>
			<div>
				<ul>
					<li class="app_title">应用APK：</li>
					<li class="app_input"><s:file  name="phoneApk" datatype="/.*.apk$/i" nullmsg="没有选择上传文件" errormsg="不是有效的手机应用"  cssClass="inputText"></s:file><span
						class="must">*</span>
					</li>
					<li class="app_error"><s:fielderror cssClass="app_error" fieldName="appError"></s:fielderror></li>
				</ul>
			</div>
			<div>
				<ul>
					<li class="app_title">应用摘要：</li>
					<li class="app_input" style="height:100px;"><s:textarea  datatype="*" nullmsg="摘要信息不能为空"
							cssStyle="width:300px; height:100px;" name="phoneApkSummary"></s:textarea><span class="must">*</span>
					</li>
					<li class="app_error"><s:fielderror cssClass="app_error" fieldName="appSummaryError"></s:fielderror></li>
				</ul>
			</div>
			<div>
				<ul>
					<li style="height:80px; line-height:80px; width:500px; text-align:right;">
						<a id="addAppInfo" class="btn_a" href="javascript:void(0);">添加</a>
					</li>
				</ul>
				<div></div>
			</div>
		</div>
		</s:form>
	</div>
<script type="text/javascript">
$(".addAppForm").Validform({
	btnSubmit:"#addAppInfo",
	tiptype:2,
	tipSweep:true
});
</script>
</body>
</html>