package com.nwafu.organizepaper.controller;

import com.nwafu.itempool.beans.PaperInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author TinChiWay
 * @data 2018/5/4
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PaperInfoControllerTest {

    @Autowired
    private PaperInfoController paperInfoController;

    @Test
    public void getPapercompleteInfo() {
        paperInfoController.getPapercompleteInfo(1002);
    }
}