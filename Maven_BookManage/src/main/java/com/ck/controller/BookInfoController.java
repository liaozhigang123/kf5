package com.ck.controller;

import com.ck.dao.BookinfoDao;
import com.ck.entity.Bookinfo;
import com.ck.entity.Booktype;
import com.ck.service.BookInfoService;
import com.ck.service.BookTypeService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author longhuan
 * @create 2021-05-14-16:45
 */
@Controller
public class BookInfoController {
    @Autowired
    private BookInfoService bookInfoService;
    @Autowired
    private BookTypeService bookTypeService;

    //根据条件查询,分页
    @RequestMapping("queryBookInfo")
    public String queryBookInfo(@RequestParam Map paramMap,ModelMap map,int page){
        if(map.get("bname")==null){
            map.put("bname", "");
        }
        if(map.get("btid")==null){
            map.put("btid", 0);
        }
        Page<Bookinfo> bookinfoList = bookInfoService.queryByCondition(map, page);
        map.put("bookinfoList",bookinfoList.getResult());
        map.put("page", bookinfoList.getPageNum());  //获取当前页数
        map.put("total", bookinfoList.getPages());  //获取页数
        map.put("pageSize", bookinfoList.getPageSize()); //获取分页长度(每页多少条)
        List<Booktype> booktypeList = bookTypeService.queryAllBookType();
        map.put("booktypeList",booktypeList);
        map.put("condition",paramMap);
        return "p_list";
    }

    //添加和文件上传  ：定义MultipartFile接收页面上传的数据
    @RequestMapping("AddInfo")
    public String AddInfo(Bookinfo bookinfo,MultipartFile file, HttpSession session){
        String filename = file.getOriginalFilename();
        //上传文件目录
        String realPath = session.getServletContext().getRealPath("/images/book_img/");
        //2.为文件生成唯一的字符串，解决上传文件重名问题
        filename= filename.replace(filename.substring(0, filename.lastIndexOf(".")), UUID.randomUUID().toString());
        //2.获取上传目标文件的路径
        filename=realPath+filename;
        try {
            file.transferTo(new File(filename));
            bookInfoService.AddBookInfo(bookinfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:queryBookInfo?page=1";
    }

    //批量删除
    @RequestMapping("DeleteBookInfo")
    @ResponseBody
    public String deleteBooks(@RequestParam int[] ids){
        try {
            bookInfoService.deleteBooks(ids);
            return "success";
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

}
