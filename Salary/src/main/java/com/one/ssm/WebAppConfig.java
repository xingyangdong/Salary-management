package com.one.ssm;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppConfig implements WebMvcConfigurer {
    //修改springboot中默认的静态文件路径
    //从/resources/static/ 改变到 /webapp/根目录
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").
                addResourceLocations("/");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }

    //重写父类提供的跨域请求处理的接口
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //添加映射路径
        registry.addMapping("/**")
                //放行哪些原始域
                .allowedOriginPatterns("*")
                //是否发送Cookie信息
                .allowCredentials(true)
                //放行哪些请求方式
                .allowedMethods(HttpMethod.GET.name(), HttpMethod.POST.name(), HttpMethod.PUT.name(), HttpMethod.DELETE.name(), HttpMethod.OPTIONS.name())
                //放行哪些原始域(头部信息)
                .allowedHeaders(HttpHeaders.AUTHORIZATION, HttpHeaders.CONTENT_TYPE, "accessToken", "CorrelationId", "source")
                //暴露哪些头部信息（因为跨域访问默认不能获取全部头部信息）
                .exposedHeaders(HttpHeaders.AUTHORIZATION, HttpHeaders.CONTENT_TYPE, "accessToken", "CorrelationId", "source")
                .maxAge(4800);
    }

    //授权拦截的路径
    // addPathPatterns：拦截的路径
    // excludePathPatterns：不拦截的路径
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册自定义拦截器，添加拦截路径和排除拦截路径
//        registry.addInterceptor(new LoginInterceptor()).
//                addPathPatterns("/**").
//                excludePathPatterns("/index.html", "/", "/login", "/static/**");
    }
}
