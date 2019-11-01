package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.UserMapper;
import com.pinyougou.sellergoods.service.UserService;
import com.wwh.pojo.Bk;
import com.wwh.pojo.Pl;
import com.wwh.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.jms.core.JmsTemplate;

import java.util.List;

/**
 * Created by 西瓜都不酸 on 2019/10/29.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper mapper;

    @Autowired
    private JmsTemplate jms;

    @Autowired
     private SolrTemplate solrTemplate;
    @Override
    public User login(String uname) {
        return mapper.login(uname);
    }

    @Override
    public List<Bk> list() {
        List<Bk> list = mapper.list();
            solrTemplate.saveBeans(list);
            solrTemplate.commit();
        return list;
    }

    @Override
    public List<Pl> plist() {
        return mapper.plist();
    }

    @Override
    public void addbk(Bk bk) {
        mapper.addbk(bk);

    }

    @Override
    public void addpl(Pl pl, Integer id) {
        Bk bk=mapper.getbybkid(id);
        if(bk.getTz()==1){
            jms.convertAndSend("dd","有一条评论");

        }
        mapper.addpl(pl);
        bk.setCount(bk.getCount()+1);
        mapper.upbk(bk);
    }
}
