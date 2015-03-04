// JavaScript Document
(function($){
	$.fn.UpImageAutoSize=function(options){
		var opts=$.extend({},$.fn.UpImageAutoSize.defaults,options);
		$(this).change(function(){
			var url = getImageUrl($(this));
			alert(url);
		});
	}
	function initUpImage(optis,obj){
		if (navigator.userAgent.indexOf("MSIE") > -1) {
			$("#"+optis.imageId).attr("src",obj.attr("src"));
		}
		$("#"+optis.imageDivId).children("img").attr("src",getImageUrl($(this)));
		
	}
	function getImageUrl(file){
		var url = null;
        if (window.createObjectURL != undefined) {
            url = window.createObjectURL(file);
        } else if (window.URL != undefined) {
            url = window.URL.createObjectURL(file);
        } else if (window.webkitURL != undefined) {
            url = window.webkitURL.createObjectURL(file);
        }
        return url;
	}
	$.fn.UpImageAutoSize.defaults={
		imageDivId:'',
		imageId:'',
	}
})(jQuery)