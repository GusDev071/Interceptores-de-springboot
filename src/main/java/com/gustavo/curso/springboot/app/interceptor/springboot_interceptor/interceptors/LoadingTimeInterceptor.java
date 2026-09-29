package com.gustavo.curso.springboot.app.interceptor.springboot_interceptor.interceptors;

import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component ("timeInterceptor")
public class LoadingTimeInterceptor implements  HandlerInterceptor {

    private static  final Logger logger = LoggerFactory.getLogger(LoadingTimeInterceptor.class);

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            @Nullable ModelAndView modelAndView) throws Exception {
                logger.info("LoadingTimeInterceptor: postHandle() saliendo...");
            }
            
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
                logger.info("LoadingTimeInterceptor: preHandle() entrando...");
                return true;
    }
    
}
