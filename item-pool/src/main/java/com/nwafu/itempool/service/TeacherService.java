package com.nwafu.itempool.service;

import com.nwafu.itempool.beans.Teacher;

public interface TeacherService {

    Teacher checkLogin(String username, String password);
}
