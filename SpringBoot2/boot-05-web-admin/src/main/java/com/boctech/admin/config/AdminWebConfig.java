package com.boctech.admin.config;

import com.boctech.admin.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/9- 20:59
 * Description:
 * 1.编写一个拦截器实现HandlerInterceptor接口
 * 2.拦截器注册到容器中，实现WebMvcConfigurer的addInterceptors
 * 3.指定拦截器规则，如果拦截所有，静态资源也会被拦截
 */
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")  //静态所有请求都被拦截，包括静态资源
                .excludePathPatterns("/","/main","/login","/css/**","/fonts/**","/images/**","/js/**");  //放行的请求
    }
}
