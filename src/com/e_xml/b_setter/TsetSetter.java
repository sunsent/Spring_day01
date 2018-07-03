package com.e_xml.b_setter;

import com.d_lifeCycle.MyBeanFactory;
import com.d_lifeCycle.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TsetSetter {
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
        String xmlPath="com/e_xml/b_setter/beans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        Person person=applicationContext.getBean("personID",Person.class);
        System.out.println(person);
    }
}
