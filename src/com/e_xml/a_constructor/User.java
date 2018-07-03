package com.e_xml.a_constructor;

public class User {

    public User(Integer uid, String name) {
        this.uid = uid;
        this.usrName = name;
    }

    public User(String name, Integer age) {
        this.age = age;
        this.usrName = name;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return usrName;
    }

    public void setName(String name) {
        this.usrName = name;
    }

    private Integer uid;
    private Integer age;
    private String usrName;

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", age=" + age +
                ", name='" + usrName + '\'' +
                '}';
    }
}
