package com.ck.controller;

import com.ck.entity.Aaa;
import com.ck.service.IAaaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AaaController {
    @Autowired
    private IAaaService service1;

    @RequestMapping("queryAaa")
    public String queryAaa(ModelMap modelMap){
        List<Aaa> list = service1.queryAaa();
        modelMap.put("list",list);
        return "1";
    }
}
