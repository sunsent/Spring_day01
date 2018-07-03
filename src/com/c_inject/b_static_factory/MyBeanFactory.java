package com.c_inject.b_static_factory;

public class MyBeanFactory {
    /**
     * 创建实例
     * @return
     */
    public static UserService createUserService(){
        return new UserServiceImp();
    }
}
