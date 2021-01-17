package org.lrh.service;

import org.lrh.entity.po.ProductType;

import java.util.List;

public interface TypeService {
    List<ProductType> queryTypeData();

    Integer addType(ProductType pt);

    List<ProductType> queryTypeByPid(Integer pid);

    void updateTypeById(ProductType pt);

    void deleteTypeById(Integer id);
}
