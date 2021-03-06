package com.zhadui.front.action;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zhadui.common.entity.LoginStatus;
import com.zhadui.front.biz.UserInfoManageBiz;


@SuppressWarnings("serial")
public class UploadImageHandler extends ActionSupport {

    UserInfoManageBiz userInfoManager;
    
	private int rect_x;
	private int rect_y;
	private int rect_w;
	private int rect_h;
	private int img_w;
	private int img_h;
	
	private File headImageTemp;
    //提交过来的file的名字
    private String headImageTempFileName;   
    //提交过来的file的MIME类型
    private String headImageTempContentType;

    // 用户头像路径
    private String headerImgUrl = null;
    
    
	public UserInfoManageBiz getUserInfoManager() {
		return userInfoManager;
	}

	public void setUserInfoManager(UserInfoManageBiz userInfoManager) {
		this.userInfoManager = userInfoManager;
	}
	
	public String uploadImage() throws IOException{
		// 文件类型验证！！！！！！！！！！！！！！！！！！！！！！！
		ImageInputStream iis =null ;
		InputStream is = null;
		BufferedImage resizeImg = null;
		
		try {
			String root = ServletActionContext.getServletContext().getRealPath("/personal/headImages");
	        is = new FileInputStream(headImageTemp);
	        
	        // 图片缩放
	        BufferedImage im = ImageIO.read(is);
	        /* 原始图像的宽度和高度 */  
            int width = im.getWidth();  
            int height = im.getHeight();           
            //压缩计算  
            
            //float resizeTimes = 0.2f;
            /* 调整后的图片的宽度和高度 */  
//            int toWidth = (int) (width * resizeTimes);  
//            int toHeight = (int) (height * resizeTimes);
            
            int toWidth = img_w;  
            int toHeight = img_h;
            
            /* 新生成结果图片 */  
            resizeImg = new BufferedImage(toWidth, toHeight, BufferedImage.TYPE_INT_RGB);  
            resizeImg.getGraphics().drawImage(  
                    im.getScaledInstance(toWidth, toHeight, java.awt.Image.SCALE_SMOOTH),
                    0, 0, null);  
                      
            BufferedImage temp;
            
            if(rect_w > 0 || rect_h > 0){
            	temp = resizeImg.getSubimage(rect_x, rect_y, rect_w, rect_h);
                String imageFileName = String.valueOf(System.currentTimeMillis()) + new Random().nextInt(10000)+".jpg";
                ImageIO.write(temp, "jpg", new File(root, imageFileName));
                String imgFilePath = "/zhaduiba/personal/headImages/" + imageFileName;
                LoginStatus loginStatus = (LoginStatus)ActionContext.getContext().getSession().get("zhadui_loginStatus");
                int nId = loginStatus.getUserId();
                userInfoManager.updateUserHeader(nId, imgFilePath);
                headerImgUrl = imgFilePath;
            }                
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(is!=null)
               is.close();       
            if(iis!=null)
               iis.close();  
		}
		return "suc";
	}

	public int getRect_x() {
		return rect_x;
	}

	public void setRect_x(int rect_x) {
		this.rect_x = rect_x;
	}

	public int getRect_y() {
		return rect_y;
	}

	public void setRect_y(int rect_y) {
		this.rect_y = rect_y;
	}

	public int getRect_w() {
		return rect_w;
	}

	public void setRect_w(int rect_w) {
		this.rect_w = rect_w;
	}

	public int getRect_h() {
		return rect_h;
	}

	public void setRect_h(int rect_h) {
		this.rect_h = rect_h;
	}

	public int getImg_w() {
		return img_w;
	}

	public void setImg_w(int img_w) {
		this.img_w = img_w;
	}

	public int getImg_h() {
		return img_h;
	}

	public void setImg_h(int img_h) {
		this.img_h = img_h;
	}

	public File getHeadImageTemp() {
		return headImageTemp;
	}

	public void setHeadImageTemp(File headImageTemp) {
		this.headImageTemp = headImageTemp;
	}

	public String getHeadImageTempFileName() {
		return headImageTempFileName;
	}

	public void setHeadImageTempFileName(String headImageTempFileName) {
		this.headImageTempFileName = headImageTempFileName;
	}

	public String getHeadImageTempContentType() {
		return headImageTempContentType;
	}

	public void setHeadImageTempContentType(String headImageTempContentType) {
		this.headImageTempContentType = headImageTempContentType;
	}

	public String getHeaderImgUrl() {
		return headerImgUrl;
	}

	public void setHeaderImgUrl(String headerImgUrl) {
		this.headerImgUrl = headerImgUrl;
	}


}
