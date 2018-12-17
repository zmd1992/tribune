package com.tribune.pojo;

/**
 * created by zhangmengdan
 * created at 2018/12/16 23:02
 **/
public class User {
    private Integer id;
    private String userName;
    private String password;
    private Integer sex;
    private Integer age;
    private String company;

    public User() {
    }

    public User(Integer id, String userName, String password, Integer sex, Integer age, String company) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.company = company;
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
