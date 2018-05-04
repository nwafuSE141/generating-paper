package com.nwafu.organizepaper.controller;

import com.nwafu.itempool.model.PaperInfoModel;
import com.nwafu.organizepaper.service.PaperInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


/**
 * @author TinChiWay
 * @data 2018/5/3
 */
@RestController
@RequestMapping("/paperinfo")
public class PaperInfoController {

    @Autowired
    private PaperInfoService paperInfoService;

    @PostMapping("getpapercompleteinfo")
    public Map getPapercompleteInfo(int paperId){
        Map<String, Object> map = new HashMap<>();
       PaperInfoModel model = paperInfoService.getPapercompleteInfo(paperId);
       map.put("stat","ok");
       map.put("data",model);
       return map;
    }


}
