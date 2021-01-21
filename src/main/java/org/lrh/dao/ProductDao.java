package org.lrh.dao;

import org.lrh.entity.po.Product;
import org.lrh.entity.vo.PageParam;

import java.util.List;

public interface ProductDao {
    void addPro(Product pro);

    Integer queryProductCount(PageParam param);

    List<Product> queryProductData(PageParam param);
}
