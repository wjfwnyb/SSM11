package com.great.biz;

import com.great.entity.User;
import com.great.map.Usermap;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userbiz")
public class Userbizimp implements Userbiz {
    @Resource
    private Usermap usermap;
    @Override
    public User login(String userid, String upwd) {

        return usermap.login(userid,upwd);
    }
}
