package com.atguigu.gmall.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gamll.bean.UserAddress;
import com.atguigu.gmall.service.UserService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: LIJINHU
 * @Date: 2019/12/25 16:37
 * @Description:
 */
@RestController
public class OrderController {
    @Reference
    private UserService userService;
    @RequestMapping("trade")
    public List<UserAddress> trade(String userId){
        return userService.findUserAddressByUserId(userId);

    }
}
