package org.lrh.dao;

import org.lrh.entity.po.Attr;
import org.lrh.entity.vo.PageParam;

import java.util.List;

public interface AttrDao {
    void addAttr(Attr attr);

    List<Attr> queryAttrData(PageParam param);

    Integer queryAttrCount(PageParam param);

    Attr queryAttrById(Integer id);

    void updateAttrById(Attr attr);

    void deleteAttrById(Integer id);

    List<Attr> queryAttrDataAll();
}
