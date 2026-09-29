package com.gustavo.curso.springboot.app.interceptor.springboot_interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration 
public class MvcConfig implements WebMvcConfigurer {

    @Autowired 
    @Qualifier("timeInterceptor")
    private HandlerInterceptor timInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
         registry.addInterceptor(timInterceptor).addPathPatterns("/app/**"); //hace que la clase de time solo se ejecute en esta rutas
         // registry.addInterceptor(timInterceptor).excludePathPatterns("/app/**");hace que la clase de time no se ejecute en esta rutas
    }
    
}
