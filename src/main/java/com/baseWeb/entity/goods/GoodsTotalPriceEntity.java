package com.baseWeb.entity.goods;

import java.math.BigDecimal;

public class GoodsTotalPriceEntity {

	private Long goodsId; //商品Id
	private BigDecimal marketPrice; //货品原价
	private BigDecimal promotionPrice; //货品促销价
	private BigDecimal memberPrice; //货品价格方案价格
	private Integer rebateMark;//返点类型: 1 平台返点 2 固定返点 3 规格返点
	private BigDecimal settlementPrice; //货品结算价
	private BigDecimal costPrice; //货品成本价
	private BigDecimal platformRebate; //规格返点金额
	private BigDecimal goodsLowestPrice; //所有价格比较出，货品最低价格 
	private BigDecimal rebateLowestRrice; //不包含返点 结算价 和 成本价 的商品最低价格，设置商品返点时用

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
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

	public BigDecimal getMemberPrice() {
		return memberPrice;
	}

	public void setMemberPrice(BigDecimal memberPrice) {
		this.memberPrice = memberPrice;
	}

	public BigDecimal getSettlementPrice() {
		return settlementPrice;
	}

	public void setSettlementPrice(BigDecimal settlementPrice) {
		this.settlementPrice = settlementPrice;
	}

	public BigDecimal getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(BigDecimal costPrice) {
		this.costPrice = costPrice;
	}

	public BigDecimal getGoodsLowestPrice() {
		return goodsLowestPrice;
	}

	public void setGoodsLowestPrice(BigDecimal goodsLowestPrice) {
		this.goodsLowestPrice = goodsLowestPrice;
	}

	public BigDecimal getPlatformRebate() {
		return platformRebate;
	}

	public void setPlatformRebate(BigDecimal platformRebate) {
		this.platformRebate = platformRebate;
	}

	public Integer getRebateMark() {
		return rebateMark;
	}

	public void setRebateMark(Integer rebateMark) {
		this.rebateMark = rebateMark;
	}

	public BigDecimal getRebateLowestRrice() {
		return rebateLowestRrice;
	}

	public void setRebateLowestRrice(BigDecimal rebateLowestRrice) {
		this.rebateLowestRrice = rebateLowestRrice;
	}
}
