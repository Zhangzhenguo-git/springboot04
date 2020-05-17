package com.zhang.springboot05.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

////标记当前类为配置类，相当于spring项目中的xml配置
@Configuration
//public class WebMvcConfig implements WebMvcConfigurer {
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("login");
//        registry.addViewController("/login.html").setViewName("login");
//    }
//}
public class WebMvcConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login.html").setViewName("login");
        super.addViewControllers(registry);
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        //访问路径名称
        registry.addResourceHandler("/favicon.ico")
//                绝对路径
                .addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);

    }
}