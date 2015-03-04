jQuery.fn.extend({
    uploadPreview: function (opts) {
        var _self = this, _this = $(this);
        opts = jQuery.extend({
            Img: "ImgPr",
			btnFile:'',
			divHeight:100,
			divWidth:100,
            Width: 100,
            Height: 100,
            ImgType: ["gif", "jpeg", "jpg", "bmp", "png"],
            Callback: function (width,height) { }
        }, opts || {});
        _self.getObjectURL = function (file) {
            var url = null;
            if (window.createObjectURL != undefined) {
                url = window.createObjectURL(file);
            } else if (window.URL != undefined) {
                url = window.URL.createObjectURL(file);
            } else if (window.webkitURL != undefined) {
                url = window.webkitURL.createObjectURL(file);
            }
            return url;
        };
		var imageH;
		var imageW;
        _this.change(function () {
        	$("#" + opts.Img).width('');
			$("#" + opts.Img).height('');
            if (this.value) {
                if (!RegExp("\.(" + opts.ImgType.join("|") + ")$", "i").test(this.value.toLowerCase())) {
                    alert("选择文件错误,图片类型必须是" + opts.ImgType.join("，") + "中的一种");
                    this.value = "";
                    return false;
                }
                if (navigator.userAgent.indexOf("MSIE") > -1) {
                    try {
                        $("#" + opts.Img).attr('src', _self.getObjectURL(this.files[0]));
                    } catch (e) {
                        var src = "";
                        var obj = $("#" + opts.Img);
                        var div = obj.parent("div")[0];
                        _self.select();
                        if (top != self) {
                            window.parent.document.body.focus();
                        } else {
                            _self.blur();
                        }
                        src = document.selection.createRange().text;
						/*IE浏览器下设置图片宽度和高度*/
						$("#" + opts.Img).attr("src",src);
						alert("请裁剪要设置的头像图片为150 X 150");
						if(obj.height()>opts.divHeight){
							imageH=opts.divHeight;
							imageW=opts.divHeight/obj.height()*obj.width();
							$("#" + opts.Img).height(imageH);
							$("#" + opts.Img).width(imageW);
						}else{
							imageH = obj.height();
						}
						if(obj.width()>opts.divWidth){
							imageW=opts.divWidth;
							imageH=opts.divWidth/obj.width()*obj.height();
							$("#" + opts.Img).height(imageH);
							$("#" + opts.Img).width(imageW);
						}else{
							imageW=obj.width();
						}
                    }
                } else {
                    $("#" + opts.Img).attr('src', _self.getObjectURL(this.files[0]));
					alert("请裁剪要设置的头像图片为150 X 150");
					/*其他浏览器下设置图片宽度和高度*/
					if($("#" + opts.Img).height()>opts.divHeight){
						imageH=opts.divHeight;
						imageW=opts.divHeight/$("#" + opts.Img).height()*$("#" + opts.Img).width();
						$("#" + opts.Img).height(imageH);
						$("#" + opts.Img).width(imageW);
					}else{
						imageH=$("#" + opts.Img).height();
					}
					if($("#" + opts.Img).width()>opts.divWidth){
						imageW=opts.divWidth;
						imageH=opts.divWidth/$("#" + opts.Img).width()*$("#" + opts.Img).height();
						$("#" + opts.Img).height(imageH);
						$("#" + opts.Img).width(imageW);
					}else{
						imageW=$("#" + opts.Img).width()
					}
                }
                opts.Callback(imageW,imageH);
            }
        });
    }
});