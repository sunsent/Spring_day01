package com.f_annotation.b_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("stuActionID")
public class StuAction {
    //按照类型的引用注入
    @Autowired
    private StuService stuService;
    public void excute(){
        stuService.addStu();
    }
}
