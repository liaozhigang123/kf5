package com.ck.entity;
/*CREATE TABLE bookinfo(-- 图书表
        bid INT PRIMARY KEY AUTO_INCREMENT, --  图书编号
        bname VARCHAR(100) NOT NULL, -- 图书名
        price INT, -- 价格
        btid INT, -- 图书类型编号
        dtime DATE, -- 出版时间
        imgurl VARCHAR(100), -- 图片路径
        state INT -- 审核状态（0-未审核，1-已审核）
        );*/

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Bookinfo {
    private Integer bid;
    private String bname;
    private Integer price;

    private Integer btid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dtime;
    private String imgurl;
    private Integer state;

    private Booktype booktype;

    public Bookinfo() {
    }

    public Bookinfo(Integer bid, String bname, Integer price, Integer btid, Date dtime, String imgurl, Integer state, Booktype booktype) {
        this.bid = bid;
        this.bname = bname;
        this.price = price;
        this.btid = btid;
        this.dtime = dtime;
        this.imgurl = imgurl;
        this.state = state;
        this.booktype = booktype;
    }

    public Integer getBtid() {
        return btid;
    }

    public void setBtid(Integer btid) {
        this.btid = btid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Booktype getBooktype() {
        return booktype;
    }

    public void setBooktype(Booktype booktype) {
        this.booktype = booktype;
    }

    @Override
    public String toString() {
        return "Bookinfo{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", price=" + price +
                ", btid=" + btid +
                ", dtime=" + dtime +
                ", imgurl='" + imgurl + '\'' +
                ", state=" + state +
                ", booktype=" + booktype +
                '}';
    }
}
