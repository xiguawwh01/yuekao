package com.wwh.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 西瓜都不酸 on 2019/10/29.
 */
public class Pl implements Serializable{

    private int pid;
    private String pname;
    private String pcount;
    private Date pdate;

    public int getPid() {
        return pid;
    }

    public Pl setPid(int pid) {
        this.pid = pid;
        return this;
    }

    public String getPname() {
        return pname;
    }

    public Pl setPname(String pname) {
        this.pname = pname;
        return this;
    }

    public String getPcount() {
        return pcount;
    }

    public Pl setPcount(String pcount) {
        this.pcount = pcount;
        return this;
    }

    public Date getPdate() {
        return pdate;
    }

    public Pl setPdate(Date pdate) {
        this.pdate = pdate;
        return this;
    }
}
