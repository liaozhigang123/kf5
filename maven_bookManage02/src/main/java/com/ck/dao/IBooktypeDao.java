package com.ck.dao;

import com.ck.entity.Booktype;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IBooktypeDao {
    @Select("select * from booktype where btid = #{0}")
    @ResultMap("booktypeMapper")
    Booktype queryByIdBooktype(Integer id);

    @Select("select * from booktype")
    List<Booktype> queryBooktype();
}
