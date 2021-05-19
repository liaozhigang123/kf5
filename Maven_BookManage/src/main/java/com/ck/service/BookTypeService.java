package com.ck.service;

import com.ck.entity.Booktype;

import java.util.List;

/**
 * @author longhuan
 * @create 2021-05-14-16:19
 */
public interface BookTypeService {
    public List<Booktype> queryAllBookType();
    public Booktype queryById(int id);
}
