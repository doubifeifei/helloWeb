package com.baseWeb.entity.goods;

import java.math.BigDecimal;
import java.util.List;

public class Student {
    private String id;
    private BigDecimal markPrice;
    private List<BigDecimal> markPriceList;
    private List<String> markPriceListStr;
    private Teacher teacher;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getMarkPrice() {
        return markPrice;
    }

    public void setMarkPrice(BigDecimal markPrice) {
        this.markPrice = markPrice;
    }

    public List<BigDecimal> getMarkPriceList() {
        return markPriceList;
    }

    public void setMarkPriceList(List<BigDecimal> markPriceList) {
        this.markPriceList = markPriceList;
    }

    public List<String> getMarkPriceListStr() {
        return markPriceListStr;
    }

    public void setMarkPriceListStr(List<String> markPriceListStr) {
        this.markPriceListStr = markPriceListStr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", markPrice=" + markPrice +
                ", markPriceList=" + markPriceList +
                ", markPriceListStr=" + markPriceListStr +
                '}';
    }
}
