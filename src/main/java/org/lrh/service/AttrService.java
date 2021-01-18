package org.lrh.service;

import org.lrh.entity.po.Attr;
import org.lrh.entity.vo.PageParam;

import java.util.List;
import java.util.Map;

public interface AttrService {
    void addAttr(Attr attr);

    Map queryAttrData(PageParam param);

    void updateAttrById(Attr attr);

    Attr querytAttrById(Integer id);

    void deleteAttrById(Integer id);

    List<Attr> queryAttrDataAll();

}
