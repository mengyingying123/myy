package com.jk.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/14 0014.
 * 大纲表   t_outlin
 */
public class Outlin implements Serializable{
    private static final long serialVersionUID = 1799974528067486643L;

    private Integer outlinid;//主键id
    private String title;//标题
    private Integer staffid;//创建人-------后台登录员工
    private  String createtime;//创建时间
    private  Integer   isitvip;//是否为vip
    private String suomin;//所属小节


    public Integer getOutlinid() {
        return outlinid;
    }

    public void setOutlinid(Integer outlinid) {
        this.outlinid = outlinid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public Integer getIsitvip() {
        return isitvip;
    }

    public void setIsitvip(Integer isitvip) {
        this.isitvip = isitvip;
    }

    public String getSuomin() {
        return suomin;
    }

    public void setSuomin(String suomin) {
        this.suomin = suomin;
    }

    @Override
    public String toString() {
        return "Outlin{" +
                "outlinid=" + outlinid +
                ", title='" + title + '\'' +
                ", staffid=" + staffid +
                ", createtime='" + createtime + '\'' +
                ", isitvip=" + isitvip +
                ", suomin='" + suomin + '\'' +
                '}';
    }
}
