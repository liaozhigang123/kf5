package com.ck.dao;

import com.ck.entity.FileUpload;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IFileUploadDao {

    @Insert("insert into file_upload values(null,#{foldname},#{fnewname},#{ttime})")
    void add(FileUpload fileUpload);

    // 查询
    @Select("Select * from file_upload")
    List<FileUpload> queryFileUpload();
}
