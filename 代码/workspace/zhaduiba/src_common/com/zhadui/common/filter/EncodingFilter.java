package com.zhadui.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter {

	private String encofig=null;
	
	public EncodingFilter() {
		super();
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		encofig=null;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		if(encofig!=null){
			request.setCharacterEncoding(encofig);//设置编码过滤 
			response.setCharacterEncoding(encofig);//设置编码过滤
			chain.doFilter(request, response); 
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		encofig = filterConfig.getInitParameter("encofig");//从web.xml文件中获得配置的属性（在web.xml文件中编码设置）
		System.out.println("-----=====-----====-----====-----===="+encofig);
	}

	
}
