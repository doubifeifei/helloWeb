package com.baseWeb.entity.goods;

import java.math.BigDecimal;
import java.util.List;

public class Teacher {
    private String tName;
    private String tAge;
    private List<BigDecimal> tList;

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettAge() {
        return tAge;
    }

    public void settAge(String tAge) {
        this.tAge = tAge;
    }

    public List<BigDecimal> gettList() {
        return tList;
    }

    public void settList(List<BigDecimal> tList) {
        this.tList = tList;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tName='" + tName + '\'' +
                ", tAge='" + tAge + '\'' +
                ", tList=" + tList +
                '}';
    }
}
