package com.ck.dao;

import com.ck.entity.Bookinfo;
import org.apache.ibatis.annotations.*;

import javax.faces.annotation.RequestMap;
import java.util.List;
import java.util.Map;

/**
 * @author longhuan
 * @create 2021-05-14-16:36
 */
public interface BookinfoDao {

    //查询所有图书信息
    @Select("select * from bookinfo")
    @ResultMap("InfoMapper")
    public List<BookinfoDao> queryAllInfo();

    //条件查询
    public List<Bookinfo> queryByCondition(Map map);

    //添加图书
    @Insert("insert into bookinfo values(null,#{bname},#{price},#{booktype.btid},#{dtime},#{imgurl},#{state})")
    public void AddBookInfo(Bookinfo bookinfo);

    //批量删除
    @Delete("delete from bookinfo where bid in <foreach cokkection='array' open'(' item='id' closr=')' separator=','>#{id}</foreach>")
    public void deleteBooks(int[] ids);


}
