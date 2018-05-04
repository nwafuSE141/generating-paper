package com.nwafu.organizepaper.controller;

import com.nwafu.organizepaper.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TinChiWay
 * @data 2018/5/2
 */
@RestController
@RequestMapping("/paper")
public class PaperController {

    @Autowired
    PaperService paperService;

    @PostMapping("/delete")
    public int deletePaperById(int id){
        return paperService.deleteByPrimaryKey(id);
    }

}
