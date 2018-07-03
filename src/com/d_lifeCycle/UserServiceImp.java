package com.d_lifeCycle;

public class UserServiceImp implements UserService {
    public void myInit(){
        System.out.println("初始化:");
    }
    public void myDestroy(){
        System.out.println("销毁.");
    }
    @Override
    public void addUser(){
        System.out.println("d_lifeCycle add a_IOC user");
    }
}
