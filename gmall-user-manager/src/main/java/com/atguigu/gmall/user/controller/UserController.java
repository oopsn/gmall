package com.atguigu.gmall.user.controller;

import com.atguigu.gamll.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: LIJINHU
 * @Date: 2019/12/25 16:16
 * @Description:
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("findAll")
    public List<UserInfo> findAll(){
        return  userService.findll();
    }

}
