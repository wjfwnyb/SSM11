package com.great.web;

import com.great.biz.Userbiz;
import com.great.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginAction {
    @Resource
    private Userbiz userbiz;
   @RequestMapping("login")
    public ModelAndView log(HttpServletRequest req,String uname,String upwd){
       System.out.println("欢迎登录");
       ModelAndView modelAndView=new ModelAndView();
       User user = userbiz.login(uname, upwd);
       if(user!=null){
           modelAndView.setViewName("suc");
           req.getSession().setAttribute("user",user);
       }else{
           modelAndView.setViewName("login");
       }
       return modelAndView;

   }
}
