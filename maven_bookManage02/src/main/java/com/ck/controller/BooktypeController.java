package com.ck.controller;

import com.ck.entity.Booktype;
import com.ck.service.BooktypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BooktypeController {
    @Autowired
    private BooktypeService booktypeService;

    @GetMapping("queryBooktype")
    public String queryBooktype(ModelMap modelMap){
        List<Booktype> booktypeList = booktypeService.queryBooktype();
        modelMap.put("booktypeList",booktypeList);
        return "p_add";
    }
}
