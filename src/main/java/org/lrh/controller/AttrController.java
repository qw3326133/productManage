package org.lrh.controller;

import com.sun.org.apache.regexp.internal.RE;
import org.lrh.entity.po.Attr;
import org.lrh.entity.vo.PageParam;
import org.lrh.entity.vo.ResponseData;
import org.lrh.service.AttrService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/attr")
@CrossOrigin
public class AttrController {
    @Resource
    private AttrService attrSer;

    @PostMapping("addAttr")
    public ResponseData addAttr(Attr attr){
        if (attr==null){
            return ResponseData.error();
        }
        attrSer.addAttr(attr);
        return ResponseData.success("");
    }

    @GetMapping("queryAttrData")
    public ResponseData queryAttrData(PageParam param){
        if (param.getPage()==null){
            return ResponseData.error();
        }
        if (param.getLimit()==null){
            return ResponseData.error();
        }
        Map map = attrSer.queryAttrData(param);
        return ResponseData.success(map);
    }

    @GetMapping("queryAttrById")
    public ResponseData querytAttrById(Integer id){
        if (id==null){
            return ResponseData.error();
        }
        Attr attr = attrSer.querytAttrById(id);
        return ResponseData.success(attr);
    }
    @PostMapping("updateAttrById")
    public ResponseData updateAttrById(Attr attr){
        if (attr.getId()==null){
            return ResponseData.error();
        }
        attrSer.updateAttrById(attr);
        return ResponseData.success(attr);
    }
    @DeleteMapping("deleteAttrById")
    public ResponseData deleteAttrById(Integer id){
        if (id==null){
            return ResponseData.error();
        }
        attrSer.deleteAttrById(id);
        return ResponseData.success("");
    }
    @GetMapping("queryAttrDataAll")
    public ResponseData queryAttrDataAll(){
        List<Attr> list = attrSer.queryAttrDataAll();
        return ResponseData.success(list);
    }

}
