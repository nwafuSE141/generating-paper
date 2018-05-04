package com.nwafu.organizepaper;

import com.github.pagehelper.PageHelper;
import com.nwafu.itempool.ItemPoolApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

/**
 * @author TinChiWay
 * @data 2018/5/2
 */
@SpringBootApplication
@RestController
@MapperScan({"com.nwafu.itempool.mapper"})
public class OrganizepaperApplication {
    protected static final Logger logger = LoggerFactory.getLogger(OrganizepaperApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(OrganizepaperApplication.class, args);
    }
    @Bean
    public PageHelper pageHelper(){
        logger.info("开始配置数据分页插件");
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
        pageHelper.setProperties(properties);
        return pageHelper;
    }
}
