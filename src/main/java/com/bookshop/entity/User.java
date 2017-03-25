package com.bookshop.entity;

/**
 * Created by dl on 2017/3/15.
 */
public class User {
    private Integer userID;
    private String userName;
    private String password;
    private String email;
    private String realName;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getUserID() {
        return userID;
    }
    public void setUserID(Integer userID) {
        this.userID = userID;
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
}
