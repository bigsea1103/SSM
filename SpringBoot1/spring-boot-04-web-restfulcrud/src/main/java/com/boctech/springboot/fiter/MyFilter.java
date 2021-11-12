package com.boctech.springboot.fiter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/9/29- 08:25
 * Description:
 */
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter process ...");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }


}
