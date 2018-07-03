package com.baseWeb.controller;

import com.baseWeb.utils.wx.utils.AdvancedUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class WeixinContrlller {

    @RequestMapping(value = "/getWxConfig")
    @ResponseBody
    public Map<String,String> index(HttpServletRequest request) {
        System.out.println("微信信息获取...");
        String url=request.getHeader("referer");
        return AdvancedUtil.getWxConfig(url);
    }

}
