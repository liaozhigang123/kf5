package com.ck.service.impl;

import com.ck.dao.BooktypeDao;
import com.ck.entity.Booktype;
import com.ck.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author longhuan
 * @create 2021-05-14-16:20
 */
@Service
public class BookTypeServiceImpl implements BookTypeService {
    @Autowired
    private BooktypeDao booktypeDao;

    @Override
    public List<Booktype> queryAllBookType() {
        return booktypeDao.queryAllBookType();
    }

    @Override
    public Booktype queryById(int id) {
        return booktypeDao.queryById(id);
    }
}
