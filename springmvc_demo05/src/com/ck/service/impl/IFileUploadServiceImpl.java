package com.ck.service.impl;

import com.ck.dao.IFileUploadDao;
import com.ck.entity.FileUpload;
import com.ck.service.IFileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IFileUploadServiceImpl implements IFileUploadService {

    @Autowired
    private IFileUploadDao dao;
    @Override
    public void add(FileUpload fileUpload) {
        dao.add(fileUpload);
    }

    @Override
    public List<FileUpload> queryFileUpload() {
        return dao.queryFileUpload();
    }
}
