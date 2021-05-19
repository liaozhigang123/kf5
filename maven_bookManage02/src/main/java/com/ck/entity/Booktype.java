package com.ck.entity;
//CREATE TABLE booktype(-- 图书类型表
//        btid INT PRIMARY KEY AUTO_INCREMENT, -- 类型编号
//        btname VARCHAR(20) NOT NULL -- 类型名称
//        );

import java.util.List;

public class Booktype {
    private Integer btid;
    private String btname;
    private List<Bookinfo> bookinfoList;

    public Booktype() {
    }

    public Booktype(Integer btid, String btname, List<Bookinfo> bookinfoList) {
        this.btid = btid;
        this.btname = btname;
        this.bookinfoList = bookinfoList;
    }

    public Integer getBtid() {
        return btid;
    }

    public void setBtid(Integer btid) {
        this.btid = btid;
    }

    public String getBtname() {
        return btname;
    }

    public void setBtname(String btname) {
        this.btname = btname;
    }

    public List<Bookinfo> getBookinfoList() {
        return bookinfoList;
    }

    public void setBookinfoList(List<Bookinfo> bookinfoList) {
        this.bookinfoList = bookinfoList;
    }

    @Override
    public String toString() {
        return "Booktype{" +
                "btid=" + btid +
                ", btname='" + btname + '\'' +
                ", bookinfoList=" + bookinfoList +
                '}';
    }
}
