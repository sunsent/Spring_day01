package com.c_inject.b_static_factory;

public class UserServiceImp implements UserService {
    @Override
    public void addUser(){
        System.out.println("b_static_factory add a_IOC user");
    }
}
