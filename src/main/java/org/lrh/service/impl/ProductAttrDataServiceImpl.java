package org.lrh.service.impl;

import org.lrh.dao.ProductAttrDataDao;
import org.lrh.entity.po.ProductAttrData;
import org.lrh.service.ProductAttrDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProductAttrDataServiceImpl implements ProductAttrDataService {
    @Resource
    private ProductAttrDataDao padDao;

    @Override
    public void addProductAttr(ProductAttrData pad) {
        padDao.addProductAttr(pad);
    }
}
