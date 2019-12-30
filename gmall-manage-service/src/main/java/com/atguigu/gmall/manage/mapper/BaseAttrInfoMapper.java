package com.atguigu.gmall.manage.mapper;


import com.atguigu.gamll.bean.BaseAttrInfo;
import tk.mybatis.mapper.common.Mapper;


import java.util.List;

/**
 * @Auther: LIJINHU
 * @Date: 2019/12/26 11:12
 * @Description:
 */
public interface BaseAttrInfoMapper extends Mapper<BaseAttrInfo> {

     List<BaseAttrInfo> selectBaseAttrInfoListByCatalog3Id  (String catalog3Id);

}
