package com.baseWeb.entity.goods;

public class GoodsPicEntity {
	/**
	 * 商品图片
	 */
    private Long gpId;

    private Long goodsId;
    
    private Integer goodsclsId;

    private String url;

    private Integer sort;

    private Integer isFirst;

    private Integer isDel;
    
    

    public Integer getGoodsclsId() {
		return goodsclsId;
	}

	public void setGoodsclsId(Integer goodsclsId) {
		this.goodsclsId = goodsclsId;
	}

	public Long getGpId() {
        return gpId;
    }

    public void setGpId(Long gpId) {
        this.gpId = gpId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getIsFirst() {
        return isFirst;
    }

    public void setIsFirst(Integer isFirst) {
        this.isFirst = isFirst;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

}
