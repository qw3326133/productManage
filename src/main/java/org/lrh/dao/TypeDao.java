package org.lrh.dao;

import org.lrh.entity.po.ProductType;

import java.util.List;

public interface TypeDao {
    List<ProductType> queryTypeData();

    Integer addType(ProductType pt);

    List<ProductType> queryTypeByPid(Integer pid);

    void updateTypeById(ProductType pt);

    void deleteTypeById(Integer id);
}
