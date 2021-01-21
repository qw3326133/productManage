package org.lrh.service;

import org.lrh.entity.po.Product;
import org.lrh.entity.vo.PageParam;

import java.util.Map;

public interface ProductService {
    Integer addPro(Product pro);

    Map queryProductData(PageParam param);
}
