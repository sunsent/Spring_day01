package com.c_inject.c_factory;

public class UserServiceImp implements UserService {

    @Override
    public void addUser(){
        System.out.println("c_factory add a_IOC user");
    }
}
