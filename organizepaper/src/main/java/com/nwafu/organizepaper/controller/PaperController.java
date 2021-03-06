package com.nwafu.organizepaper.controller;

import com.nwafu.itempool.beans.Paper;
import com.nwafu.organizepaper.service.PaperService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public int deletePaperById(int id) {
        return paperService.deleteByPrimaryKey(id);
    }

    @PostMapping("/getpaperwithuserid")
    public Object getpapersWithUserId(int userId) {
        JSONObject jsonObject = new JSONObject();

        List<Paper> paperList = paperService.getPaperWithUserId(userId);

        jsonObject.element("stat", "ok");
        jsonObject.element("data", paperList);
        return jsonObject;
    }

    @PostMapping("/getalltestpaper")
    public Object getAllTestPaper() {
        JSONObject jsonObject = new JSONObject();

        List<Paper> paperList = paperService.getAllPaper();
        jsonObject.element("stat", "ok");
        jsonObject.element("data", paperList);

        return jsonObject;
    }

    @PostMapping("/approve")
    public Object approvePaper(int paperId){
        JSONObject jsonObject = new JSONObject();
        if (paperService.approvePaper(paperId) ==1){
            jsonObject.element("stat", "ok");
            jsonObject.element("msg", "审核通过");
            return jsonObject;
        }
        jsonObject.element("stat","no");
        return jsonObject;
    }

    @PostMapping("/auditnotpassed")
    public Object auditNotPassed(int paperId){
        JSONObject jsonObject = new JSONObject();
        if (paperService.auditNotPassed(paperId) ==1){
            jsonObject.element("stat", "ok");
            jsonObject.element("msg", "审核不通过");
            return jsonObject;

        }
        jsonObject.element("stat","no");
        return jsonObject;

    }

}
