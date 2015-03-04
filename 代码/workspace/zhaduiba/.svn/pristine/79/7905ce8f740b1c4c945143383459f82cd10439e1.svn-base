package com.zhadui.bg.action;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zhadui.bg.biz.AdBiz_bg;
import com.zhadui.common.entity.DuierClassImage;
import com.zhadui.common.util.FileUtil;

public class ADAction_bg extends ActionSupport {

	private List<DuierClassImage> adList;
	private int imagesType;
	private File image;
	private String imageFileName;
	private String imageSummary;
	private String content;
	
	private int adId;

	public int getAdId() {
		return adId;
	}
	public void setAdId(int adId) {
		this.adId = adId;
	}
	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	public int getImagesType() {
		return imagesType;
	}
	public void setImagesType(int imagesType) {
		this.imagesType = imagesType;
	}
	public File getImage() {
		return image;
	}
	public void setImage(File image) {
		this.image = image;
	}
	public String getImageSummary() {
		return imageSummary;
	}
	public void setImageSummary(String imageSummary) {
		this.imageSummary = imageSummary;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	private AdBiz_bg adBizBg;
	
	public void setAdBizBg(AdBiz_bg adBizBg) {
		this.adBizBg = adBizBg;
	}
	public List<DuierClassImage> getAdList() {
		return adList;
	}
	public void setAdList(List<DuierClassImage> adList) {
		this.adList = adList;
	}

	public String toAdList(){
		adList=adBizBg.getAdList();
		return "toAdList";
	}
	public String toAddAd(){
		super.clearFieldErrors();
		return "toAddAd";
	}
	public String addAd(){
		//String path=ServletActionContext.getServletContext().getContextPath()+"/uploadImages/";
		String fileSuf=imageFileName.substring(imageFileName.indexOf("."));
		String realPath=ServletActionContext.getServletContext().getRealPath("/uploadImages");
		String fileName=String.valueOf(System.currentTimeMillis())+new Random().nextInt(10000)+fileSuf;
		File saveFile = new File(new File(realPath),fileName);
		//图片上传路径
		String imageSrc=ServletActionContext.getServletContext().getContextPath()+"/uploadImages/"+fileName;
		try {
			FileUtils.copyFile(image,saveFile);
			String modelContent=FileUtil.readFile("zhadui8admin/tempModel/ad_model.html");
			System.out.println(modelContent);
			modelContent=modelContent.replaceAll("##adContent##",content);
			System.out.println(modelContent);
			String htmlName=String.valueOf(System.currentTimeMillis())+new Random().nextInt(10000)+".html";
			FileUtil.writeFile("/zhadui8admin/adTempFile",modelContent,htmlName);
			//html保存路径
			String htmlSrc=ServletActionContext.getServletContext().getContextPath()+"/zhadui8admin/adTempFile/"+htmlName;
			adBizBg.addAd(imagesType, imageSrc, imageSummary, htmlSrc);
		} catch (IOException e) {
		}
		
		return "addAd";
	}
	public void validateAddAd(){
		super.clearFieldErrors();
		if(image==null){
			super.addFieldError("imageError","请选择上传图片");
			return;
		}
		Pattern p=Pattern.compile("^(.JPEG|.jpeg|.JPG|.jpg|.GIF|.PNG|.png)$");
		Matcher m= p.matcher(imageFileName.substring(imageFileName.lastIndexOf(".")));
		if(!m.matches()){
			super.addFieldError("imageError","文件格式不正确");
			return;
		}
		if(image==null || image.length()>4194304 ){  
            super.addFieldError("imageError","文件过大，请上传4M之内的图片");
            return;
        } 
		if(imageSummary==null){
			super.addFieldError("summaryError","请填写上传图片摘要信息");
			return;
		}
	}
	public String deleteAd(){
		adBizBg.deleteAd(adId);
		return "deleteAd";
	}
	
}
