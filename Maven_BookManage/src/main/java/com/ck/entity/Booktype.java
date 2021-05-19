package com.ck.entity;

import java.util.List;

/**
 * @author longhuan
 * @create 2021-05-14-11:37
 * 图书类型实体类
 */
public class Booktype {
private int btid;
private String btname;
//图书类型--图书
    private List<Bookinfo> bookinfos;

    public List<Bookinfo> getBookinfos() {
        return bookinfos;
    }

    public void setBookinfos(List<Bookinfo> bookinfos) {
        this.bookinfos = bookinfos;
    }

    public Booktype(int btid, String btname, List<Bookinfo> bookinfos) {
        this.btid = btid;
        this.btname = btname;
        this.bookinfos = bookinfos;
    }

    public Booktype() {
    }

    public int getBtid() {
        return btid;
    }

    public void setBtid(int btid) {
        this.btid = btid;
    }

    public String getBtname() {
        return btname;
    }

    public void setBtname(String btname) {
        this.btname = btname;
    }

    @Override
    public String toString() {
        return "Booktype{" +
                "btid=" + btid +
                ", btname='" + btname + '\'' +
                ", bookinfos=" + bookinfos +
                '}';
    }
}
