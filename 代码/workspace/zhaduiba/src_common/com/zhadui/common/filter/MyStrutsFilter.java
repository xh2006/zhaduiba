package com.zhadui.common.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;

public class MyStrutsFilter extends StrutsPrepareAndExecuteFilter {

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) {    
        HttpServletRequest request = (HttpServletRequest) req;    
        String url = request.getRequestURI();
        try{    //"url.contains("/ticketingSystem/ueditor/")
            if ("/zhaduiba/ueditor/jsp/controller.jsp".equals(url)) {
                chain.doFilter(req, res);
            } else {    
                super.doFilter(req, res, chain);    
            }    
        }catch(Exception e){    
            e.printStackTrace();
        }    
    } 
}
