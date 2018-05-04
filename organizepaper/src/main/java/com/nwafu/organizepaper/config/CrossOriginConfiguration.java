package com.nwafu.organizepaper.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author TinChiWay
 * @data 2018/5/4
 */
@Configuration
public class CrossOriginConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedHeaders("*")
                .allowedMethods("*")
//                .allowCredentials(true)
//                .allowedOrigins("172.19.12.35")
                .allowedOrigins("*");
    }
}
