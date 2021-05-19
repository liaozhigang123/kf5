package com.ck.dao.impl;

import com.ck.dao.IFileUploadDao;
import com.ck.entity.FileUpload;
import com.ck.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Repository
public class IFileUploadDaoImpl implements IFileUploadDao {
    @Override
    public void add(FileUpload fileUpload) {
        SqlSession sqlSession = MybatisUtil.openSession(true);
        IFileUploadDao fileUploadDao = sqlSession.getMapper(IFileUploadDao.class);

        fileUploadDao.add(fileUpload);
    }

    @Override
    public List<FileUpload> queryFileUpload() {
        SqlSession sqlSession = MybatisUtil.openSession(false);
        IFileUploadDao fileUploadDao = sqlSession.getMapper(IFileUploadDao.class);
        List<FileUpload> fileUploadList = fileUploadDao.queryFileUpload();
        return fileUploadList;
    }
}
