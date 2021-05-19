package com.ck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//页面跳转的controller
@Controller
public class PageController {
@RequestMapping("page")
    public String page(String page){
    return page;
}
}
