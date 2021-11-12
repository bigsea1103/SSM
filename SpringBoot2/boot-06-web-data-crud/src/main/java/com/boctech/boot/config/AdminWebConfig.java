package com.boctech.boot.config;

import com.boctech.boot.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by 快快乐乐的大海
 * DATE :  2021/10/10- 12:22
 * Description:
 */
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")  //静态所有请求都被拦截，包括静态资源
                .excludePathPatterns("/","/main","/login","/css/**","/fonts/**","/images/**","/js/**","/sql","/city");  //放行的请求
    }
}
