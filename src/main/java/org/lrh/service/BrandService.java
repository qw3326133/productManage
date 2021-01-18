package org.lrh.service;

import org.lrh.entity.po.Brand;
import org.lrh.entity.vo.PageParam;

import java.util.List;
import java.util.Map;

public interface BrandService {
    Map queryBrandData(PageParam param);

    void addBrand(Brand brand);

    Brand queryBrandById(Integer id);

    void updateBrandById(Brand brand);

    void deleteBrandById(Integer id);

    List<Brand> queryBrandDataAll();
}
