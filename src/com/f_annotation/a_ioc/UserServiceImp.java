package com.f_annotation.a_ioc;

import org.springframework.stereotype.Component;

@Component("UserServiceImpID")
public class UserServiceImp implements UserService {
    @Override
    public void addUser(){
        System.out.println("f_annotation.a_ioc add a_IOC user");
    }
}
