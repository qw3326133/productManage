package org.lrh.controller;

import com.sun.org.apache.regexp.internal.RE;
import org.lrh.entity.po.Brand;
import org.lrh.entity.vo.PageParam;
import org.lrh.entity.vo.ResponseData;
import org.lrh.service.BrandService;
import org.lrh.utils.Upload;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("api/brand")
@CrossOrigin
public class BrandController {
    @Resource
    private BrandService brandSer;

    @PostMapping("upload")
    public ResponseData uploadFile(MultipartFile file){
        if (file==null){
            return ResponseData.error();
        }
        //获取文件类型
        String fileType= file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        //设置新的文件名（以防中文名称引起错误）
        String newFileName="images/"+ UUID.randomUUID().toString()+fileType;
        String imgPath = null;
        try {
            imgPath = Upload.uploadFile(file.getInputStream(), newFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResponseData.success(imgPath);
    }
    @GetMapping("queryBrandData")
    public ResponseData queryBrandData(PageParam param){
        if(param.getLimit()==null){
            return ResponseData.error();
        }
        if(param.getPage()==null){
            return ResponseData.error();
        }
        Map map = brandSer.queryBrandData(param);
        return ResponseData.success(map);
    }
    @PostMapping("addBrand")
    public ResponseData addBrand(Brand brand){
        if (brand==null){
            return ResponseData.error();
        }
        brandSer.addBrand(brand);
        return ResponseData.success("");
    }
    @GetMapping("queryBrandById")
    public ResponseData queryBrandById(Integer id){
        if (id==null){
            return ResponseData.error();
        }
        Brand brand = brandSer.queryBrandById(id);
        return ResponseData.success(brand);
    }

    @PostMapping("updateBrandById")
    public ResponseData updateBrandById(Brand brand){
        if (brand.getId() == null){
            return ResponseData.error();
        }
        brandSer.updateBrandById(brand);
        return ResponseData.success("");
    }
    @DeleteMapping("deleteBrandById")
    public ResponseData deleteBrandById(Integer id){
        if (id==null){
            return ResponseData.error();
        }
        brandSer.deleteBrandById(id);
        return ResponseData.success("");
    }
    @GetMapping("queryBrandDataAll")
    public ResponseData queryBrandDataAll(){
        List<Brand> list = brandSer.queryBrandDataAll();
        return ResponseData.success(list);
    }
}
