package com.nwafu.organizepaper.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.nwafu.itempool.beans.Paper;
import com.nwafu.itempool.beans.PaperInfo;
import com.nwafu.itempool.beans.SingleChoic;
import com.nwafu.itempool.model.AddPaperListModel;
import com.nwafu.organizepaper.service.*;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    @Autowired
    private FillBlankService fillBlankService;

    @Autowired
    private TrueOrFalseService trueOrFalseServicel;

    @Autowired
    private QuesAndAnsService quesAndAnsService;

    @Autowired
    private PaperService paperService;

    @Autowired
    private PaperInfoService paperInfoService;

    @PostMapping("/getquestions")
    public Object getQuestions(Integer type) {
        Map<String, Object> map = new HashMap<>();
        if (type == 10001) {
            map.put("stat", "ok");
            map.put("data", singleChoiceService.getSingleQuestions());
            return map;
        } else if (type == 10002) {
            map.put("data", multipleChoiceService.getMultipleQuestions());
            map.put("stat", "ok");
            return map;
        } else if (type == 10003) {
            map.put("data", fillBlankService.getFillBlankQuestion());
            map.put("stat", "ok");
            return map;
        } else if (type == 10004) {
            map.put("data", trueOrFalseServicel.getTrueOrFalseQuestion());
            map.put("stat", "ok");
            return map;
        } else if (type == 10005) {
            map.put("data", quesAndAnsService.getQuesAndAnsQuestions());
            map.put("stat", "ok");
            return map;
        } else {
            return map.put("stat", "no");
        }

    }


    @PostMapping("/addpaper")
    public Object addPaper(@RequestBody AddPaperListModel questlist) {


        int sumScore = 0;
        int serialnum = 0;
        int userId = questlist.getUserid();
        String papername = questlist.getName();
        List<Integer> singleIds = questlist.getSingleSelect();
        List<Integer> multipleIds = questlist.getMultipleSelect();
        List<Integer> fillBlankIds = questlist.getFillblank();
        List<Integer> trueOrFalseIds = questlist.getTureorfalse();
        List<Integer> quesAndAnsIds = questlist.getQuesAndAns();

        List<PaperInfo> paperInfoList = new ArrayList<>();

        //校验
        /**
         * if (singleIds.size() != 10) {
         *             JSONObject object = new JSONObject();
         *             object.element("stat","no");
         *             object.element("msg","选择题是数量不为10");
         *         }
         */

        //插入paper
        Paper paper = new Paper();
        paper.setCreatorId(userId);
        paper.setName(papername);
        paperService.insertSelective(paper);
        int paperId = paper.getId();

        //组织单选题
        for (int questionId : singleIds) {
            serialnum++;
            PaperInfo paperInfo = new PaperInfo();
            paperInfo.setPaperId(paperId);
            paperInfo.setSerialNumber(serialnum);
            paperInfo.setTypeId(10001);
            paperInfo.setQuestionId(questionId);
            paperInfoList.add(paperInfo);
        }

        //组织多选题
        for (int questionId : multipleIds) {
            serialnum++;
            PaperInfo paperInfo = new PaperInfo();
            paperInfo.setPaperId(paperId);
            paperInfo.setSerialNumber(serialnum);
            paperInfo.setTypeId(10002);
            paperInfo.setQuestionId(questionId);
            paperInfoList.add(paperInfo);
        }

        //组织填空题
        for (int questionId : fillBlankIds) {
            serialnum++;
            PaperInfo paperInfo = new PaperInfo();
            paperInfo.setPaperId(paperId);
            paperInfo.setSerialNumber(serialnum);
            paperInfo.setTypeId(10003);
            paperInfo.setQuestionId(questionId);
            paperInfoList.add(paperInfo);
        }

        //组织判断题

        for (int questionId : trueOrFalseIds) {
            serialnum++;
            PaperInfo paperInfo = new PaperInfo();
            paperInfo.setPaperId(paperId);
            paperInfo.setSerialNumber(serialnum);
            paperInfo.setTypeId(10004);
            paperInfo.setQuestionId(questionId);
            paperInfoList.add(paperInfo);
        }

        //组织问答题
        for (int questionId : quesAndAnsIds) {
            serialnum++;
            PaperInfo paperInfo = new PaperInfo();
            paperInfo.setPaperId(paperId);
            paperInfo.setSerialNumber(serialnum);
            paperInfo.setTypeId(10005);
            paperInfo.setQuestionId(questionId);
            paperInfoList.add(paperInfo);
        }

        int res = paperInfoService.insertList(paperInfoList);

        if (res > 0) {
            return new JSONObject().element("stat", "ok");
        } else {
            return "no";
        }
    }
}
