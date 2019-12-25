package com.atguigu.gmall.service;

import com.atguigu.gamll.bean.UserAddress;
import com.atguigu.gamll.bean.UserInfo;

import java.util.List;

/**
 * @Auther: LIJINHU
 * @Date: 2019/12/25 13:59
 * @Description:
 */
public interface UserService {
    /**
     * 查询所有的用户
     * @return
     */
    List<UserInfo> findll();

    /**
     * 根据用户id查询用户地址
     * @param userId
     * @return
     */
    List<UserAddress> findUserAddressByUserId(String userId);
}
