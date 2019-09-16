package com.great.map;

import com.great.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Usermap {
    public User login(@Param("userid") String userid,@Param("upwd") String upwd);
}
