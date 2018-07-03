package com.baseWeb.service;

import com.baseWeb.entity.goods.GoodsEntity;
import com.baseWeb.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "mygoodsService")
public class GoodsService {
    @Autowired
    public GoodsMapper goodsMapper;

    public GoodsService() {
        System.out.println("goodsService。。。s生成");
    }

    public GoodsEntity getGoodsEntityByPK(Long id){
        System.out.println("GoodsService...");
        return goodsMapper.selectByPK(id);
    }
}
