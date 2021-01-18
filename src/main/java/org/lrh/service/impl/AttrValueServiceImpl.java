package org.lrh.service.impl;

import org.lrh.dao.AttrValueDao;
import org.lrh.entity.po.AttrValue;
import org.lrh.entity.vo.PageParam;
import org.lrh.service.AttrValueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class AttrValueServiceImpl implements AttrValueService {
    @Resource
    private AttrValueDao avDao;

    @Override
    public List<AttrValue> queryAttrValueData(Integer attrId) {
        List<AttrValue> list = avDao.queryAttrValueData(attrId);
        return list;
    }

    @Override
    public void addAttrValue(AttrValue av) {
        Date d = new Date();
        av.setCreateDate(d);
        av.setUpdateDate(d);
        av.setAuthor("admin");
        avDao.addAttrValue(av);
    }

    @Override
    public AttrValue queryAttrValueById(Integer id) {
        AttrValue attrValue = avDao.queryAttrValueById(id);
        return attrValue;
    }

    @Override
    public void updateAttrValueById(AttrValue av) {
        av.setUpdateDate(new Date());
        avDao.updateAttrValueById(av);
    }

    @Override
    public void deleteAttrValueById(Integer id) {
        avDao.deleteAttrValueById(id);
    }

    @Override
    public List<AttrValue> queryAttrValueDataAll() {
        return avDao.queryAttrValueDataAll();
    }
}
