package com.f_annotation.b_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StuServiceImpl implements StuService {
    @Autowired
    @Qualifier("stuDaoID")
    public void setStuDao(StuDao stuDao) {
        this.stuDao = stuDao;
    }


    private StuDao stuDao;
    @Override
    public void addStu() {
        stuDao.save();
    }
}
