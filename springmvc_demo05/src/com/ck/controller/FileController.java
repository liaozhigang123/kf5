package com.ck.controller;

import com.ck.entity.FileUpload;
import com.ck.service.IFileUploadService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class FileController {
    @Autowired
    private IFileUploadService service1;

    @RequestMapping("upload")
    public String upload(MultipartFile file, HttpSession session){
        String filename = file.getOriginalFilename();
        String foldname = filename;
        String realPath = session.getServletContext().getRealPath("WEB-INF/upload/");

        filename = filename.replace(filename.substring(0, filename.lastIndexOf(".")), UUID.randomUUID().toString());
        String fnewname = filename;

        filename = realPath + filename;

        //System.out.println("文件名："+filename);
        try {
            file.transferTo(new File(filename));
            service1.add(new FileUpload(0,foldname, fnewname, new Date()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //System.out.println("上传的文件名："+filename);
        return "redirect:queryFileUpload";
    }

    @RequestMapping("queryFileUpload")
    public String queryFileUpload(ModelMap modelMap){
        List<FileUpload> fileUploadList = service1.queryFileUpload();
        modelMap.put("fileUploadList",fileUploadList);
        return "file";
    }


    @RequestMapping("download")
    public ResponseEntity download(String fnewname,String foldname,HttpSession session){
        String downFilePath = session.getServletContext().getRealPath("/WEB-INF/upload/" + fnewname);

        try {
            byte[] bytes = FileUtils.readFileToByteArray(new File(downFilePath));

            HttpHeaders headers = new HttpHeaders();
            foldname = new String(foldname.getBytes("UTF-8"),"ISO8859-1");

            headers.setContentDispositionFormData("attachment",foldname);
            return new ResponseEntity(bytes,headers, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  null;
    }


}
