package com.accp.domain;

import java.util.Date;

public class Caigou {
    private Integer cgid;

    private Date cgdate;

    private Integer gysid;

    private Integer ygid;

    private Integer cgcount;

    private Float cgprice;

    private Integer dpid;

    private Integer sid;

    public Integer getCgid() {
        return cgid;
    }

    public void setCgid(Integer cgid) {
        this.cgid = cgid;
    }

    public Date getCgdate() {
        return cgdate;
    }

    public void setCgdate(Date cgdate) {
        this.cgdate = cgdate;
    }

    public Integer getGysid() {
        return gysid;
    }

    public void setGysid(Integer gysid) {
        this.gysid = gysid;
    }

    public Integer getYgid() {
        return ygid;
    }

    public void setYgid(Integer ygid) {
        this.ygid = ygid;
    }

    public Integer getCgcount() {
        return cgcount;
    }

    public void setCgcount(Integer cgcount) {
        this.cgcount = cgcount;
    }

    public Float getCgprice() {
        return cgprice;
    }

    public void setCgprice(Float cgprice) {
        this.cgprice = cgprice;
    }

    public Integer getDpid() {
        return dpid;
    }

    public void setDpid(Integer dpid) {
        this.dpid = dpid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
}