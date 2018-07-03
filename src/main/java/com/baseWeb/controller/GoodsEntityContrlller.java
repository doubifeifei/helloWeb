package com.baseWeb.controller;

import com.baseWeb.entity.goods.Student;
import com.baseWeb.entity.goods.Teacher;
import com.baseWeb.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class GoodsEntityContrlller {
    @Autowired
    public GoodsService goodsService;
    @RequestMapping(value = "getGoodsEntity")
    @ResponseBody
    public Map<String, Object> index(Student student, Teacher tName) {
        System.out.println("GoodsEntityContrlller...");
        System.out.println(student);
        System.out.println(tName);
        Map<String,Object> map=new HashMap<>();
        map.put("res","success");
//        ModelAndView mv=new ModelAndView("view/index");
//        System.out.println(goodsService.getGoodsEntityByPK(id));
        return map;
    }

}
