package com.pinyougou.shop.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.sellergoods.service.UserService;
import com.wwh.pojo.Bk;
import com.wwh.pojo.Pl;
import com.wwh.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by 西瓜都不酸 on 2019/10/29.
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Reference
    private UserService sev;

    @RequestMapping(value = "/login")
    public String login(@RequestBody User user){
        User uu=sev.login(user.getUname());


        System.out.println( "232332333333333333333333");
        return "";
    }

    @RequestMapping(value = "/list")
    public List<Bk> list(){
        List<Bk> list=sev.list();
        return list;
    }

    @RequestMapping(value = "/plist")
    public List<Pl> plist(){
        List<Pl> list=sev.plist();
        return list;
    }

    @RequestMapping(value = "/addbk")
    public String addbk(@RequestBody Bk bk){
        sev.addbk(bk);

        return "";
    }

    @RequestMapping(value = "/addpl")
    public String addpl(@RequestBody Pl pl,Integer id){
        System.out.println(pl.getPname());
        System.out.println(id);
        pl.setPdate(new Date());
        sev.addpl(pl,id);
        return "";
    }
}
