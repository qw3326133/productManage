package org.lrh.controller;

import org.lrh.entity.po.Product;
import org.lrh.entity.vo.PageParam;
import org.lrh.entity.vo.ResponseData;
import org.lrh.service.ProductService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("api/product")
@CrossOrigin
public class ProductController {
    @Resource
    private ProductService proSer;

    @PostMapping("addPro")
    public ResponseData addPro(Product pro){
        if (pro==null){
            return ResponseData.error();
        }
        Integer id = proSer.addPro(pro);
        return ResponseData.success(id);
    }
    @GetMapping("queryProductData")
    public ResponseData queryProductData(PageParam param){
        if (param.getPage() == null){
            return ResponseData.error();
        }
        if (param.getLimit()==null){
            return ResponseData.error();
        }
        Map map = proSer.queryProductData(param);
        return ResponseData.success(map);
    }

}
