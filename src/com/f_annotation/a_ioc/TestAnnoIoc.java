package com.f_annotation.a_ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnoIoc {
    @Test
    public void test1(){
        //传统方法
        UserService user=new UserServiceImp();
        user.addUser();
    }

    @Test
    public void test2(){
        //Spring
        //1. 获得容器
        String xmlPath= "com/f_annotation/a_ioc/beans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        //2. 获得内容,不需要自己new
        UserService user=(UserService) applicationContext.getBean("UserServiceImpID");
        user.addUser();
    }
}
