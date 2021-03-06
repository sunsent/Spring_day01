package com.c_inject.c_factory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory {
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
        String xmlPath="com/c_inject/c_factory/beans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        UserService userService=applicationContext.getBean("UserServiceID",UserService.class);
        userService.addUser();
    }
}
