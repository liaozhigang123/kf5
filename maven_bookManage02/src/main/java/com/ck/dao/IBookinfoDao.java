package com.ck.dao;

import com.ck.entity.Bookinfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface IBookinfoDao {
    // 查询图书
    List<Bookinfo> queryBookinfo(Map map);

    // 添加图书
    @Insert("insert into bookinfo values(null,#{bname},#{price},#{btid},#{dtime},#{imgurl},#{state})")
    void addBookinfo(Bookinfo bookinfo);

    // 删除图书
    @Delete("delete from bookinfo where bid = #{0}")
    void deleteBookinfo(Integer id);

    // 批量删除
    void deleteManyBookinfo(Integer[] ints);

}
