package com.atguigu.gamll.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Auther: LIJINHU
 * @Date: 2019/12/25 16:40
 * @Description:
 */
@Data
public class UserAddress implements Serializable {
    @Column
    @Id
    private String id;
    @Column
    private String userAddress;
    @Column
    private String userId;
    @Column
    private String consignee;
    @Column
    private String phoneNum;
    @Column
    private String isDefault;
}
