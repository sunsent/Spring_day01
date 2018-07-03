package com.e_xml.c_coll;

import com.d_lifeCycle.MyBeanFactory;
import com.d_lifeCycle.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TsetColl {
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
        String xmlPath="com/e_xml/c_coll/beans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        CollData collData=applicationContext.getBean("collDataID",CollData.class);
        System.out.println(collData);
    }
}
