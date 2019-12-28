package com.atguigu.gmall.service;

import com.atguigu.gamll.bean.*;

import java.util.List;

/**
 * @Auther: LIJINHU
 * @Date: 2019/12/26 11:15
 * @Description:
 */
public interface ManageService {
    /**
     * 获得所有一级分类
     * @return
     */
    public List<BaseCatalog1> getCatalog1();

    /**
     * 根据一级分类id获得二级分类集合
     * @param catalog1Id
     * @return
     */
    public List<BaseCatalog2> getCatalog2(String catalog1Id);

    /**
     * 根据二级分类id获得三级分类集合
     * @param catalog2Id
     * @return
     */
    public List<BaseCatalog3> getCatalog3(String catalog2Id);

    /**
     * 根据三级分类id获得属性集合
     * @param catalog3Id
     * @return
     */
    public List<BaseAttrInfo> getAttrList(String catalog3Id);

    /**
     *添加属性信息
     * @param baseAttrInfo
     */
    void saveAttrInfo(BaseAttrInfo baseAttrInfo);

    /**
     *根据attrid获得属性信息
     * @param attrId
     * @return
     */
    BaseAttrInfo getAttrInfo(String attrId);

    /**
     * 通过三级分类id查询spu商品信息
     * @param spuInfo
     * @return
     */
    List<SpuInfo> getSpuInfoList(SpuInfo spuInfo);

    /**
     * 获得所有的基本销售属性集合
     * @return
     */
    List<BaseSaleAttr> getBaseSaleAttrList();

    /**
     * 添加spu商品信息
     * @param spuInfo
     */
    public void saveSpuInfo(SpuInfo spuInfo);
}
