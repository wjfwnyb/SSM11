package com.great.web;

import com.great.biz.Userbiz;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class UserAction {
    @Resource
    private Userbiz userbiz;
    @RequestMapping("login")
    public ModelAndView add(Object obj){
        System.out.println("注册");
        ModelAndView modelAndView=new ModelAndView();

        return modelAndView;
    }
}
