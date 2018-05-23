package com.nwafu.itempool.controller;

import com.nwafu.itempool.module.ResponseBody;
import com.nwafu.itempool.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/login")
    public ResponseBody checkLogin(String username, String password) {
        System.out.println(username + "====" + password);
        Boolean checkLogin = teacherService.checkLogin(username, password);
        return new ResponseBody(checkLogin);
    }
}
