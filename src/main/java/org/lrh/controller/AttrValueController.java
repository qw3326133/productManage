package org.lrh.controller;

import org.lrh.entity.po.Attr;
import org.lrh.entity.po.AttrValue;
import org.lrh.entity.vo.PageParam;
import org.lrh.entity.vo.ResponseData;
import org.lrh.service.AttrValueService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("api/avc")
@CrossOrigin
public class AttrValueController {
    @Resource
    private AttrValueService avSer;

    @GetMapping("queryAttrValueData")
    public ResponseData queryAttrValueData(Integer attrId){
       if (attrId==null){
           return ResponseData.error();
       }
       List<AttrValue> list = avSer.queryAttrValueData(attrId);
       return ResponseData.success(list);
    }

    @PostMapping("addAttrValue")
    public ResponseData addAttrValue(AttrValue av){
        if (av == null){
            return ResponseData.error();
        }
        avSer.addAttrValue(av);
        return ResponseData.success("");
    }
    @GetMapping("queryAttrValueById")
    public ResponseData queryAttrValueById(Integer id){
        if (id==null){
            return ResponseData.error();
        }
        AttrValue av = avSer.queryAttrValueById(id);
        return ResponseData.success(av);
    }
    @PostMapping("updateAttrValueById")
    public ResponseData updateAttrValueById(AttrValue av){
        if (av.getId()==null){
            return ResponseData.error();
        }
        avSer.updateAttrValueById(av);
        return ResponseData.success("");
    }
    @GetMapping("queryAttrValueDataAll")
    public ResponseData queryAttrValueDataAll(){
        List<AttrValue> list = avSer.queryAttrValueDataAll();
        return ResponseData.success(list);
    }

}
