package com.baseWeb.entity.goods;

/**
 * Created by Zx on 2016/10/24.
 */

/**
 * 货品规格类型
 */
public class GoodsClsVO {

    private String rank;//等级
    private String capacity;//容量
    private String moisture;//含水率
    private String mildew;//霉变率
    private String impurity;//杂质
    private String imperfect;//不完善率
    private String colorIustre;//色泽气味
    private String huskedRise;//出糙率
    private String riceRate;//整精米率

    public String getMoisture() {
        return moisture;
    }

    public void setMoisture(String moisture) {
        this.moisture = moisture;
    }

    public String getRiceRate() {
        return riceRate;
    }

    public void setRiceRate(String riceRate) {
        this.riceRate = riceRate;
    }

    public String getHuskedRise() {
        return huskedRise;
    }

    public void setHuskedRise(String huskedRise) {
        this.huskedRise = huskedRise;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getMildew() {
        return mildew;
    }

    public void setMildew(String mildew) {
        this.mildew = mildew;
    }

    public String getImpurity() {
        return impurity;
    }

    public void setImpurity(String impurity) {
        this.impurity = impurity;
    }

    public String getImperfect() {
        return imperfect;
    }

    public void setImperfect(String imperfect) {
        this.imperfect = imperfect;
    }

    public String getColorIustre() {
        return colorIustre;
    }

    public void setColorIustre(String colorIustre) {
        this.colorIustre = colorIustre;
    }
}
