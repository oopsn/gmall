package com.atguigu.gamll.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Auther: LIJINHU
 * @Date: 2019/12/28 16:53
 * @Description:
 */
@Data
public class SkuSaleAttrValue implements Serializable {
    @Id
    @Column
    String id;

    @Column
    String skuId;

    @Column
    String saleAttrId;

    @Column
    String saleAttrValueId;

    @Column
    String saleAttrName;

    @Column
    String saleAttrValueName;
}
