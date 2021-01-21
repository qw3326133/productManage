package org.lrh.controller;

import org.lrh.entity.po.ProductAttrData;
import org.lrh.entity.vo.ResponseData;
import org.lrh.service.ProductAttrDataService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("api/padCon")
@CrossOrigin
public class ProductAttrDataController {
    @Resource
    private ProductAttrDataService padSer;

    @PostMapping("addProductAttr")
    public ResponseData addProductAttr(ProductAttrData pad){
        padSer.addProductAttr(pad);
        return ResponseData.success("");
    }
}
