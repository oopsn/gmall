package com.atguigu.gamll.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Auther: LIJINHU
 * @Date: 2019/12/28 16:56
 * @Description:
 */
@Data
public class SkuAttrValue implements Serializable {

    @Id
    @Column
    String id;

    @Column
    String attrId;

    @Column
    String valueId;

    @Column
    String skuId;
}
