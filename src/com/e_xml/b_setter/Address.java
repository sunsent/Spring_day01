package com.e_xml.b_setter;

public class Address {
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    private String addr;
    private String tel;

    @Override
    public String toString() {
        return "Address{" +
                "addr='" + addr + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
