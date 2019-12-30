package com.atguigu.gmall.manage.mapper;

import com.atguigu.gamll.bean.SpuSaleAttr;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Auther: LIJINHU
 * @Date: 2019/12/27 21:07
 * @Description:
 */
public interface SpuSaleAttrMapper extends Mapper<SpuSaleAttr> {
    List<SpuSaleAttr> selectSpuSaleAttrList(String spuId);
}
