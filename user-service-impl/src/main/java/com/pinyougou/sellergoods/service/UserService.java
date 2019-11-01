package com.pinyougou.sellergoods.service;

import com.wwh.pojo.Bk;
import com.wwh.pojo.Pl;
import com.wwh.pojo.User;

import java.util.List;

/**
 * Created by 西瓜都不酸 on 2019/10/29.
 */
public interface UserService {

    public User login(String uname);

    public List<Bk> list();

    public List<Pl> plist();

    public void addbk(Bk bk);

    public void addpl(Pl pl,Integer id);
}
