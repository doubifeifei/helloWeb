package com.baseWeb.entity.goods;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 首页货品实体
 * Created by Zx on 2017/6/25.
 */
public class GoodsIndexVo {

    private Long goodsId;//货品ID
    private Long shopId;//店铺Id
    private Integer isoa;// 是否是OA商品 1是， 0 不是
    private String goodsName;//货品名称
    private String goodsUrl;//货品图片
    private BigDecimal marketPrice;//货品价格
    private BigDecimal promotionPrice;//促销价格
    private String shopName;//店铺名称
    private BigDecimal promotionMoney;//优惠金额
    private BigDecimal promotionRate;//优惠比例
    private List<Long> shopIdList;//店铺集合
    private List<Long> goodsIdList;//货品ID集合
    private BigDecimal buyCount;//买
    private BigDecimal giftCount;//赠
    private Integer isOptimization;//优选标志
    private String promotionType;//促销类型
    private Long sort;//排序
    private Date ctime;//货品创建时间
    private String dateSpaceStr;//集采剩余时间
    private String goodsSpec;//货品规格
    private String goodsClsName;//货品规格
    private BigDecimal fRate;//返利金额
    private Integer isDealer;//是否已代销


    public Integer getIsDealer() {
        return isDealer;
    }

    public void setIsDealer(Integer isDealer) {
        this.isDealer = isDealer;
    }

    public BigDecimal getfRate() {
        return fRate;
    }

    public void setfRate(BigDecimal fRate) {
        this.fRate = fRate;
    }

    public String getGoodsClsName() {
        return goodsClsName;
    }

    public void setGoodsClsName(String goodsClsName) {
        this.goodsClsName = goodsClsName;
    }

    public String getGoodsSpec() {
        return goodsSpec;
    }

    public void setGoodsSpec(String goodsSpec) {
        this.goodsSpec = goodsSpec;
    }

    public String getDateSpaceStr() {
        return dateSpaceStr;
    }

    public void setDateSpaceStr(String dateSpaceStr) {
        this.dateSpaceStr = dateSpaceStr;
    }

    public Integer getIsOptimization() {
		return isOptimization;
	}

	public void setIsOptimization(Integer isOptimization) {
		this.isOptimization = isOptimization;
	}

	public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Integer getIsoa() {
        return isoa;
    }

    public void setIsoa(Integer isoa) {
        this.isoa = isoa;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsUrl() {
        return goodsUrl;
    }

    public void setGoodsUrl(String goodsUrl) {
        this.goodsUrl = goodsUrl;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public BigDecimal getPromotionMoney() {
        return promotionMoney;
    }

    public void setPromotionMoney(BigDecimal promotionMoney) {
        this.promotionMoney = promotionMoney;
    }

    public BigDecimal getPromotionRate() {
        return promotionRate;
    }

    public void setPromotionRate(BigDecimal promotionRate) {
        this.promotionRate = promotionRate;
    }

    public List<Long> getShopIdList() {
        return shopIdList;
    }

    public void setShopIdList(List<Long> shopIdList) {
        this.shopIdList = shopIdList;
    }

    public List<Long> getGoodsIdList() {
        return goodsIdList;
    }

    public void setGoodsIdList(List<Long> goodsIdList) {
        this.goodsIdList = goodsIdList;
    }

    public BigDecimal getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(BigDecimal buyCount) {
        this.buyCount = buyCount;
    }

    public BigDecimal getGiftCount() {
        return giftCount;
    }

    public void setGiftCount(BigDecimal giftCount) {
        this.giftCount = giftCount;
    }

    public String getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}
