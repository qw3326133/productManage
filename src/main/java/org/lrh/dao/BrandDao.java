package org.lrh.dao;

import org.lrh.entity.po.Brand;
import org.lrh.entity.vo.PageParam;

import java.util.List;

public interface BrandDao {
    List<Brand> queryBrandData(PageParam param);

    Integer queryBrandCount(PageParam param);

    void addBrand(Brand brand);

    Brand queryBrandById(Integer id);

    void updateBrandById(Brand brand);

    void deleteBrandById(Integer id);
}
