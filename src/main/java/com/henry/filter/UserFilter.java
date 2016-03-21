package com.henry.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.henry.entity.User;

/**
 * Servlet Filter implementation class UserFilter
 */
@WebFilter("/user/*")
public class UserFilter implements Filter {

    /**
     * Default constructor. 
     */
    public UserFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * ajax的不拦截
	 */
	public void doFilter(ServletRequest requ, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) requ;
		HttpServletResponse response = (HttpServletResponse) res;
		User user = (User) request.getSession().getAttribute("user");
		String ajaxHeader = request.getHeader("x-requested-with");//AJAX请求头
		
		if(user==null && ajaxHeader==null) {
				response.sendRedirect(request.getContextPath() + "/index.html");
				return;
		}
		chain.doFilter(requ, res);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
