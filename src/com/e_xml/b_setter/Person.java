package com.e_xml.b_setter;

public class Person {
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getHomeAddr() {
        return homeAddr;
    }

    public void setHomeAddr(Address homeAddr) {
        this.homeAddr = homeAddr;
    }

    public Address getCmpAddr() {
        return cmpAddr;
    }

    public void setCmpAddr(Address cmpAddr) {
        this.cmpAddr = cmpAddr;
    }

    private String pname;
    private int age;
    private Address homeAddr;
    private Address cmpAddr;

    @Override
    public String toString() {
        return "Person{" +
                "pname='" + pname + '\'' +
                ", age=" + age +
                ", homeAddr=" + homeAddr +
                ", cmpAddr=" + cmpAddr +
                '}';
    }
}
