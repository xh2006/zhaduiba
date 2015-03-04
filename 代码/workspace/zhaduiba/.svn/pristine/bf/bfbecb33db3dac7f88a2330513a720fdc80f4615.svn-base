<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link href="css/base.css" type="text/css" rel="stylesheet" />
<link href="css/head.css" type="text/css" rel="stylesheet" />
<style type="text/css">
</style>
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
<script type="text/javascript" src="js/imagesloaded.js"></script>
<script type="text/javascript" src="js/jquery.wookmark.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$("#search_btn").click(function() {
			var sc = $("#search_input").val();

			if (sc != "") {

				alert(sc);
			} else {
				alert("NULL");
			}

		});
	});
</script>

<script type="text/javascript">
	$(function() {
		var $window = $(window), $content = $("#content");
		var $handler = $('.content_block', $content);

		options = {
			align : 'center',
			autoResize : false,
			comparator : null,
			container : $('#content'),
			direction : undefined,
			ignoreInactiveItems : true,
			itemWidth : 240,
			fillEmptySpace : false,
			flexibleWidth : 0,
			offset : 10,
			onLayoutChanged : undefined,
			outerOffset : 0,
			possibleFilters : [],
			resizeDelay : 50,
			verticalOffset : undefined
		};

		function ApplyLayout() {
			if ($handler.wookmarkInstance) {
				$handler.wookmarkInstance.clear();
			}
			$handler = $('.content_block', $content);
			$handler.wookmark(options);
		}

		function duierInfo_J2H(data) // 将堆儿信息json数据转换为HTML的div数据块
			{
				var duierInfo_html = "";
				var jsondata=eval("("+data+")");
				//alert(jsondata.duierInfos);
				$.each(jsondata.duierInfos,function(i, item) {
					duierInfo_html += '<div class=\"content_block\"><div class=\"content_block_title\"><div><a href=\"duierDetail?id='
						+ item.id
						+ '\">'
						+ item.name
						+ '</a></div><div><span>'
						+ item.participants
						+ '参与&nbsp;&nbsp;&nbsp;'
						+ item.comments
						+ '评论</span></div></div><div class=\"content_block_split\"><img src=\"images/split_line_a.jpg\"></img></div><div class=\"content_block_header\"><div class=\"user_header\"><img src=\"'
						+ item.creatorImg
						+ '\"/></div><div class=\"user_name\">'
						+ item.creator
						+ '</div></div><div class=\"content_block_category\">&nbsp;&nbsp;话题来自：<span>'
						+ item.category
						+ '</span></div><div class=\"content_block_split\"><img src=\"images/split_line_b.jpg\"/></div><div class=\"content_block_abstract\">'
						+ item.digest
						+ '</div></div>';
					});
				return duierInfo_html;
			}

		$(window).scroll(
				function() {
					//$(document).scrollTop() 获取垂直滚动的距离
					//$(document).scrollLeft() 这是获取水平滚动条的距离
					if ($(document).scrollTop() >= $(document).height()
							- $(window).height()) {
						var nCurrentItem = 0;
						var nRequestItemNum = 10;
						var nRequestType = 0; // 0-任意堆儿数据；1-未完成堆儿；2-已完成堆儿
						$.post("getMoreDuierInfo_front",
							{start : 0,items : 3},
							function(data){
								// 解析Json
								var content_block_html = duierInfo_J2H(data);
								$content.append(content_block_html);
						});

						ApplyLayout();
					}
				});

		// Apply the layout firstly.
		ApplyLayout();

	});
</script>

</head>
<body>
	<!--网站头部begin-->
	<div id="head">
		<div id="head_main">
			<div id="head_main_left_logo"></div>
			<div id="head_main_left_world"></div>
			<div id="head_main_left_empty"></div>
			<div id="head_main_center_search_input">
				<input id="search_input" type="text" />
			</div>
			<div id="head_main_center_search_btn">
				<input id="search_btn" type="button" />
			</div>
			<div id="head_main_right_phone"></div>
			<div id="head_main_right_login">
				<div id="head_main_right_login_a">
					<s:if test="#session.zhadui_loginStatus!=null">
						<a href="personal/toPersonalCenter">个人主页</a>&nbsp;|&nbsp;<a href="logout_web">退出</a>
					</s:if>
					<s:else>
						<a href="login">登录</a>&nbsp;|&nbsp;<a href="register">注册</a>
					</s:else>
				</div>
			</div>
		</div>
	</div>
	<!--网站头部end-->
	<!--导航栏begin-->
	<div id="nav">
		<div id="nav_main">
			<ul>
				<li><a class="nav_link" href="category?id=1">扎堆</a></li>
				<li><a class="nav_link" href="category?id=2">运动</a></li>
				<li><a class="nav_link" href="category?id=3">任性</a></li>
				<li><a class="nav_link" href="category?id=4">去野</a></li>
				<li><a class="nav_link" href="category?id=5">小聚</a></li>
				<li><a class="nav_link" href="category?id=6">小钱</a></li>
				<li><a class="nav_link" href="category?id=7">二手</a></li>
				<li><a class="nav_link" href="category?id=8">教育</a></li>
				<li><a class="nav_link" href="category?id=9">爱心</a></li>
				<li><a class="nav_link" href="category?id=10">联谊</a></li>
			</ul>
		</div>
	</div>
	<!--导航栏end-->
	<!--广告位begin-->
	<div id="ad">
		<img src="images/banner.jpg" style="width:100%; height:100%;" />
	</div>
	<div id="ad_main">
		<div id="ad_main_left"></div>
		<div id="ad_main_right">
			<div id="ad_main_right_top">
				<div style="height:70px;"></div>
				<img src="images/code.jpg" />
			</div>
			<div id="ad_main_right_bottom">
				<div style="height:10px;"></div>
				<a href="toCreateDuier"><img
					src="images/activity_create.png" /> </a>
			</div>
		</div>
	</div>
	<!--广告位end-->
	<div style="height:10px;"></div>
	<!--主要内容begin-->
	<div id="content">
		<s:iterator value="duierShowInfoBlocks" var="block">
			<div class="content_block">
				<!--话题begin-->
				<div class="content_block_title">
					<div>
						<a href="duierDetail?id=<s:property value='#block.duierId' />"><s:property value='#block.duierName' /></a>
					</div>
					<div>
						<span><s:property value="#block.duierParticipants" />参与&nbsp;&nbsp;&nbsp;
						<s:property value="#block.duierComments" />评论</span>
					</div>
				</div>
				<!--话题end-->
				<!--split_line_begin-->
				<div class="content_block_split">
					<img src="images/split_line_a.jpg"></img>
				</div>
				<!--分割线end-->
				<!--用户begin-->
				<div class="content_block_header">
					<div class="user_header">
						<img src='<s:property value="#block.duierUserHeaderImgUrl" />' />
					</div>
					<div class="user_name"><s:property value="#block.duierOwnerName" /></div>
				</div>
				<!--用户end-->
				<!--话题所属begin-->
				<div class="content_block_category">
					&nbsp;&nbsp;话题来自：<span><s:property value="#block.duierClass" /></span>
				</div>
				<!--话题所属end-->
				<!--split_line_begin-->
				<div class="content_block_split">
					<img src="images/split_line_b.jpg" />
				</div>
				<!--分割线end-->
				<!--内容begin-->
				<div class="content_block_abstract">
					<s:property value="#block.duierIntroduction" />
				</div>
				<!--内容end-->
			</div>
		</s:iterator>
	</div>
	<!--主要内容end-->
</body>
</html>

