package org.lrh.service.impl;

import org.lrh.dao.AttrDao;
import org.lrh.entity.po.Attr;
import org.lrh.entity.vo.PageParam;
import org.lrh.service.AttrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AttrServiceImpl implements AttrService {
    @Resource
    private AttrDao attrDao;

    @Override
    public void addAttr(Attr attr) {
        Date d = new Date();
        attr.setCreateDate(d);
        attr.setUpdateDate(d);
        attr.setAuthor("admin");
        attrDao.addAttr(attr);
    }

    @Override
    public Map queryAttrData(PageParam param) {
        param.getStartIndex();
        Map map = new HashMap();
        List<Attr> attrs = attrDao.queryAttrData(param);
        Integer count = attrDao.queryAttrCount(param);
        map.put("list",attrs);
        map.put("count",count);
        return map;
    }

    @Override
    public void updateAttrById(Attr attr) {
        attr.setUpdateDate(new Date());
        attr.setAuthor("admin");
        attrDao.updateAttrById(attr);
    }

    @Override
    public Attr querytAttrById(Integer id) {
        Attr attr = attrDao.queryAttrById(id);
        return attr;
    }

    @Override
    public void deleteAttrById(Integer id) {
        attrDao.deleteAttrById(id);
    }
}
