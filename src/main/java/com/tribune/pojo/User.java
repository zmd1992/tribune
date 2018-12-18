package com.tribune.pojo;

import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.util.Date;


/**
 * created by zhangmengdan
 * created at 2018/12/16 23:02
 **/
public class User {
    private Integer id;
    private String userName;
    private String password;
    private String sex;
    private Date birthday;
    private String email;


    public User() {
    }

    public User(Integer id, String userName, String password, String sex, Date birthday, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.sex=sex;
        this.birthday = birthday;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
