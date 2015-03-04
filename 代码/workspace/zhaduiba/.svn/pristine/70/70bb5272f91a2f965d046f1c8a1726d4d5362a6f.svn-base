<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'test.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
	<script type="text/javascript">
	$(function(){
		/* $("a").click(function(){
			$.ajax({url:"testJson",
			success:function(data){
				//var jsonData=jQuery.parseJSON(data);
				//alert(data);
				var json = '[{"id":"1","tagName":"apple"},{"id":"2","tagName":"orange"},{"id":"3","tagName":"banana"},{"id":"4","tagName":"watermelon"},{"id":"5","tagName":"pineapple"}]';
				$.each(json, function(i, item){
					alert(item.tagName);
				});
			}
			});
		}); */
		var json = '[{"id":"1","tagName":"apple"},{"id":"2","tagName":"orange"},{"id":"3","tagName":"banana"},{"id":"4","tagName":"watermelon"},{"id":"5","tagName":"pineapple"}]';
		$.each(json, function(i, item){
			alert(item.tagName);
		});
	});
	</script>
  </head>
  <body>
    <a href="javascript:void(0);">get</a>
  </body>
</html>
