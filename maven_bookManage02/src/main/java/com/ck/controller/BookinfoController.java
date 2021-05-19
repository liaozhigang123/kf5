package com.ck.controller;

import com.ck.entity.Bookinfo;
import com.ck.entity.Booktype;
import com.ck.service.BookinfoService;
import com.ck.service.BooktypeService;
import org.apache.commons.fileupload.FileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class BookinfoController {
    @Autowired
    private BookinfoService bookinfoService;

    @Autowired
    private BooktypeService booktypeService;

    // 查询图书
    @RequestMapping("queryBookinfo")
    public String queryBookinfo(ModelMap modelMap, @RequestParam Map paramMap){

        List<Bookinfo> bookinfoList = bookinfoService.queryBookinfo(paramMap);
        modelMap.put("bookinfoList",bookinfoList);

        //System.out.println("bookinfoList信息"+bookinfoList);

        List<Booktype> booktypeList = booktypeService.queryBooktype();
        modelMap.put("booktypeList",booktypeList);

        modelMap.put("condition",paramMap);

        return "p_list";
    }

    // 添加图书
    @PostMapping("addBookinfo")
    public String addBookinfo(MultipartFile file, HttpSession session,Bookinfo bookinfo){
        String filename = file.getOriginalFilename();

        String realPath = session.getServletContext().getRealPath("images/book_img/");

        filename = filename.replace(filename.substring(0, filename.lastIndexOf(".")), UUID.randomUUID().toString());
        String fnewname = filename;

        filename = realPath + filename;

        //System.out.println("文件名："+filename);
        try {
            file.transferTo(new File(filename));


            bookinfo.setImgurl(fnewname);
            bookinfoService.addBookinfo(bookinfo);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //System.out.println("上传的文件名："+filename);
        return "redirect:queryBookinfo";
    }

    // 删除图书
    @PostMapping("deleteBookinfo")
    @ResponseBody
    public String deleteBookinfo(Integer id){
        try {

            bookinfoService.deleteBookinfo(id);
            return 1+"";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0+"";
    }

    // 批量删除
    @RequestMapping("deleteManyBookinfo")
    public String deleteManyBookinfo(Integer[] ids){
        try {
            bookinfoService.deleteManyBookinfo(ids);
            return 1+"";
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0+"";
    }


}
