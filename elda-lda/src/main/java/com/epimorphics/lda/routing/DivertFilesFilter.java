package com.epimorphics.lda.routing;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class DivertFilesFilter implements Filter{

	@Override public void destroy() {		
	}

	@Override public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) 
	throws IOException, ServletException {
		final HttpServletRequestWrapper wrapped = new HttpServletRequestWrapper((HttpServletRequest) req) {
			@Override public StringBuffer getRequestURL() {
				HttpServletRequest req = (HttpServletRequest) getRequest();
				final StringBuffer originalUrl = req.getRequestURL();
				
				System.err.println( ">> filtering; path= " + req.getPathInfo() );
				
				return originalUrl; // new StringBuffer("http://servername2:7001");
			}
		};
    chain.doFilter(wrapped, resp);
	}
	
//	RequestDispatcher dispatcher = request.getRequestDispatcher("user?id=" + m.group(1));
//    dispatcher.forward(req, res);
	
    @Override public void init(FilterConfig fc) throws ServletException {
		System.err.println( ">> DivertFilesFilter.init" );
	}

}