package com.nwafu.itempool.controller;

import com.nwafu.itempool.beans.SingleChoic;
import com.nwafu.itempool.module.BaseRequest;
import com.nwafu.itempool.module.ResponseBody;
import com.nwafu.itempool.module.UpdateRequest;
import com.nwafu.itempool.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private SingleChoicService singleChoicService;

    @Autowired
    private MultipleChoicService multipleChoicService;

    @Autowired
    private FillBlankService fillBlankService;

    @Autowired
    private TrueOrFalseService trueOrFalseService;

    @Autowired
    private QuesAndAnsService quesAndAnsService;

    @GetMapping("/{type}")
    public com.nwafu.itempool.module.ResponseBody getItems(@PathVariable Integer type, Integer courseId, Integer page, Integer limit) {
        List items = new ArrayList();
        if (0 == type) {
            items = singleChoicService.getItems();
        } else if (1 == type) {
            items = multipleChoicService.getItems();
        } else if (2 == type) {
            items = fillBlankService.getItems();
        } else if (3 == type) {
            items = trueOrFalseService.getItems();
        } else if (4 == type) {
            items = quesAndAnsService.getItems();
        } else {
            return new ResponseBody(400, "no such type", null);
        }
        return new ResponseBody(items);
    }

    @PostMapping("/add")
    public ResponseBody addItem(BaseRequest request) {
        Integer type = request.getType();
        if (0 == type) {
            singleChoicService.insert(request);
        } else if (1 == type) {
            multipleChoicService.insert(request);
        } else if (2 == type) {
            fillBlankService.insert(request);
        } else if (3 == type) {
            trueOrFalseService.insert(request);
        } else if (4 == type) {
            quesAndAnsService.insert(request);
        } else {
            return new ResponseBody(400, "no such type", null);
        }
        return new ResponseBody();
    }

    @PostMapping("/delete")
    public ResponseBody deleteItem(Integer type, Integer id) {
        if (0 == type) {
            singleChoicService.delete(id);
        } else if (1 == type) {
            multipleChoicService.delete(id);
        } else if (2 == type) {
            fillBlankService.delete(id);
        } else if (3 == type) {
            trueOrFalseService.delete(id);
        } else if (4 == type) {
            quesAndAnsService.delete(id);
        } else {
            return new ResponseBody(400, "no such type", null);
        }
        return new ResponseBody();
    }

    @PostMapping("/batchDelete")
    public ResponseBody batchDelete(Integer type, String ids) {
        System.out.println(type);
        ids = ids.substring(0, ids.length() - 1);
        if (0 == type) {
            singleChoicService.batchDelete(ids);
        } else if (1 == type) {
            multipleChoicService.batchDelete(ids);
        } else if (2 == type) {
            fillBlankService.batchDelete(ids);
        } else if (3 == type) {
            trueOrFalseService.batchDelete(ids);
        } else if (4 == type) {
            quesAndAnsService.batchDelete(ids);
        } else {
            return new ResponseBody(400, "no such type", null);
        }
        return new ResponseBody();
    }

    @PostMapping("/update")
    public ResponseBody update(UpdateRequest request) {
        singleChoicService.update(request);
        return new ResponseBody();
    }
}
