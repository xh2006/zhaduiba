<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link type="text/css" href="css/add_ad.css" rel="stylesheet"/>
<script type="text/javascript" charset="utf-8" src="../ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="../ueditor/ueditor.all.min.js"> </script>
<script type="text/javascript" charset="utf-8" src="../ueditor/lang/zh-cn/zh-cn.js"></script>
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
<script type="text/javascript" src="js/Validform_v5.3.2_min.js"></script>
<script type="text/javascript" src="js/uploadPreview.min.js"></script>
<script type="text/javascript">
$(function(){
	$(".addAddForm").Validform({
		btnSubmit:"#add_ad_submit",
		tiptype:2,
		tipSweep:true,
		beforeSubmit:function(curform){
			var content = UE.getEditor('editor').hasContents();
			if(content){
				return true;
			}else{
				alert("编辑内容不能为空");
				return false;
			}
		}
	});
	new uploadPreview({ UpBtn: "inputFile", DivShow: "add_ad_img_right", ImgShow: "show_img" });
});
</script>
</head>

<body style="overflow-x:hidden; ">
<form action="addAd" method="post" class="addAddForm" enctype="multipart/form-data">
<div id="add_bg_all">
	<div id="add_bg_main">
    	<div id="add_ad_position">
        	<ul>
            	<li style="width:140px; text-align:right; margin-right:10px;">广告显示设备:</li>
                <li style="width:400px;">
                	<select name="imagesType">
                    	<option value="0">显示在手机设备</option>
                        <option value="1">显示在电脑设备</option>
                    </select>
                </li>
            </ul>
        </div>
        <div id="add_ad_img">
        	<div id="add_ad_img_left">
            	<ul>
                	<li style="width:140px; height:40px; line-height:40px; text-align:right; margin-right:10px;">广告图片:</li>
                    <li style="width:400px; height:40px; line-height:40px;">
                    	<input id="inputFile" name="image" datatype="/\w*(.JPEG|.jpeg|.JPG|.jpg|.GIF|.PNG|.png)$/i" nullmsg="请选择要上传的图片" errormsg="上传图片格式不正确" type="file"  style="width:300px; height:24px;"/>
                    </li>
                    <li class="error" style="width:500px; margin-left:100px;"><s:fielderror cssClass="error" fieldName="imageError"></s:fielderror></li>
                    <li style="width:140px; height:40px; line-height:40px; text-align:right; margin-right:10px;">图片摘要:</li>
                    <li style="width:400px;">
                    	<textarea name="imageSummary" datatype="*" nullmsg="请填写上传图片摘要信息"  style="width:100%; font-size:16px; height:80px; margin-top:10px;"></textarea>
                    </li>
                    <li class="error" style="width:500px; margin-left:100px;"><s:fielderror cssClass="error" fieldName="summaryError"></s:fielderror></li>
                </ul>
            </div>
            <div id="add_ad_img_right">
            	<img id="show_img" style="width:100%; height:100%;" src="images/welcome.jpg" />
            </div>
        </div>
        <div id="add_ad_content_title">在此编辑你想要显示的内容</div>
        <!-- <div id="add_ad_content"> -->
        	<!-- <textarea id="editor" name="content" style="width: 100%; height:380px;"></textarea> -->
        	<ul>
        		<li><script type="text/javascript" id="editor" name="content" style="width: 800px; height:380px;"></script></li>
        		<li id="add_ad_btn"><a id="add_ad_submit" href="javascript:void(0);" style="font-size:16px; padding:8px 20px; background-color:#1574B8; color:#FFF; text-decoration:none; border-radius:5px; margin-right: 30px;">添加</a></li>
        	</ul>
        <!-- </div> -->
       <!--  <div id="add_ad_btn">
        	
        </div> -->
    </div>
</div>
</form>
<script type="text/javascript">
	var ue = UE.getEditor('editor',{
		toolbars: [[
			'fullscreen', 'source', '|', 'undo', 'redo', '|',
            'bold', 'italic', 'underline', 'fontborder', 'strikethrough', 'superscript', 'subscript', 'removeformat', 'formatmatch', 'autotypeset', 'blockquote', 'pasteplain', '|', 'forecolor', 'backcolor', 'insertorderedlist', 'insertunorderedlist', 'selectall', 'cleardoc', '|',
            'rowspacingtop', 'rowspacingbottom', 'lineheight', '|',
            'customstyle', 'paragraph', 'fontfamily', 'fontsize', '|',
            'directionalityltr', 'directionalityrtl', 'indent', '|',
            'justifyleft', 'justifycenter', 'justifyright', 'justifyjustify', '|', 'touppercase', 'tolowercase', '|',
            'link', 'unlink', 'anchor', '|', 'imagenone', 'imageleft', 'imageright', 'imagecenter', '|',
            'simpleupload', 'emotion', 'scrawl', 'map', 'insertframe', 'insertcode', 'template', 'background', '|',
            'horizontal', 'date', 'time', 'spechars', 'snapscreen', 'wordimage', '|',
            'inserttable', 'deletetable', 'insertparagraphbeforetable', 'insertrow', 'deleterow', 'insertcol', 'deletecol', 'mergecells', 'mergeright', 'mergedown', 'splittocells', 'splittorows', 'splittocols', 'charts', '|', 'searchreplace'
        ]]
	});
</script>
</body>
</html>
