package com.nwafu.itempool.service.impl;

import com.nwafu.itempool.beans.Teacher;
import com.nwafu.itempool.mapper.TeacherMapper;
import com.nwafu.itempool.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseTeacherService implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Boolean checkLogin(String username, String password) {
        Teacher teacher = teacherMapper.checkLogin(username, password);
        return teacher != null;
    }
}
