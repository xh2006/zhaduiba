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
<script type="text/javascript" src="js/jquery.md5.js"></script>
<script type="text/javascript">
$(function(){
	
});
</script>
<style type="text/css">
.Osuccess{
	margin:0px auto;
	width:700px;
	height:150px;
	text-align:center;
	font-family:"微软雅黑";
	font-size:36px;
	color:#39F;
}
</style>
</head>
<body>
<div style="height: 50px;"></div>
	<s:if test="updateRemark!=null">
	<div class="Osuccess">
    	密码修改成功！
    </div>
    </s:if>
    <s:else>
	<div id="add_app">
		<s:form action="updatePass" name="add_form"  method="post" cssClass="addAppForm">
		<div class="add_app_top">
			<div>
				<ul>
					<li class="app_title">原密码：</li>
					<li class="app_input"><s:password datatype="*" nullmsg="原密码不能为空" name="oldPassword" cssClass="inputText"></s:password><span
						class="must">*</span>
					</li>
					<li class="app_error"><s:fielderror cssClass="app_error" fieldName="oldError"></s:fielderror></li>
				</ul>
			</div>
			<div>
				<ul>
					<li class="app_title">新密码：</li>
					<li class="app_input"><s:password datatype="*" nullmsg="新密码不能为空" name="newPassword" cssClass="inputText" ></s:password><span
						class="must">*</span>
					</li>
					<li class="app_error"><s:fielderror cssClass="app_error" fieldName="newError"></s:fielderror></li>
				</ul>
			</div>
			<div>
				<ul>
					<li class="app_title">确认密码：</li>
					<li class="app_input"><s:password datatype="*" nullmsg="确认密码不能为空" recheck="newPassword" errormsg="两次密码输入不一致" name="reNewPassword" cssClass="inputText"></s:password><span
						class="must">*</span>
					</li>
					<li class="app_error"><s:fielderror cssClass="app_error" fieldName="reNewError"></s:fielderror></li>
				</ul>
			</div>
			<div>
				<ul>
					<li style="height:80px; line-height:80px; width:500px; text-align:right;">
						<a id="addAppInfo" class="btn_a" href="javascript:void(0);">确认修改</a>
					</li>
				</ul>
				<div></div>
			</div>
		</div>
		</s:form>
	</div>
	</s:else>
<script type="text/javascript">
$(".addAppForm").Validform({
	btnSubmit:"#addAppInfo",
	tiptype:2,
	tipSweep:true,
	beforeSubmit:function(curform){
		var password=$.md5($("input[name='oldPassword']").val());
		$("input[name='oldPassword']").val(password);
		var newPassword=$.md5($("input[name='newPassword']").val());
		$("input[name='newPassword']").val(newPassword);
		var reNewPassword=$.md5($("input[name='reNewPassword']").val());
		$("input[name='reNewPassword']").val(reNewPassword);
	}
});
</script>
</body>
</html>