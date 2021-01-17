package org.lrh.service.impl;

import org.lrh.dao.TypeDao;
import org.lrh.entity.po.ProductType;
import org.lrh.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Resource
    private TypeDao typeDao;

    @Override
    public List<ProductType> queryTypeData() {
        List<ProductType> list = typeDao.queryTypeData();
        return list;
    }

    @Override
    public Integer addType(ProductType pt) {
        Date d = new Date();
        pt.setCreateDate(d);
        pt.setUpdateDate(d);
        pt.setAuthor("admin");
        pt.setIsDel(0);
        Integer id = typeDao.addType(pt);
        return id;
    }

    @Override
    public List<ProductType> queryTypeByPid(Integer pid) {
        List<ProductType> list = typeDao.queryTypeByPid(pid);
        return list;
    }

    @Override
    public void updateTypeById(ProductType pt) {
        Date d = new Date();
        pt.setUpdateDate(d);
        pt.setIsDel(0);
        typeDao.updateTypeById(pt);
    }

    @Override
    public void deleteTypeById(Integer id) {
        typeDao.deleteTypeById(id);
    }
}
