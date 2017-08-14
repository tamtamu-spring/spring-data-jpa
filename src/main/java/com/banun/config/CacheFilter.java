package com.banun.config;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//Implements Filter class
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
@WebFilter(filterName = "cacheFilter", urlPatterns = "/*")
public class CacheFilter implements Filter {

	public void init(FilterConfig config) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws java.io.IOException, ServletException {
		
		HttpServletResponse res = (HttpServletResponse) response;
	    
		@SuppressWarnings("unused")
		HttpServletRequest req = (HttpServletRequest) request;
		
//		res.setDateHeader("Expires", System.currentTimeMillis() + 604800000L);
		
		res.addHeader("Connection", "Keep-Alive");
		res.addHeader("Keep-Alive", "timeout=60000");
		
        res.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
        res.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
        res.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        res.setHeader("Access-Control-Max-Age", "3600");
        res.setHeader("Access-Control-Allow-Credentials", "true");		
        
        res.setHeader("Access-Control-Allow-Headers", "authorization, content-type," +
                "access-control-request-headers,access-control-request-method,accept,origin,authorization,x-requested-with");
        
        res.setStatus(HttpServletResponse.SC_OK);        

				
		
		chain.doFilter(request, res);
	}

	public void destroy() {
		
	}
}