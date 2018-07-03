package com.baseWeb.entity.goods;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class GoodsEntity {
	 @Override
	public String toString() {
		return "GoodsEntity [goodsId=" + goodsId + ", promotionId="
				+ promotionId + ", isOptimization=" + isOptimization
				+ ", optimizationType=" + optimizationType + ", categoryId="
				+ categoryId + ", axis=" + axis + ", manuId=" + manuId
				+ ", shopId=" + shopId + ", brandId=" + brandId
				+ ", goodsdefId=" + goodsdefId + ", name=" + name
				+ ", overview=" + overview + ", status=" + status + ", code="
				+ code + ", spec=" + spec + ", picUrl=" + picUrl + ", imgUrl="
				+ imgUrl + ", videoUrl=" + videoUrl + ", viewNum=" + viewNum
				+ ", source=" + source + ", description=" + description
				+ ", mUnit=" + mUnit + ", origNum=" + origNum + ", currNum="
				+ currNum + ", cUnit=" + cUnit + ", marketPrice=" + marketPrice
				+ ", boId=" + boId + ", ctime=" + ctime + ", onTime=" + onTime
				+ ", offTime=" + offTime + ", dtime=" + dtime + ", vno=" + vno
				+ ", isCurrent=" + isCurrent + ", isDel=" + isDel
				+ ", stdPack=" + stdPack + ", goodsclsId=" + goodsclsId
				+ ", goodsclsCode=" + goodsclsCode + ", goodsclsName="
				+ goodsclsName + ", commodityName=" + commodityName
				+ ", goodRate=" + goodRate + ", goodsRateInt=" + goodsRateInt
				+ ", compStar=" + compStar + ", grayStar=" + grayStar
				+ ", shopIdList=" + shopIdList + ", picList=" + picList
				+ ", isFavorite=" + isFavorite + ", goodsNum=" + goodsNum
				+ ", memberNum=" + memberNum + ", shopName=" + shopName
				+ ", addr=" + addr + ", shopIds=" + shopIds + ", axisList="
				+ axisList + ", sysIds=" + sysIds + ", names=" + names
				+ ", isEmpty=" + isEmpty + ", isoa=" + isoa + ", unitoa="
				+ unitoa + ", stdpackoa=" + stdpackoa + ", picUrl2=" + picUrl2
				+ ", picUrl3=" + picUrl3 + ", picUrl4=" + picUrl4
				+ ", picUrl5=" + picUrl5 + ", attrUrl=" + attrUrl + ", desc="
				+ desc + ", using=" + using + ", marginMoney=" + marginMoney
				+ ", isMargin=" + isMargin + ", marginStatus=" + marginStatus
				+ ", dtj=" + dtj + ", qzxj=" + qzxj + ", dsj=" + dsj + ", ysj="
				+ ysj + ", sale=" + sale + ", saleCount=" + saleCount
				+ ", saleId=" + saleId + ", saleStatus=" + saleStatus
				+ ", saleValue=" + saleValue + ", isShowPrice=" + isShowPrice
				+ ", memberPrice=" + memberPrice + ", price=" + price
				+ ", time=" + time + ", linkId=" + linkId + ", functionType="
				+ functionType + ", goodsType=" + goodsType + ", remarks="
				+ remarks + ", goodsClsVO=" + goodsClsVO + ", goodsCls="
				+ goodsCls + ", type=" + type + ", page=" + page
				+ ", isDeliverySt=" + isDeliverySt + ", sellPrice=" + sellPrice
				+ ", sellFactPrice=" + sellFactPrice + ", statusName="
				+ statusName + ", goodsIds=" + goodsIds + ", categoryIdList="
				+ categoryIdList + ", goodsIdList=" + goodsIdList
				+ ", goodsAttrList=" + goodsAttrList + ", labelCode="
				+ labelCode + ", eggClean=" + eggClean + ", eggFree=" + eggFree
				+ ", goodsWeight=" + goodsWeight + ", specStatus=" + specStatus
				+ ", eggColor=" + eggColor + ", auth=" + auth + ", ftime="
				+ ftime + ", linkMan=" + linkMan + ", isPromotion="
				+ isPromotion + ", promotionMoney=" + promotionMoney
				+ ", promotionType=" + promotionType + ", promotionRate="
				+ promotionRate + ", promotionPrice=" + promotionPrice
				+ ", promotionCurrNum=" + promotionCurrNum + ", goodsQuantity="
				+ goodsQuantity + ", origQuantity=" + origQuantity
				+ ", currQuantity=" + currQuantity + ", unitPrice=" + unitPrice
				+ ", isPublicDisplayPrice=" + isPublicDisplayPrice + ", tips="
				+ tips + ", orderBy=" + orderBy + ", orderCondition="
				+ orderCondition + ", isPromotionOrSelf=" + isPromotionOrSelf
				+ ", goodsSelledCount=" + goodsSelledCount + ", goodsSelled="
				+ goodsSelled + ", classificationBusinessType="
				+ classificationBusinessType + ", activeState=" + activeState
				+ ", lastUpdateDate=" + lastUpdateDate + ", goodsClsFullName="
				+ goodsClsFullName + ", giftGoodsList=" + giftGoodsList
				+ ", giftGoodsCount=" + giftGoodsCount + ", buyCount="
				+ buyCount + ", promotionStock=" + promotionStock
				+ ", giftCount=" + giftCount + ", pdfId=" + pdfId
				+ ", promotionDtlId=" + promotionDtlId + ", goodsCheck="
				+ goodsCheck + ", cashCode=" + cashCode + ", goodsGroupId="
				+ goodsGroupId + ", goodsGroupName=" + goodsGroupName
				+ ", goodsGroupSort=" + goodsGroupSort + ", isGroupMainGoods="
				+ isGroupMainGoods + ", isGroup=" + isGroup
				+ ", goodsTotalPriceEntity=" + goodsTotalPriceEntity
				+ ", CashCouponMaxCount=" + CashCouponMaxCount
				+ ", goodsSettlementPrice=" + goodsSettlementPrice
				+ ", isDemo=" + isDemo + ", isDealership=" + isDealership
				+ ", mobGoodsType=" + mobGoodsType + ", rebateMoney="
				+ rebateMoney + ", pageNum=" + pageNum + ", pageSize="
				+ pageSize + ", priceA=" + priceA + ", priceB=" + priceB
				+ ", shellColour=" + shellColour + ", pack=" + pack
				+ ", goodsDigit=" + goodsDigit + ", cgId=" + cgId
				+ ", shopType=" + shopType + ", shopFreightTemplateId="
				+ shopFreightTemplateId + ", freightTemplateName="
				+ freightTemplateName + ", areaAxis=" + areaAxis
				+ ", shopBusinessType=" + shopBusinessType + ", areaName="
				+ areaName + "]";
	}

	private Long goodsId;
	 
	 private Long promotionId;
	 
	 private Integer isOptimization;//是否是农信优选商品

	 private Integer optimizationType;//是否申请成为农信优选商品 0:未申请 1:申请中 2:申请通过

	 private Short categoryId;

	 private String axis;

	 private Long manuId;

	 private Long shopId;

	 private Long brandId;

	 private Long goodsdefId;

	 private String name;

	private String overview;

	 private Integer status;

	 private String code;

	 private String spec;

	 private String picUrl;
	 
	 private String imgUrl;

	 private String videoUrl;

	 private Integer viewNum;

	 private Integer source;

	 private String description;

	 private Integer mUnit;

	 private Integer origNum;

	 private Integer currNum;

	 private Integer cUnit;

	 private BigDecimal marketPrice;

	 private Long boId;

	 private Date ctime;

	 private Date onTime;

	 private Date offTime;

	 private Date dtime;

	 private Date vno;

	 private Integer isCurrent;

	 private Integer isDel;
	 
	 private String stdPack ;//后加标包
	 
	 private Long goodsclsId;//商品分类ID
	 
	 private String goodsclsCode;//关联商品中心的商品分类编码
	 
	 private String goodsclsName;//关联商品中心的商品分类名称
	 
	 private String commodityName;//关联商品中心的商品品名
	 
	 private BigDecimal goodRate;//好评率
	 private Integer goodsRateInt;	//好评率整数型
	 
	 private Integer compStar;//等级
	 
	 private Integer grayStar;//
    
     private List<Long> shopIdList;
     
     private List<GoodsPicEntity> picList;//图片查询
     
     private Integer isFavorite;
     
     private Integer goodsNum;//商品数量

	 private Integer memberNum;//优惠人数
     
     private String shopName;//店铺名称-页面使用
     
     private String addr;
     
     private String shopIds;
     
     private String axisList;//品类串
     
     private List<Long> sysIds;
     
     private List<String> names;//分词的数据
     
     private String isEmpty; 
     private Integer isoa;// 是否是OA商品 1是， 0 不是
     private  String unitoa;//oa单位
     private String stdpackoa;//oa标包
     
     
	 private String picUrl2;
	 
	 private String picUrl3;
	 
	 private String picUrl4;
	 
	 private String picUrl5;
	 
	 private String attrUrl;//商品属性（图片）
	 
	 private String desc;//货品参数
	 
	 private String using;//其它说明
	 
	 private BigDecimal marginMoney;//保证金
	 
	 private Integer isMargin;//是否保证金
	 
	 private Integer marginStatus;//保证状态
	 
	 private int dtj;
	 
	 private int qzxj;
	 
	 private int dsj;

	 private int ysj;
	 
	 private GoodsSalesEntity sale;
	 
	 private Integer saleCount;
	 
	 private Long saleId;
	 
	 private Integer saleStatus;
	 
	 private String saleValue;
	 
	 private Integer isShowPrice;//是否显示价格 0为不显示价格 1显示价格
     
	 private BigDecimal memberPrice;//会员价
	 private BigDecimal price;//会员价
	 private Long time;//上架时间 传参

	 private Integer linkId;//店铺内的 品类传参
	 private Integer functionType;//店铺内的 类型传参
	 
	 private String goodsType;//商品关联分类（与商品中心的分类无关）
	 private String remarks;//

	 private GoodsClsVO goodsClsVO;//货品规格

	private String goodsCls;//拓展规格
	
	private String type; //商品类型
				
	private Integer page;//各个频道页标识 
	
	private Integer isDeliverySt;//物流状态标识（删除商品）
	
	private BigDecimal sellPrice;// 开票价
	
	private BigDecimal sellFactPrice;	//现价
	
	private String statusName;//货品状态名称
	
	private String  goodsIds;

	private List<Short> categoryIdList;

	private List<Long> goodsIdList;//货品ID集合
	
	private List<GoodsAttrEntity> goodsAttrList; // 属性表list
	
	private String labelCode;	//商品标签
	private String eggClean;	//清洁蛋
	private String eggFree;	//无抗蛋R
	private String goodsWeight; //估重

	private Integer specStatus;//首页条件查询字段
	
	private String eggColor; //首页蛋颜色
	
	private Integer auth; //认证信息  1个人认证、2企业认证
	
	private String ftime;//发布后时间
	
	private String linkMan;//出售人
	
	private Integer isPromotion;// 是否是促销产品 0 代表是 ； 1 不是

	private BigDecimal promotionMoney;// 促销

	private String promotionType;// 促销类型

	private BigDecimal promotionRate;// 促销比例

	private BigDecimal promotionPrice;// 促销价格
	
	private Integer promotionCurrNum; // 用以添加促销商品时和商品库存判断，如果<,=0则不查询该商品
	 
	private BigDecimal goodsQuantity;// 货品数量（小数值）
	
	private BigDecimal origQuantity;//货品的原始库存-支持小数
	
	private BigDecimal currQuantity;//货品的当前库存-支持小数
	
	private String unitPrice;//每斤单价
	
	private Integer isPublicDisplayPrice;//仅对客户关系 是1 否0
	
	private String tips;//活动说明
	
	private Integer orderBy ;//按照价格排序字段  0降序   1升序   字段为空时不排序
	private String orderCondition ;//排序字符串
	
	/**
	 * 搜索条件  自营或促销  1自营  2促销
	 */
	private Integer isPromotionOrSelf;
	/**
	 * 商品已售数量
	 */
	private BigDecimal goodsSelledCount;

	private Long goodsSelled;
	
	private Integer classificationBusinessType;//品类业务类型
	
	private String activeState;//品类业务类型
	
	private Date lastUpdateDate;	//最后更新时间
	
	private String goodsClsFullName;//商品类的全名称

	private List<GoodsEntity> giftGoodsList;//赠品集合

	private BigDecimal giftGoodsCount;//赠品数量

	private BigDecimal buyCount;//买
	
	private Integer promotionStock;//买

	private BigDecimal giftCount;//赠
	
	private Long pdfId;//优惠商品赠品表ID
	private Long promotionDtlId;//赠

	private Integer goodsCheck;//店铺装修导航栏选中货品标示 1选中 0未选中
	
	private String cashCode;//现金券规则 码
	
	private Long goodsGroupId;//商品组id
	
	private String goodsGroupName;//商品组名称
	
	private Integer goodsGroupSort;//商品组内排序
	
	private Integer isGroupMainGoods;//是否主商品
	
	private Integer isGroup;//是否组商品
	
	private GoodsTotalPriceEntity goodsTotalPriceEntity;	//商品的所有价格信息
	
	private Integer CashCouponMaxCount; //现金券最大使用数量

	private BigDecimal goodsSettlementPrice;//商品结算价

	private Integer isNewYear; //跨年商品标识 0 否 1 是
	
	public Integer getIsNewYear() {
		return isNewYear;
	}

	public void setIsNewYear(Integer isNewYear) {
		this.isNewYear = isNewYear;
	}
	
	public BigDecimal getGoodsSettlementPrice() {
		return goodsSettlementPrice;
	}

	public void setGoodsSettlementPrice(BigDecimal goodsSettlementPrice) {
		this.goodsSettlementPrice = goodsSettlementPrice;
	}

	public Long getGoodsGroupId() {
		return goodsGroupId;
	}

	public void setGoodsGroupId(Long goodsGroupId) {
		this.goodsGroupId = goodsGroupId;
	}

	public String getGoodsGroupName() {
		return goodsGroupName;
	}

	public void setGoodsGroupName(String goodsGroupName) {
		this.goodsGroupName = goodsGroupName;
	}

	public Integer getGoodsGroupSort() {
		return goodsGroupSort;
	}

	public void setGoodsGroupSort(Integer goodsGroupSort) {
		this.goodsGroupSort = goodsGroupSort;
	}

	public Integer getIsGroupMainGoods() {
		return isGroupMainGoods;
	}

	public void setIsGroupMainGoods(Integer isGroupMainGoods) {
		this.isGroupMainGoods = isGroupMainGoods;
	}

	public Integer getIsGroup() {
		return isGroup;
	}

	public void setIsGroup(Integer isGroup) {
		this.isGroup = isGroup;
	}

	public String getCashCode() {
		return cashCode;
	}

	public void setCashCode(String cashCode) {
		this.cashCode = cashCode;
	}

	public Integer getOptimizationType() {
		return optimizationType;
	}

	public void setOptimizationType(Integer optimizationType) {
		this.optimizationType = optimizationType;
	}

	public Integer getGoodsCheck() {
		return goodsCheck;
	}

	public void setGoodsCheck(Integer goodsCheck) {
		this.goodsCheck = goodsCheck;
	}

	public Integer getIsOptimization() {
		return isOptimization;
	}

	public void setIsOptimization(Integer isOptimization) {
		this.isOptimization = isOptimization;
	}

	public Long getPromotionDtlId() {
		return promotionDtlId;
	}

	public void setPromotionDtlId(Long promotionDtlId) {
		this.promotionDtlId = promotionDtlId;
	}

	public Long getPdfId() {
		return pdfId;
	}

	public void setPdfId(Long pdfId) {
		this.pdfId = pdfId;
	}

	public Integer getPromotionStock() {
		return promotionStock;
	}

	public void setPromotionStock(Integer promotionStock) {
		this.promotionStock = promotionStock;
	}

	public String getGoodsClsFullName() {
		return goodsClsFullName;
	}

	public void setGoodsClsFullName(String goodsClsFullName) {
		this.goodsClsFullName = goodsClsFullName;
	}
	
	public String getActiveState() {
		return activeState;
	}

	public void setActiveState(String activeState) {
		if("HAVE_IN_HAND".equals(activeState)){
			isPromotion = 0;
		}
		this.activeState = activeState;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Integer getClassificationBusinessType() {
		return classificationBusinessType;
	}

	public void setClassificationBusinessType(Integer classificationBusinessType) {
		this.classificationBusinessType = classificationBusinessType;
	}

	public BigDecimal getGoodsSelledCount() {
		return goodsSelledCount;
	}

	public void setGoodsSelledCount(BigDecimal goodsSelledCount) {
		goodsSelledCount = goodsSelledCount;
	}

	public String getOrderCondition() {
		return orderCondition;
	}

	public void setOrderCondition(String orderCondition) {
		this.orderCondition = orderCondition;
	}

	public Integer getIsPromotionOrSelf() {
		return isPromotionOrSelf;
	}

	public void setIsPromotionOrSelf(Integer isPromotionOrSelf) {
		this.isPromotionOrSelf = isPromotionOrSelf;
	}

	public Integer getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(Integer orderBy) {
		this.orderBy = orderBy;
	}

	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	public Integer getIsPublicDisplayPrice() {
		return isPublicDisplayPrice;
	}

	public void setIsPublicDisplayPrice(Integer isPublicDisplayPrice) {
		this.isPublicDisplayPrice = isPublicDisplayPrice;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BigDecimal getOrigQuantity() {
		return origQuantity;
	}

	public void setOrigQuantity(BigDecimal origQuantity) {
		this.origQuantity = origQuantity;
	}

	public BigDecimal getCurrQuantity() {
		return currQuantity;
	}

	public void setCurrQuantity(BigDecimal currQuantity) {
		this.currQuantity = currQuantity;
	}

	public BigDecimal getGoodsQuantity() {
		return goodsQuantity;
	}

	public void setGoodsQuantity(BigDecimal goodsQuantity) {
		this.goodsQuantity = goodsQuantity;
	}

	public Integer getPromotionCurrNum() {
		return promotionCurrNum;
	}

	public void setPromotionCurrNum(Integer promotionCurrNum) {
		this.promotionCurrNum = promotionCurrNum;
	}
	 
	public Integer getIsPromotion() {
		return isPromotion;
	}

	public void setIsPromotion(Integer isPromotion) {
		this.isPromotion = isPromotion;
	}

	public BigDecimal getPromotionMoney() {
		return promotionMoney;
	}

	public void setPromotionMoney(BigDecimal promotionMoney) {
		this.promotionMoney = promotionMoney;
	}

	public String getPromotionType() {
		return promotionType;
	}

	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}

	public BigDecimal getPromotionRate() {
		return promotionRate;
	}

	public void setPromotionRate(BigDecimal promotionRate) {
		this.promotionRate = promotionRate;
	}

	public BigDecimal getPromotionPrice() {
		return promotionPrice;
	}

	public void setPromotionPrice(BigDecimal promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	public Long getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(Long promotionId) {
		this.promotionId = promotionId;
	}

	public Integer getAuth() {
		return auth;
	}

	public void setAuth(Integer auth) {
		this.auth = auth;
	}

	public String getFtime() {
		return ftime;
	}

	public void setFtime(String ftime) {
		this.ftime = ftime;
	}

	public String getLinkMan() {
		return linkMan;
	}

	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}

	public String getEggColor() {
		return eggColor;
	}

	public void setEggColor(String eggColor) {
		this.eggColor = eggColor;
	}

	public Integer getSpecStatus() {
		return specStatus;
	}

	public void setSpecStatus(Integer specStatus) {
		this.specStatus = specStatus;
	}

	public List<GoodsAttrEntity> getGoodsAttrList() {
		return goodsAttrList;
	}

	public void setGoodsAttrList(List<GoodsAttrEntity> goodsAttrList) {
		this.goodsAttrList = goodsAttrList;
	}

	public BigDecimal getMarginMoney() {
		return marginMoney;
	}

	public void setMarginMoney(BigDecimal marginMoney) {
		this.marginMoney = marginMoney;
	}

	public Integer getIsMargin() {
		return isMargin;
	}

	public void setIsMargin(Integer isMargin) {
		this.isMargin = isMargin;
	}

	public Integer getMarginStatus() {
		return marginStatus;
	}

	public void setMarginStatus(Integer marginStatus) {
		this.marginStatus = marginStatus;
	}

	public List<Short> getCategoryIdList() {
		return categoryIdList;
	}

	public void setCategoryIdList(List<Short> categoryIdList) {
		this.categoryIdList = categoryIdList;
	}

	public String getGoodsIds() {
		return goodsIds;
	}

	public void setGoodsIds(String goodsIds) {
		this.goodsIds = goodsIds;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public BigDecimal getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}

	public Integer getIsDeliverySt() {
		return isDeliverySt;
	}

	public void setIsDeliverySt(Integer isDeliverySt) {
		this.isDeliverySt = isDeliverySt;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 是否是线上测试用户
	 */
	private Integer isDemo;

	public Integer getIsDemo() {
		return isDemo;
	}

	public void setIsDemo(Integer isDemo) {
		this.isDemo = isDemo;
	}

	/**
	 * 是否允许代销，0：不允许，1：允许
	 */
	private Integer isDealership;

	/**
	 * 是否允许代销，0：不允许，1：允许
	 * 
	 * @return
	 */
	public Integer getIsDealership() {
		return isDealership;
	}

	/**
	 * 是否允许代销，0：不允许，1：允许
	 * 
	 * @param isDealership
	 */
	public void setIsDealership(Integer isDealership) {
		this.isDealership = isDealership;
	}

	/**
	 * 手机端商品类型区分 1：农资，2：农牧
	 */
	private String mobGoodsType;

	/**
	 * 手机端商品类型区分 1：农资，2：农牧
	 */
	public String getMobGoodsType() {
		return mobGoodsType;
	}

	/**
	 * 手机端商品类型区分 1：农资，2：农牧
	 */
	public void setMobGoodsType(String mobGoodsType) {
		this.mobGoodsType = mobGoodsType;
	}

	private BigDecimal rebateMoney;

	public BigDecimal getRebateMoney() {
		return rebateMoney;
	}

	public void setRebateMoney(BigDecimal rebateMoney) {
		this.rebateMoney = rebateMoney;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public Integer getFunctionType() {
		return functionType;
	}

	public void setFunctionType(Integer functionType) {
		this.functionType = functionType;
	}

	public Integer getLinkId() {
		return linkId;
	}

	public void setLinkId(Integer linkId) {
		this.linkId = linkId;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public BigDecimal getMemberPrice() {
		return memberPrice;
	}

	public void setMemberPrice(BigDecimal memberPrice) {
		this.memberPrice = memberPrice;
	}

	public Integer getIsShowPrice() {
		return isShowPrice;
	}

	public void setIsShowPrice(Integer isShowPrice) {
		this.isShowPrice = isShowPrice;
	}

	public String getSaleValue() {
		return saleValue;
	}

	public void setSaleValue(String saleValue) {
		this.saleValue = saleValue;
	}

	public Integer getSaleCount() {
		return saleCount;
	}

	public void setSaleCount(Integer saleCount) {
		this.saleCount = saleCount;
	}

	public Long getSaleId() {
		return saleId;
	}

	public void setSaleId(Long saleId) {
		this.saleId = saleId;
	}

	public Integer getSaleStatus() {
		return saleStatus;
	}

	public void setSaleStatus(Integer saleStatus) {
		this.saleStatus = saleStatus;
	}

	public GoodsSalesEntity getSale() {
		return sale;
	}

	public void setSale(GoodsSalesEntity sale) {
		this.sale = sale;
	}

	public int getDtj() {
		return dtj;
	}

	public void setDtj(int dtj) {
		this.dtj = dtj;
	}

	public int getQzxj() {
		return qzxj;
	}

	public void setQzxj(int qzxj) {
		this.qzxj = qzxj;
	}

	public int getDsj() {
		return dsj;
	}

	public void setDsj(int dsj) {
		this.dsj = dsj;
	}

	public int getYsj() {
		return ysj;
	}

	public void setYsj(int ysj) {
		this.ysj = ysj;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getUsing() {
		return using;
	}

	public void setUsing(String using) {
		this.using = using;
	}

	public String getAttrUrl() {
		return attrUrl;
	}

	public void setAttrUrl(String attrUrl) {
		this.attrUrl = attrUrl;
	}

	public String getPicUrl2() {
		return picUrl2;
	}

	public void setPicUrl2(String picUrl2) {
		this.picUrl2 = picUrl2;
	}

	public String getPicUrl3() {
		return picUrl3;
	}

	public void setPicUrl3(String picUrl3) {
		this.picUrl3 = picUrl3;
	}

	public String getPicUrl4() {
		return picUrl4;
	}

	public void setPicUrl4(String picUrl4) {
		this.picUrl4 = picUrl4;
	}

	public String getPicUrl5() {
		return picUrl5;
	}

	public void setPicUrl5(String picUrl5) {
		this.picUrl5 = picUrl5;
	}

	public String getUnitoa() {
		return unitoa;
	}

	public void setUnitoa(String unitoa) {
		this.unitoa = unitoa;
	}

	public String getStdpackoa() {
		return stdpackoa;
	}

	public void setStdpackoa(String stdpackoa) {
		this.stdpackoa = stdpackoa;
	}

		public Integer getIsoa() {
			return isoa;
		}

		public void setIsoa(Integer isoa) {
			this.isoa = isoa;
		}
     
     
    
     
    public String getIsEmpty() {
		return isEmpty;
	}

	public void setIsEmpty(String isEmpty) {
		this.isEmpty = isEmpty;
	}

	public List<Long> getSysIds() {
		return sysIds;
	}

	public void setSysIds(List<Long> sysIds) {
		this.sysIds = sysIds;
	}

	public String getAxisList() {
		return axisList;
	}

	public void setAxisList(String axisList) {
		this.axisList = axisList;
	}

	public String getShopIds() {
		return shopIds;
	}

	public void setShopIds(String shopIds) {
		this.shopIds = shopIds;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Long getGoodsclsId() {
		return goodsclsId;
	}

	public void setGoodsclsId(Long goodsclsId) {
		this.goodsclsId = goodsclsId;
	}

	public Integer getGrayStar() {
		return grayStar;
	}

	public void setGrayStar(Integer grayStar) {
		this.grayStar = grayStar;
	}

	public BigDecimal getGoodRate() {
		return goodRate;
	}

	public void setGoodRate(BigDecimal goodRate) {
		this.goodRate = goodRate;
	}

	public Integer getCompStar() {
		return compStar;
	}

	public void setCompStar(Integer compStar) {
		this.compStar = compStar;
	}

	public String getGoodsclsCode() {
		return goodsclsCode;
	}

	public void setGoodsclsCode(String goodsclsCode) {
		this.goodsclsCode = goodsclsCode;
	}

	public String getGoodsclsName() {
		return goodsclsName;
	}

	public void setGoodsclsName(String goodsclsName) {
		this.goodsclsName = goodsclsName;
	}

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public String getStdPack() {
		return stdPack;
	}

	public void setStdPack(String stdPack) {
		this.stdPack = stdPack;
	}

	public Integer getIsFavorite() {
		return isFavorite;
	}

	public void setIsFavorite(Integer isFavorite) {
		this.isFavorite = isFavorite;
	}

	public List<GoodsPicEntity> getPicList() {
		return picList;
	}

	public void setPicList(List<GoodsPicEntity> picList) {
		this.picList = picList;
	}

	/**
	 * 页码
	 */
	private Integer pageNum;
	/**
	 * 页数
	 */
	private Integer pageSize;

	//蛋联网筛选条件
	private BigDecimal priceA;//价格A
	private BigDecimal priceB;//价格B
	private String shellColour;//蛋壳颜色
	private String pack;//包装方式
	
	
	

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	private Integer goodsDigit;//货品数量保留位数

	private Long cgId;//进货车ID

	public Integer getGoodsDigit() {
		return goodsDigit;
	}

	public void setGoodsDigit(Integer goodsDigit) {
		this.goodsDigit = goodsDigit;
	}

	public BigDecimal getPriceA() {
		return priceA;
	}

	public void setPriceA(BigDecimal priceA) {
		this.priceA = priceA;
	}

	public BigDecimal getPriceB() {
		return priceB;
	}

	public void setPriceB(BigDecimal priceB) {
		this.priceB = priceB;
	}

	public String getShellColour() {
		return shellColour;
	}

	public void setShellColour(String shellColour) {
		this.shellColour = shellColour;
	}

	public String getPack() {
		return pack;
	}

	public void setPack(String pack) {
		this.pack = pack;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    
    }

    public Short getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Short categoryId) {
        this.categoryId = categoryId;
    }

    public String getAxis() {
        return axis;
    }

    public void setAxis(String axis) {
        this.axis = axis == null ? null : axis.trim();
    }

    public Long getManuId() {
        return manuId;
    }

    public void setManuId(Long manuId) {
        this.manuId = manuId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
        if (shopId != null) {
        	this.setShopIds(shopId.toString());
		}
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getGoodsdefId() {
        return goodsdefId;
    }

    public void setGoodsdefId(Long goodsdefId) {
        this.goodsdefId = goodsdefId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getViewNum() {
        return viewNum;
    }

    public void setViewNum(Integer viewNum) {
        this.viewNum = viewNum;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getmUnit() {
        return mUnit;
    }

    public void setmUnit(Integer mUnit) {
        this.mUnit = mUnit;
    }

    public Integer getOrigNum() {
        return origNum;
    }

    public void setOrigNum(Integer origNum) {
        this.origNum = origNum;
    }

    public Integer getCurrNum() {
        return currNum;
    }

    public void setCurrNum(Integer currNum) {
        this.currNum = currNum;
    }

    public Integer getcUnit() {
        return cUnit;
    }

    public void setcUnit(Integer cUnit) {
        this.cUnit = cUnit;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Long getBoId() {
        return boId;
    }

    public void setBoId(Long boId) {
        this.boId = boId;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getOnTime() {
        return onTime;
    }

    public void setOnTime(Date onTime) {
        this.onTime = onTime;
    }

    public Date getOffTime() {
        return offTime;
    }

    public void setOffTime(Date offTime) {
        this.offTime = offTime;
    }

    public Date getDtime() {
        return dtime;
    }

    public void setDtime(Date dtime) {
        this.dtime = dtime;
    }

    public Date getVno() {
        return vno;
    }

    public void setVno(Date vno) {
        this.vno = vno;
    }

    public Integer getIsCurrent() {
        return isCurrent;
    }

    public void setIsCurrent(Integer isCurrent) {
        this.isCurrent = isCurrent;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

	public List<Long> getShopIdList() {
		return shopIdList;
	}

	public void setShopIdList(List<Long> shopIdList) {
		this.shopIdList = shopIdList;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((goodsId == null) ? 0 : goodsId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GoodsEntity other = (GoodsEntity) obj;
		if (goodsId == null) {
			if (other.goodsId != null)
				return false;
		} else if (!goodsId.equals(other.goodsId))
			return false;
		return true;
	}

	public Integer getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	/**
	 * 商品所属类型 0：其他，1：网店，2：直营店
	 */
	private Integer shopType;

	/**
	 * 商品所属类型 0：其他，1：网店，2：直营店
	 */
	public Integer getShopType() {
		return shopType;
	}

	/**
	 * 商品所属类型 0：其他，1：网店，2：直营店
	 */
	public void setShopType(Integer shopType) {
		this.shopType = shopType;
	}

	public GoodsClsVO getGoodsClsVO() {
		return goodsClsVO;
	}

	public void setGoodsClsVO(GoodsClsVO goodsClsVO) {
		this.goodsClsVO = goodsClsVO;
	}

	public String getGoodsCls() {
		return goodsCls;
	}

	public void setGoodsCls(String goodsCls) {
		this.goodsCls = goodsCls;
	}

	private Long shopFreightTemplateId;
	
	private String freightTemplateName;	//运费模版名称

	public Long getShopFreightTemplateId() {
		return shopFreightTemplateId;
	}

	public void setShopFreightTemplateId(Long shopFreightTemplateId) {
		this.shopFreightTemplateId = shopFreightTemplateId;
	}

	private String areaAxis;

	public String getAreaAxis() {
		return areaAxis;
	}

	public void setAreaAxis(String areaAxis) {
		this.areaAxis = areaAxis;
	}

	private String shopBusinessType;

	public String getShopBusinessType() {
		return shopBusinessType;
	}

	public void setShopBusinessType(String shopBusinessType) {
		this.shopBusinessType = shopBusinessType;
	}

	private String areaName;

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public List<Long> getGoodsIdList() {
		return goodsIdList;
	}

	public void setGoodsIdList(List<Long> goodsIdList) {
		this.goodsIdList = goodsIdList;
	}

	public String getEggClean() {
		return eggClean;
	}

	public void setEggClean(String eggClean) {
		this.eggClean = eggClean;
	}

	public String getEggFree() {
		return eggFree;
	}

	public void setEggFree(String eggFree) {
		this.eggFree = eggFree;
	}

	public String getLabelCode() {
		return labelCode;
	}

	public void setLabelCode(String labelCode) {
		this.labelCode = labelCode;
	}

	public String getGoodsWeight() {
		return goodsWeight;
	}

	public void setGoodsWeight(String goodsWeight) {
		this.goodsWeight = goodsWeight;
	}

	public Integer getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(Integer memberNum) {
		this.memberNum = memberNum;
	}

	public BigDecimal getSellFactPrice() {
		return sellFactPrice;
	}

	public void setSellFactPrice(BigDecimal sellFactPrice) {
		this.sellFactPrice = sellFactPrice;
	}

	public Long getCgId() {
		return cgId;
	}

	public void setCgId(Long cgId) {
		this.cgId = cgId;
	}

	public String getFreightTemplateName() {
		return freightTemplateName;
	}

	public void setFreightTemplateName(String freightTemplateName) {
		this.freightTemplateName = freightTemplateName;
	}

	public Long getGoodsSelled() {
		return goodsSelled;
	}

	public void setGoodsSelled(Long goodsSelled) {
		this.goodsSelled = goodsSelled;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public List<GoodsEntity> getGiftGoodsList() {
		return giftGoodsList;
	}

	public void setGiftGoodsList(List<GoodsEntity> giftGoodsList) {
		this.giftGoodsList = giftGoodsList;
	}

	public BigDecimal getGiftGoodsCount() {
		return giftGoodsCount;
	}

	public void setGiftGoodsCount(BigDecimal giftGoodsCount) {
		this.giftGoodsCount = giftGoodsCount;
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

	public Integer getGoodsRateInt() {
		return goodsRateInt;
	}

	public void setGoodsRateInt(Integer goodsRateInt) {
		this.goodsRateInt = goodsRateInt;
	}

	public GoodsTotalPriceEntity getGoodsTotalPriceEntity() {
		return goodsTotalPriceEntity;
	}

	public void setGoodsTotalPriceEntity(GoodsTotalPriceEntity goodsTotalPriceEntity) {
		this.goodsTotalPriceEntity = goodsTotalPriceEntity;
	}

	public Integer getCashCouponMaxCount() {
		return CashCouponMaxCount;
	}

	public void setCashCouponMaxCount(Integer cashCouponMaxCount) {
		CashCouponMaxCount = cashCouponMaxCount;
	}
}
