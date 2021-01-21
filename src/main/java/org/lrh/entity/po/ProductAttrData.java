package org.lrh.entity.po;

public class ProductAttrData {

    private Integer id;

    private Integer proId;

    private String attrData;

    private Integer stocks;

    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getAttrData() {
        return attrData;
    }

    public void setAttrData(String attrData) {
        this.attrData = attrData;
    }

    public Integer getStocks() {
        return stocks;
    }

    public void setStocks(Integer stocks) {
        this.stocks = stocks;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
