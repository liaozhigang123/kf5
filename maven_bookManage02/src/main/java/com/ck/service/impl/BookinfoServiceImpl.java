package com.ck.service.impl;

import com.ck.dao.IBookinfoDao;
import com.ck.entity.Bookinfo;
import com.ck.service.BookinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
@Service
public class BookinfoServiceImpl implements BookinfoService {

    @Autowired
    private IBookinfoDao bookinfoDao;

    // 查询图书
    @Override
    public List<Bookinfo> queryBookinfo(Map map) {
        return bookinfoDao.queryBookinfo(map);
    }

    // 添加图书
    @Override
    @Transactional
    public void addBookinfo(Bookinfo bookinfo) {
        bookinfoDao.addBookinfo(bookinfo);
    }

    @Override
    @Transactional
    public void deleteBookinfo(Integer id) {
        bookinfoDao.deleteBookinfo(id);
    }

    // 批量删除
    @Override
    @Transactional
    public void deleteManyBookinfo(Integer[] ints) {
        bookinfoDao.deleteManyBookinfo(ints);
    }


}
