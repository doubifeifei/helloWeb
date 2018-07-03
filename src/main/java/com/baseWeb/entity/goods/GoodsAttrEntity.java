package com.baseWeb.entity.goods;

import java.util.Date;
import java.util.List;

public class GoodsAttrEntity {
	
    private Integer attrId;

	private Long goodsClsId;
    
    private String clsCode;
    
    private String attrKeyCode;
    
    private String type;

    private Long goodsId;

    private Integer sort;

    private Date vno;

    private String attrVal;
    
    private Integer isDel;

	private String clsExtendAttrType;

	private List<String>  attrValList;//属性值拆分集合

	public String getAttrKeyCode() {
		return attrKeyCode;
	}

	public void setAttrKeyCode(String attrKeyCode) {
		this.attrKeyCode = attrKeyCode;
	}

	public Long getGoodsClsId() {
		return goodsClsId;
	}

	public void setGoodsClsId(Long goodsClsId) {
		this.goodsClsId = goodsClsId;
	}

	public String getClsExtendAttrType() {
		return clsExtendAttrType;
	}

	public void setClsExtendAttrType(String clsExtendAttrType) {
		this.clsExtendAttrType = clsExtendAttrType;
	}

	public Integer getAttrId() {
		return attrId;
	}

	public void setAttrId(Integer attrId) {
		this.attrId = attrId;
	}

	public String getClsCode() {
		return clsCode;
	}

	public void setClsCode(String clsCode) {
		this.clsCode = clsCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Date getVno() {
		return vno;
	}

	public void setVno(Date vno) {
		this.vno = vno;
	}

	public String getAttrVal() {
		return attrVal;
	}

	public void setAttrVal(String attrVal) {
		this.attrVal = attrVal;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

	public List<String> getAttrValList() {
		return attrValList;
	}

	public void setAttrValList(List<String> attrValList) {
		this.attrValList = attrValList;
	}
}