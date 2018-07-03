package com.d_lifeCycle;

/**
 * 实例工厂
 */
public class MyBeanFactory {
    /**
     * 创建实例
     * @return
     */
    public UserService createUserService(){
        return new UserServiceImp();
    }
}
