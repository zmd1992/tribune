package com.tribune.core;

import javax.jnlp.IntegrationService;

/**
 * created by zhangmengdan
 * created at 2018/12/16 20:34
 **/
public class Student {
    private Integer sId;
    private String sName;
    private String sPass;
    public Student(){}

    public Student(Integer sId, String sName, String sPass) {
        this.sId = sId;
        this.sName = sName;
        this.sPass = sPass;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsPass() {
        return sPass;
    }

    public void setsPass(String sPass) {
        this.sPass = sPass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sPass='" + sPass + '\'' +
                '}';
    }
}
