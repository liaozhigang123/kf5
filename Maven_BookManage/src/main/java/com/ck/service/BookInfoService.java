package com.ck.service;

import com.ck.dao.BookinfoDao;
import com.ck.entity.Bookinfo;
import com.github.pagehelper.Page;

import java.util.List;
import java.util.Map;

/**
 * @author longhuan
 * @create 2021-05-14-16:43
 */
public interface BookInfoService {
    public List<BookinfoDao> queryAllInfo();
    public Page<Bookinfo> queryByCondition(Map map, int pageNum);
    public void AddBookInfo(Bookinfo bookinfo);
    public void deleteBooks(int[] ids);


}
