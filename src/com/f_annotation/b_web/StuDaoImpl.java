package com.f_annotation.b_web;

import org.springframework.stereotype.Repository;

@Repository("stuDaoID")
public class StuDaoImpl implements StuDao {
    @Override
    public void save() {
        System.out.println("StuDaoImpl");
    }
}
