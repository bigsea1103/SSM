package com.boctech.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/17- 18:57
 * Description:
 */
//拦截器类：拦截用户的请求
public class MyInterceptor implements HandlerInterceptor {

    //验证登陆的用户信息，正确返回true，其他false
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("11111-拦截器的MyInterceptor的 preHandle()");
        String loginname = "";
        //从session中获取name的值
        Object attr = request.getSession().getAttribute("name");
        if( attr != null) {
            loginname = (String) attr;
        }

        //判断登录的用户，是否符合要求
        if( !"zs".equals(loginname)) {
            //不能访问系统
            //给用户提示
            request.getRequestDispatcher("/tips.jsp").forward(request,response);
            return false;
        }

        //zs登陆
        return true;
    }

}
