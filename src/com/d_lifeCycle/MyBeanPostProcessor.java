package com.d_lifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("BeforeInitialization"+s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(final Object o, String s) throws BeansException {
        System.out.println("AfterInitialization"+s);
        /*
        代理是Java常用的设计模式，代理类通过调用被代理类的相关方法，并对相关方法进行增强。加入一些非业务性代码，比如事务、日志、报警发邮件等操作。
         */
        //生成jdk代理对象,o被代理. 如果有多个bean,如何知道代理的是哪个? postProcessAfterInitialization第二个参数beanName
        return Proxy.newProxyInstance(MyBeanPostProcessor.class.getClassLoader(), o.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("在目标方法前开启事务");
                //执行目标方法,  如果有多个方法,如何知道哪个是目标方法? method.getName().equals
                Object obj = method.invoke(o, args);
                System.out.println("在目标方法后提交事务");
                return obj;
            }
        });
    }
}
