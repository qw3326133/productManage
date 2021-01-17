package org.lrh.service.impl;

import org.lrh.dao.BrandDao;
import org.lrh.entity.po.Brand;
import org.lrh.entity.vo.PageParam;
import org.lrh.service.BrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BrandServiceImpl implements BrandService {
    @Resource
    private BrandDao brandDao;

    @Override
    public Map queryBrandData(PageParam param) {
        Map map = new HashMap();
        param.getStartIndex();
        List<Brand> list = brandDao.queryBrandData(param);
        Integer count = brandDao.queryBrandCount(param);
        map.put("list",list);
        map.put("count",count);
        return map;
    }

    @Override
    public void addBrand(Brand brand) {
        brandDao.addBrand(brand);
    }

    @Override
    public Brand queryBrandById(Integer id) {
        Brand brand = brandDao.queryBrandById(id);
        return brand;
    }

    @Override
    public void updateBrandById(Brand brand) {
        brandDao.updateBrandById(brand);
    }

    @Override
    public void deleteBrandById(Integer id) {
        brandDao.deleteBrandById(id);
    }
}
