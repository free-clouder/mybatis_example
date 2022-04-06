package com.atguigu.mybatis.pojo;

import org.apache.ibatis.type.SqlxmlTypeHandler;

public class User {
    private String academy;
    private String major;
    private String subject;
    private Integer qyt;

    public User(String academy, String major, String subject,Integer qyt){
        this.academy = academy;
        this.major = major;
        this.subject = subject;
        this.qyt = qyt;
    }

    public User() {
    }

    public String getAcademy() {
        return academy;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getQyt() {
        return qyt;
    }

    public void setQyt(Integer qyt) {
        this.qyt = qyt;
    }

    @Override
    public String toString() {
        return "User{" +
                "academy=" + academy + '\'' +
                ", major='" + major + '\'' +
                ", subject='" + subject + '\'' +
                ", qyt=" + qyt + '\'' +
                '}';
    }
}
