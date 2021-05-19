package com.ck.service;

import com.ck.entity.Bookinfo;

import java.util.List;
import java.util.Map;

public interface BookinfoService {
    // 查询图书
    List<Bookinfo> queryBookinfo(Map map);

    // 添加图书
    void addBookinfo(Bookinfo bookinfo);

    // 删除图书信息
    void deleteBookinfo(Integer id);

    // 批量删除
    void deleteManyBookinfo(Integer[] ints);

}
