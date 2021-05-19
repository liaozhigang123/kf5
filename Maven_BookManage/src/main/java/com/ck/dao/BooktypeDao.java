package com.ck.dao;

import com.ck.entity.Booktype;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author longhuan
 * @create 2021-05-14-11:45
 */
public interface BooktypeDao {

    //查询所有图书类型
    @Select("select * from booktype")
    @ResultMap("TypeMappers")
    public List<Booktype> queryAllBookType();

    //根据id做查询
    @Select("select * from booktype where btid=#{btid}")
    @ResultMap("TypeMappers")
    public Booktype queryById(int id);
}
