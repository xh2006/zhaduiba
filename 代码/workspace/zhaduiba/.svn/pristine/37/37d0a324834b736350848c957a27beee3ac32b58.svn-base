<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title></title>
<style type="text/css">
*{
	margin:0px;
	padding:0px;
	}
body{
	overflow-x:hidden;
	}
#left_all{
	width:176px;
	font-family:"微软雅黑";
	}
#left_top{
	width:176px;
	height:10px;
	background:url(images/left_top.png);
	background-repeat:no-repeat;
	}
#left_center{
	width:176px;
	height:400px;
	background:url(images/left_center.png);
	}
#left_center_top{
	width:176px;
	height:51px;
	}
#left_center .top_nav li{
	list-style:none;
	}
.top_nav_a{
	display:block;
	color:#000;
	text-align:center;
	text-decoration:none;
	font-size:16px;
	width:174px;
	height:37px;
	line-height:37px;
	background:url(images/nav_bg.png);
	background-repeat:no-repeat;
	}
.second_nav_a{
	display:block;
	color:#000;
	text-align:left;
	text-decoration:none;
	font-size:16px;
	width:100px;
	height:30px;
	line-height:30px;
	margin-left:60px;
	}
.second_nav_a img{
	border:none;
	}
#left_bottom{
	width:176px;
	height:27px;
	background:url(images/left_bottom.png);
	background-repeat:no-repeat;
	}
</style>
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
<script type="text/javascript">
$(function(){
	$(".top_nav_a").click(function(e) {
		//$(this).next("ul").stop();
		var $this=$(this);
        $(".top_nav_a").next("ul").each(function(index, element) {
            $(this).slideUp();
        });
		$this.next("ul").slideDown();
    });
});
</script>
</head>
<body>
<div id="left_all">
	<div id="left_top"></div>
    <div id="left_center">
    <div id="left_center_top"><img style="margin-left:2px;" src="images/left_center_top.png" /></div>
    	<ul>
        	<li class="top_nav"><a class="top_nav_a" href="javascript:void(0);">主题管理</a>
            	<ul>
                	<li><a class="second_nav_a" href="toThemesList" target="content_iframe"><img src="images/left_nav_mark.png" />主题列表</a></li>
                    <li><a class="second_nav_a" href="toSortTheme" target="content_iframe"><img src="images/left_nav_mark.png" />主题排序</a></li>
                </ul>
            </li>
            <li class="top_nav"><a class="top_nav_a" href="javascript:void(0);">广告管理</a>
            	<ul style="display:none;">
                	<li><a class="second_nav_a" href="toAdList" target="content_iframe"><img src="images/left_nav_mark.png" />广告列表</a></li>
                </ul>
            </li>
            <li class="top_nav"><a class="top_nav_a" href="javascript:void(0);">堆管理</a>
            	<ul style="display:none;">
                	<li><a class="second_nav_a" href="toDuierList" target="content_iframe"><img src="images/left_nav_mark.png" />堆列表</a></li>
                </ul>
            </li>
            <li class="top_nav"><a class="top_nav_a" href="javascript:void(0);">APP管理</a>
            	<ul style="display:none;">
                	<li><a class="second_nav_a" href="toAppList" target="content_iframe"><img src="images/left_nav_mark.png" />历史版本</a></li>
                	<li><a class="second_nav_a" href="toAddApp" target="content_iframe"><img src="images/left_nav_mark.png" />添加新版</a></li>
                </ul>
            </li>
            <li class="top_nav"><a class="top_nav_a" href="javascript:void(0);">信息管理</a>
            	<ul style="display:none;">
                	<li><a class="second_nav_a" href="toUpdatePass" target="content_iframe"><img src="images/left_nav_mark.png" />修改密码</a></li>
                </ul>
            </li>
        </ul>
    </div>
    <div id="left_bottom"></div>
</div>
</body>
</html>