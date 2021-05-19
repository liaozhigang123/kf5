package com.ck.service.impl;

import com.ck.dao.BookinfoDao;
import com.ck.entity.Bookinfo;
import com.ck.service.BookInfoService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author longhuan
 * @create 2021-05-14-16:44
 */
@Service
public class BookInfoServiceimpl implements BookInfoService {
    @Autowired
    private BookinfoDao bookinfoDao;

    @Override
    public List<BookinfoDao> queryAllInfo() {
        return bookinfoDao.queryAllInfo();
    }

    @Override
    //条件+分页查询  pageNum:显示当前页  pageSize:一页显示多少条
    public Page<Bookinfo> queryByCondition(Map map, int pageNum) {
        Page<Bookinfo> page = PageHelper.startPage(pageNum, 5);
        bookinfoDao.queryByCondition(map);
        return  page;
    }

    @Override
    @Transactional
    public void AddBookInfo(Bookinfo bookinfo) {
         bookinfoDao.AddBookInfo(bookinfo);
    }

    @Override
    @Transactional
    public void deleteBooks(int[] ids) {
        bookinfoDao.deleteBooks(ids);
    }



}
