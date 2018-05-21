package com.nwafu.itempool;

import com.nwafu.itempool.beans.Chapter;
import com.nwafu.itempool.mapper.ChapterMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@MapperScan({"com.nwafu.itempool.mapper"})
public class ItemPoolApplication {

    @Autowired
    private ChapterMapper chapterMapper;

    public static void main(String[] args) {
        SpringApplication.run(ItemPoolApplication.class, args);
    }

}
