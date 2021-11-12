package com.boctech.boot.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/10- 12:20
 * Description:
 */

@Slf4j
public class LoginInterceptor implements HandlerInterceptor {

    //目标方法执行之前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        // String requestURI = request.getRequestURI();
        //  log.info("preHandle拦截的请求路径是{}",requestURI);

        // 登录检查逻辑
        HttpSession session = request.getSession();
        Object loginUsr = session.getAttribute("loginUser");
        if(loginUsr != null) {
            //放行
            return true;
        }
        //拦截成功，未登录，跳转到登录页
        // session.setAttribute("msg","请先登录");
        // response.sendRedirect("/");
        request.setAttribute("msg","请先登录呀");
        request.getRequestDispatcher("/").forward(request,response);
        return false;
    }

    //目标方法执行完成之后
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //  log.info("postHandle执行{}",modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        //  log.info("afterCompletion执行异常{}",ex);
    }
}

