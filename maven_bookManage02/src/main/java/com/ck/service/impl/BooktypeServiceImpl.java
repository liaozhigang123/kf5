package com.ck.service.impl;

import com.ck.dao.IBooktypeDao;
import com.ck.entity.Booktype;
import com.ck.service.BooktypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BooktypeServiceImpl implements BooktypeService {
    @Autowired
    private IBooktypeDao booktypeDao;

    @Override
    public List<Booktype> queryBooktype() {
        return booktypeDao.queryBooktype();
    }
}
