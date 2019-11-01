package com.wwh.pojo;

import java.io.Serializable;

/**
 * Created by 西瓜都不酸 on 2019/10/29.
 */
public class User implements Serializable{


    private int uid;
    private String uname;
    private String pwd;
    private String tel;

    public int getUid() {
        return uid;
    }

    public User setUid(int uid) {
        this.uid = uid;
        return this;
    }

    public String getUname() {
        return uname;
    }

    public User setUname(String uname) {
        this.uname = uname;
        return this;
    }

    public String getPwd() {
        return pwd;
    }

    public User setPwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

    public String getTel() {
        return tel;
    }

    public User setTel(String tel) {
        this.tel = tel;
        return this;
    }
}
