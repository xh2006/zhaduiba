package com.zhadui.bg.biz.impl;

import java.io.File;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.zhadui.bg.biz.AdBiz_bg;
import com.zhadui.bg.dao.AdDao_bg;
import com.zhadui.common.entity.DuierClassImage;

public class AdBizImpl_bg implements AdBiz_bg {

	private AdDao_bg adDaoBg;
	public void setAdDaoBg(AdDao_bg adDaoBg) {
		this.adDaoBg = adDaoBg;
	}
	
	@Override
	public List<DuierClassImage> getAdList() {
		// TODO Auto-generated method stub
		return adDaoBg.getDuierClassImageList();
	}

	@Override
	public void addAd(int imageType, String imageUrl, String imageSummary,
			String contentUrl) {
		DuierClassImage duierClassImage=new DuierClassImage();
		duierClassImage.setDuierClassImageUrl(imageUrl);
		duierClassImage.setDuierClassImageInfoUrl(contentUrl);
		duierClassImage.setDuierClassImageSummary(imageSummary);
		duierClassImage.setDuierClassImageType(imageType);
		adDaoBg.addDuierClassImage(duierClassImage);
	}

	@Override
	public void deleteAd(int adId) {
		DuierClassImage duierClassImage=adDaoBg.getDuierClassImageById(adId);
		String htmlPath=duierClassImage.getDuierClassImageInfoUrl();
		int index=htmlPath.indexOf("/",1);
		htmlPath=htmlPath.substring(index);
		//System.out.println("==============="+htmlPath);
		String realPath=ServletActionContext.getServletContext().getRealPath(htmlPath);
		System.out.println("==============="+realPath);
		File file=new File(realPath);
		if(file.isFile() && file.exists()){
			file.delete();
		}
		String imagePath=duierClassImage.getDuierClassImageUrl();
		int indexImage=imagePath.indexOf("/",1);
		imagePath=imagePath.substring(indexImage);
		String realPathImage=ServletActionContext.getServletContext().getRealPath(imagePath);
		System.out.println("=========="+realPathImage);
		File imageFile=new File(realPathImage);
		if(imageFile.isFile() && imageFile.exists()){
			imageFile.delete();
		}
		adDaoBg.deleteDuierClassImageById(adId);
	}

}
