package com.ck.controller;

import com.ck.entity.Booktype;
import com.ck.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author longhuan
 * @create 2021-05-14-16:23
 */
@Controller
public class BookTypeController {
    @Autowired
    private BookTypeService bookTypeService;

    @RequestMapping("QueryAllType")
    public String queryAllType(ModelMap map){
        List<Booktype> booktypeList = bookTypeService.queryAllBookType();
        map.put("booktypeList",booktypeList);
        return "p_add";
    }



}

