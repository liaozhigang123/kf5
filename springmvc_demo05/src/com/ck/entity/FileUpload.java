package com.ck.entity;

import java.util.Date;

public class FileUpload {
    private int fid;
    private String foldname;
    private String fnewname;
    private Date ttime;

    public FileUpload() {
    }

    public FileUpload(int fid, String foldname, String fnewname, Date ttime) {
        this.fid = fid;
        this.foldname = foldname;
        this.fnewname = fnewname;
        this.ttime = ttime;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getFoldname() {
        return foldname;
    }

    public void setFoldname(String foldname) {
        this.foldname = foldname;
    }

    public String getFnewname() {
        return fnewname;
    }

    public void setFnewname(String fnewname) {
        this.fnewname = fnewname;
    }

    public Date getTtime() {
        return ttime;
    }

    public void setTtime(Date ttime) {
        this.ttime = ttime;
    }

    @Override
    public String toString() {
        return "FileUpload{" +
                "fid=" + fid +
                ", foldname='" + foldname + '\'' +
                ", fnewname='" + fnewname + '\'' +
                ", ttime='" + ttime + '\'' +
                '}';
    }
}
