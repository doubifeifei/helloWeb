package com.baseWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexContrlller {
    @RequestMapping(value = "index")
    public ModelAndView index() {
        System.out.println("IndexController...");
        ModelAndView mv=new ModelAndView("view/index");
        System.out.println("dhheh对对");
        return mv;
    }

}
