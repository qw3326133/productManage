package org.lrh.service;

import org.lrh.entity.po.AttrValue;
import org.lrh.entity.vo.PageParam;

import java.util.List;

public interface AttrValueService {
    List<AttrValue> queryAttrValueData(Integer attrId);

    void addAttrValue(AttrValue av);

    AttrValue queryAttrValueById(Integer id);

    void updateAttrValueById(AttrValue av);

    void deleteAttrValueById(Integer id);

    List<AttrValue> queryAttrValueDataAll();
}
