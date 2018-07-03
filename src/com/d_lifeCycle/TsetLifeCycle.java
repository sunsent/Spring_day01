package com.d_lifeCycle;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TsetLifeCycle {
    //传统方法
    @Test
    public void test1(){
        MyBeanFactory myBeanFactory=new MyBeanFactory();
        UserService userService=myBeanFactory.createUserService();
        userService.addUser();
    }
    //Spring
    @Test
    public  void test2(){
        String xmlPath="com/d_lifeCycle/beans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        UserService userService=applicationContext.getBean("UserServiceID",UserService.class);
        userService.addUser();
        //1. 容器必须close,销毁方法才执行 2. 必须是单例
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
