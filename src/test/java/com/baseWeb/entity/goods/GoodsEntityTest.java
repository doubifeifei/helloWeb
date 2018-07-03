package com.baseWeb.entity.goods;

import com.alibaba.fastjson.JSON;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GoodsEntityTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test(){
        Student s=new Student();
        s.setId("1");
        s.setMarkPrice(new BigDecimal("1.22"));
        List<BigDecimal> markPriceList=new ArrayList<BigDecimal>();
        markPriceList.add(new BigDecimal("2.55"));
        markPriceList.add(new BigDecimal("4.78"));
        s.setMarkPriceList(markPriceList);
        String ss=JSON.toJSONString(s);
        System.out.println(ss);
        Student s1=JSON.parseObject(ss,Student.class);
        System.out.println(s1);
    }
}