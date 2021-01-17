package org.lrh.controller;

import com.sun.org.apache.regexp.internal.RE;
import org.lrh.entity.po.ProductType;
import org.lrh.entity.vo.ResponseData;
import org.lrh.service.TypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("api/type")
@CrossOrigin
public class TypeController {
    @Resource
    private TypeService typeSer;

    @GetMapping("getData")
    public ResponseData queryTypeData(){
        List<ProductType> list = typeSer.queryTypeData();
        return ResponseData.success(list);
    }
    @PostMapping("add")
    public ResponseData addType(ProductType pt){
        if (pt==null){
            return ResponseData.error();
        }
        Integer id = typeSer.addType(pt);
        return ResponseData.success(id);
    }
    @GetMapping("getDataByPid")
    public ResponseData queryTypeByPid(Integer pid){
        if (pid==null){
            return ResponseData.error();
        }
        List<ProductType> list = typeSer.queryTypeByPid(pid);
        return ResponseData.success(list);
    }
    @PostMapping("updateTypeById")
    public ResponseData updateTypeById(ProductType pt){
        if (pt==null){
            return ResponseData.error();
        }
        typeSer.updateTypeById(pt);
        return ResponseData.success(null);
    }
    @DeleteMapping("deleteTypeById")
    public ResponseData deleteTypeById(Integer id){
        if (id==null){
            return ResponseData.error();
        }
        typeSer.deleteTypeById(id);
        return ResponseData.success(null);
    }
}
