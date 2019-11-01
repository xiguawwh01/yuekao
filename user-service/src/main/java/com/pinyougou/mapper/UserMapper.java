package com.pinyougou.mapper;

import com.wwh.pojo.Bk;
import com.wwh.pojo.Pl;
import com.wwh.pojo.User;

import java.util.List;

/**
 * Created by 西瓜都不酸 on 2019/10/29.
 */
public interface UserMapper {
    public User login(String uname);

    public List<Bk> list();

    public List<Pl> plist();

    public void addbk(Bk bk);

    public Bk getbybkid(Integer id);

    public void addpl(Pl pl);

    public void upbk(Bk bk);
}
