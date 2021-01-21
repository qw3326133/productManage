package org.lrh.service.impl;

import org.lrh.dao.ProductDao;
import org.lrh.entity.po.Product;
import org.lrh.entity.vo.PageParam;
import org.lrh.service.ProductService;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductDao proDao;

    @Override
    public Integer addPro(Product pro) {
        Date d = new Date();
        pro.setCreateDate(d);
        pro.setUpdateDate(d);
        pro.setAuthor("admin");
        proDao.addPro(pro);
        return pro.getId();
    }

    @Override
    public Map queryProductData(PageParam param) {
        Map map = new HashMap();
        List<Product> list = proDao.queryProductData(param);
        Integer count = proDao.queryProductCount(param);
        map.put("list",list);
        map.put("count",count);
        return map;
    }
}
