package com.jk.model;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/14 0014.
 * 报名中心表   t_registrationcentre
 */
public class RegiStrationCentre implements Serializable {
    private static final long serialVersionUID = 5060995399646850551L;
    private  Integer registrationcentreid;//主键id
    private String name;//姓名
    private String sex;//性别
    private String  phonenumber;//手机号
    private String  qqhowl;//Qq号
    private String wechatid;//微信号
    private String highesteducation;//最高学历
    private String graduatetime;//毕业时间
    private Integer currentsalary;//当前薪资
    private Integer currentstate;//当前状态
    private  Integer itiscontact;//是否联系  ---默认是否


    public Integer getRegistrationcentreid() {
        return registrationcentreid;
    }

    public void setRegistrationcentreid(Integer registrationcentreid) {
        this.registrationcentreid = registrationcentreid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getQqhowl() {
        return qqhowl;
    }

    public void setQqhowl(String qqhowl) {
        this.qqhowl = qqhowl;
    }

    public String getWechatid() {
        return wechatid;
    }

    public void setWechatid(String wechatid) {
        this.wechatid = wechatid;
    }

    public String getHighesteducation() {
        return highesteducation;
    }

    public void setHighesteducation(String highesteducation) {
        this.highesteducation = highesteducation;
    }

    public String getGraduatetime() {
        return graduatetime;
    }

    public void setGraduatetime(String graduatetime) {
        this.graduatetime = graduatetime;
    }

    public Integer getCurrentsalary() {
        return currentsalary;
    }

    public void setCurrentsalary(Integer currentsalary) {
        this.currentsalary = currentsalary;
    }

    public Integer getCurrentstate() {
        return currentstate;
    }

    public void setCurrentstate(Integer currentstate) {
        this.currentstate = currentstate;
    }

    public Integer getItiscontact() {
        return itiscontact;
    }

    public void setItiscontact(Integer itiscontact) {
        this.itiscontact = itiscontact;
    }

    @Override
    public String toString() {
        return "RegiStrationCentre{" +
                "registrationcentreid=" + registrationcentreid +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", qqhowl='" + qqhowl + '\'' +
                ", wechatid='" + wechatid + '\'' +
                ", highesteducation='" + highesteducation + '\'' +
                ", graduatetime='" + graduatetime + '\'' +
                ", currentsalary=" + currentsalary +
                ", currentstate=" + currentstate +
                ", itiscontact=" + itiscontact +
                '}';
    }
}
