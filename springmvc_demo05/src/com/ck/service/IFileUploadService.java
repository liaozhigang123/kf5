package com.ck.service;

import com.ck.entity.FileUpload;

import java.util.List;

public interface IFileUploadService {
    void add(FileUpload fileUpload);

    List<FileUpload> queryFileUpload();
}
