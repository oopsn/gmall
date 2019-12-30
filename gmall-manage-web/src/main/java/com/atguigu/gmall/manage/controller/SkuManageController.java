package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gamll.bean.SkuInfo;
import com.atguigu.gamll.bean.SpuImage;
import com.atguigu.gamll.bean.SpuSaleAttr;
import com.atguigu.gmall.service.ManageService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: LIJINHU
 * @Date: 2019/12/28 16:16
 * @Description:
 */
@RestController
@CrossOrigin
public class SkuManageController {
    @Reference
    private ManageService manageService;

    @RequestMapping("spuImageList")
    public List<SpuImage> spuImageList(String spuId) {
        return manageService.getSpuImageList(spuId);
    }

    @RequestMapping("spuSaleAttrList")
    public List<SpuSaleAttr> getspuSaleAttrList(String spuId) {
        List<SpuSaleAttr> spuSaleAttrList = manageService.getSpuSaleAttrList(spuId);
        return spuSaleAttrList;
    }

    @RequestMapping("saveSkuInfo")
    public String saveSkuInfo(@RequestBody SkuInfo skuInfo) {
        manageService.saveSkuInfo(skuInfo);
        return "OK";
    }

}
