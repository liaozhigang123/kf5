package com.ck.dao;

import com.ck.entity.Aaa;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IAaaDao {
    @Select("select * from aaa")
    @ResultMap("aaaMapper")
    List<Aaa> queryAll();
}
