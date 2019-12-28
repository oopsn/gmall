package com.atguigu.gamll.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @Auther: LIJINHU
 * @Date: 2019/12/26 11:03
 * @Description:
 */
@Data
public class BaseAttrInfo implements Serializable {
        @Id
        @Column
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private String id;
        @Column
        private String attrName;
        @Column
        private String catalog3Id;
        @Transient
        private List<BaseAttrValue> attrValueList;


}
