package com.zhadui.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class ServletFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;

		String target = request.getRequestURI();
		target = target.lastIndexOf("?") > 0 ? target.substring(
				target.lastIndexOf("/") + 1,
				target.lastIndexOf("?") - target.lastIndexOf("/")) : target
				.substring(target.lastIndexOf("/") + 1);
		//System.out.println("===================="+target);
		if (request.getRequestURI().indexOf("/servlet/") > 0) {
			RequestDispatcher rdsp = request.getRequestDispatcher(target);
			rdsp.forward(req, resp);
		} else {
			chain.doFilter(req, resp);
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
