package com.nwafu.organizepaper.controller;

import com.nwafu.organizepaper.service.MultipleChoiceService;
import com.nwafu.organizepaper.service.SingleChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author TinChiWay
 * @data 2018/5/4
 */
@RestController
@RequestMapping("/paperorganize")
public class OrganizationController {

    @Autowired
    private SingleChoiceService singleChoiceService;

    @Autowired
    private MultipleChoiceService multipleChoiceService;

    @PostMapping("/getquestions")
    public Object getQuestions(Integer type) {
        Map<String, Object> map = new HashMap<>();
        if (type == 10001) {
            map.put("stat", "ok");
            map.put("data", singleChoiceService.getSingleQuestions());
            return map;
        } else if (type == 10002) {
            map.put("data", multipleChoiceService.getMultipleQuestions());
            map.put("stat","ok");
            return map;
        } else {
            return map.put("stat", "no");
        }

    }
}
