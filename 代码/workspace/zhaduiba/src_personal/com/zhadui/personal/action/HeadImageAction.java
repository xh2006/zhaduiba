package com.zhadui.personal.action;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import com.zhadui.common.entity.LoginStatus;
import com.zhadui.personal.biz.PersonalCenterBiz;

public class HeadImageAction extends ActionSupport {

	/**
	 * @author wang.xr
	 */
	private static final long serialVersionUID = 1L;
	private File headImage;
	private double imageWidth;
	private double imageHeight;
	private int imageX;
	private int imageY;
	private double cutW;
	private double cutH;
	private String headImageFileName;
	private String headImageContentType;
	private PersonalCenterBiz personalCenterBiz;
	private int ifRefresh=0;
	public int getIfRefresh() {
		return ifRefresh;
	}

	public void setIfRefresh(int ifRefresh) {
		this.ifRefresh = ifRefresh;
	}
	public double getCutW() {
		return cutW;
	}
	public void setCutW(double cutW) {
		this.cutW = cutW;
	}
	public double getCutH() {
		return cutH;
	}
	public void setCutH(double cutH) {
		this.cutH = cutH;
	}
	public void setPersonalCenterBiz(PersonalCenterBiz personalCenterBiz) {
		this.personalCenterBiz = personalCenterBiz;
	}
	public String getHeadImageContentType() {
		return headImageContentType;
	}
	public void setHeadImageContentType(String headImageContentType) {
		this.headImageContentType = headImageContentType;
	}
	public File getHeadImage() {
		return headImage;
	}
	public void setHeadImage(File headImage) {
		this.headImage = headImage;
	}
	public double getImageWidth() {
		return imageWidth;
	}
	public void setImageWidth(double imageWidth) {
		this.imageWidth = imageWidth;
	}
	public double getImageHeight() {
		return imageHeight;
	}
	public void setImageHeight(double imageHeight) {
		this.imageHeight = imageHeight;
	}
	public int getImageX() {
		return imageX;
	}
	public void setImageX(int imageX) {
		this.imageX = imageX;
	}
	public int getImageY() {
		return imageY;
	}
	public void setImageY(int imageY) {
		this.imageY = imageY;
	}
	public String getHeadImageFileName() {
		return headImageFileName;
	}
	public void setHeadImageFileName(String headImageFileName) {
		this.headImageFileName = headImageFileName;
	}
	public String uploadHeadImage() {
		LoginStatus logins=(LoginStatus)ServletActionContext.getContext().getSession().get("zhadui_loginStatus");
		int userInfoId=logins.getUserId();
		String path=null;
		path=scaleHeadImage();
		String tempPath=cutHeadImage(path);
		File file = new File(path);
		boolean flag= file.delete();
		String fileName=scaleHeadImage2(tempPath);
		String imagePath=ServletActionContext.getServletContext().getContextPath()+"/personal/headImages/"+fileName;
		File file2 = new File(tempPath);
		file2.delete();
		personalCenterBiz.updateHeadImage(imagePath, userInfoId);
		ifRefresh=1;
		return "uploadHeadImage";
	}
	public void validateUploadHeadImage(){
		System.out.println(headImage);
		System.out.println(imageWidth);
		System.out.println(imageHeight);
		System.out.println(imageX);
		System.out.println(imageY);
		return;
	}
	/**
	 * 图像压缩
	 * @return
	 * @author wang.xr
	 * @throws IOException 
	 */
	public String scaleHeadImage(){
		String realPath=ServletActionContext.getServletContext().getRealPath("/personal/tempHeadImage/");
		try {
			Image img=ImageIO.read(headImage);
			BufferedImage bi = new BufferedImage((int)imageWidth,(int)imageHeight, BufferedImage.TYPE_INT_RGB);
			bi.getGraphics().drawImage(img.getScaledInstance((int)imageWidth, (int)imageHeight, img.SCALE_SMOOTH), 0,0,null);
			String fileName=String.valueOf(System.currentTimeMillis())+new Random().nextInt(10000)+".jpg";
			realPath+="\\"+fileName;
			FileOutputStream fio = new FileOutputStream(realPath);
			JPEGImageEncoder encoder=JPEGCodec.createJPEGEncoder(fio);
			encoder.encode(bi);
			fio.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return realPath;
	}
	public String cutHeadImage(String imagePath){
		String path=ServletActionContext.getServletContext().getRealPath("personal/headImages");
		String imageFileName=null;
		try {
			BufferedImage bi = ImageIO.read(new File(imagePath));
			Image image = bi.getScaledInstance((int)imageWidth, (int)imageHeight,
                    Image.SCALE_DEFAULT);
			// 四个参数分别为图像起点坐标和宽高
			ImageFilter cropFilter = new CropImageFilter(imageX, imageY,(int)cutW,(int)cutH);
			Image img = Toolkit.getDefaultToolkit().createImage(
                    new FilteredImageSource(image.getSource(),
                            cropFilter));
			 BufferedImage tag = new BufferedImage((int)cutW, (int)cutH, BufferedImage.TYPE_INT_RGB);
			 Graphics g = tag.getGraphics();
             g.drawImage(img, 0, 0, (int)cutW,(int)cutH,null); // 绘制切割后的图
             g.dispose();
             // 输出为文件
             imageFileName=String.valueOf(System.currentTimeMillis())+new Random().nextInt(10000)+".jpeg";
             path+="\\"+imageFileName;
             ImageIO.write(tag, "JPEG", new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
	}
	public String scaleHeadImage2(String path){
		String realPath=ServletActionContext.getServletContext().getRealPath("personal/headImages");
		String fileName=null;
		try {
			Image img=ImageIO.read(new File(path));
			BufferedImage bi = new BufferedImage(150,150, BufferedImage.TYPE_INT_RGB);
			bi.getGraphics().drawImage(img.getScaledInstance(150,150, img.SCALE_SMOOTH), 0,0,null);
			fileName=String.valueOf(System.currentTimeMillis())+new Random().nextInt(10000)+".jpg";
			realPath+="\\"+fileName;
			FileOutputStream fio = new FileOutputStream(realPath);
			JPEGImageEncoder encoder=JPEGCodec.createJPEGEncoder(fio);
			encoder.encode(bi);
			fio.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileName;
	}
}
