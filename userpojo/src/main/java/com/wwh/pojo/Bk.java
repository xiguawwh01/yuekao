package com.wwh.pojo;

import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 西瓜都不酸 on 2019/10/29.
 */
public class Bk implements Serializable{
    @Field
    private int id;
    @Field("user_cont")
    private String cont;
    @Field("user_zname")
    private String zname;
    @Field("user_fdate")
    private Date fdate;
    @Field("user_count")
    private int count;
    @Field("user_tz")
    private int tz;
    @Field("user_tname")
    private String tname;

    public String getTname() {
        return tname;
    }

    public Bk setTname(String tname) {
        this.tname = tname;
        return this;
    }

    public int getId() {
        return id;
    }

    public Bk setId(int id) {
        this.id = id;
        return this;
    }

    public String getCont() {
        return cont;
    }

    public Bk setCont(String cont) {
        this.cont = cont;
        return this;
    }

    public String getZname() {
        return zname;
    }

    public Bk setZname(String zname) {
        this.zname = zname;
        return this;
    }

    public Date getFdate() {
        return fdate;
    }

    public Bk setFdate(Date fdate) {
        this.fdate = fdate;
        return this;
    }

    public int getCount() {
        return count;
    }

    public Bk setCount(int count) {
        this.count = count;
        return this;
    }

    public int getTz() {
        return tz;
    }

    public Bk setTz(int tz) {
        this.tz = tz;
        return this;
    }
}
