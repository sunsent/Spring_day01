package com.b_DI;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {
    @Test
    public void test1(){
        String xmlPath="com/b_DI/beans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        BookService bookService = (BookService)applicationContext.getBean("BookServiceImpID");

        bookService.addBook();
    }
}
