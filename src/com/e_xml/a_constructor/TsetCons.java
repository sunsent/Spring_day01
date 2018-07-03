package com.e_xml.a_constructor;

import com.d_lifeCycle.MyBeanFactory;
import com.d_lifeCycle.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TsetCons {
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
        String xmlPath="com/e_xml/a_constructor/beans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        User user=applicationContext.getBean("userID",User.class);
        System.out.println(user);
    }
}
