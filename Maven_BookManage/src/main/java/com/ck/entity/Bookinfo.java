package com.ck.entity;

import java.util.Date;

/**
 * @author longhuan
 * @create 2021-05-14-11:39
 * 图书实体类
 */
public class Bookinfo {
 private int bid;
 private String bname;
 private double price;
 //图书-图书类型
  private Booktype booktype;
  private Date dtime;
  private String imgurl;
  private int state;

    public Bookinfo(int bid, String bname, double price, Booktype booktype, Date dtime, String imgurl, int state) {
        this.bid = bid;
        this.bname = bname;
        this.price = price;
        this.booktype = booktype;
        this.dtime = dtime;
        this.imgurl = imgurl;
        this.state = state;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Booktype getBooktype() {
        return booktype;
    }

    public void setBooktype(Booktype booktype) {
        this.booktype = booktype;
    }

    public Date getDtime() {
        return dtime;
    }

    public void setDtime(Date dtime) {
        this.dtime = dtime;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Bookinfo() {
    }

    @Override
    public String toString() {
        return "Bookinfo{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", price=" + price +
                ", booktype=" + booktype +
                ", dtime=" + dtime +
                ", imgurl='" + imgurl + '\'' +
                ", state=" + state +
                '}';
    }
}
