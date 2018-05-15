package com.jk.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/14 0014.
 * 课程表    （一个课程对应多个大纲） t_syllabus
 */
public class Syllabus implements Serializable{
    private static final long serialVersionUID = 6097970923226128083L;

    private Integer syllabusid;//主键id
    private Integer lecturerid;//讲师id
    private String classname;//课程名称
    private Integer  newprice;//最新价格
    private Integer  jiuprice;// 原价
    private String  discounts;// 是否打折
    private String  syllabusintroduce;//课程介绍
    private Integer  classtypeid;//班型id
    private Integer  type;// 类型：  免费/会员
    private Integer classnumber;//课时数：默认为0
    private Integer downloadsnumber;//下载数量
    private Integer viewsnumber;//浏览数量
    private String generalizedstate;//推广状态     前台的轮播图
    private String generalizprcure;//推广图片   oss服务器
    private Integer productstate;// 是否精品   前台只能显示8个


    public Integer getSyllabusid() {
        return syllabusid;
    }

    public void setSyllabusid(Integer syllabusid) {
        this.syllabusid = syllabusid;
    }

    public Integer getLecturerid() {
        return lecturerid;
    }

    public void setLecturerid(Integer lecturerid) {
        this.lecturerid = lecturerid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Integer getNewprice() {
        return newprice;
    }

    public void setNewprice(Integer newprice) {
        this.newprice = newprice;
    }

    public Integer getJiuprice() {
        return jiuprice;
    }

    public void setJiuprice(Integer jiuprice) {
        this.jiuprice = jiuprice;
    }

    public String getDiscounts() {
        return discounts;
    }

    public void setDiscounts(String discounts) {
        this.discounts = discounts;
    }

    public String getSyllabusintroduce() {
        return syllabusintroduce;
    }

    public void setSyllabusintroduce(String syllabusintroduce) {
        this.syllabusintroduce = syllabusintroduce;
    }

    public Integer getClasstypeid() {
        return classtypeid;
    }

    public void setClasstypeid(Integer classtypeid) {
        this.classtypeid = classtypeid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getClassnumber() {
        return classnumber;
    }

    public void setClassnumber(Integer classnumber) {
        this.classnumber = classnumber;
    }

    public Integer getDownloadsnumber() {
        return downloadsnumber;
    }

    public void setDownloadsnumber(Integer downloadsnumber) {
        this.downloadsnumber = downloadsnumber;
    }

    public Integer getViewsnumber() {
        return viewsnumber;
    }

    public void setViewsnumber(Integer viewsnumber) {
        this.viewsnumber = viewsnumber;
    }

    public String getGeneralizedstate() {
        return generalizedstate;
    }

    public void setGeneralizedstate(String generalizedstate) {
        this.generalizedstate = generalizedstate;
    }

    public String getGeneralizprcure() {
        return generalizprcure;
    }

    public void setGeneralizprcure(String generalizprcure) {
        this.generalizprcure = generalizprcure;
    }

    public Integer getProductstate() {
        return productstate;
    }

    public void setProductstate(Integer productstate) {
        this.productstate = productstate;
    }

    @Override
    public String toString() {
        return "Syllabus{" +
                "syllabusid=" + syllabusid +
                ", lecturerid=" + lecturerid +
                ", classname='" + classname + '\'' +
                ", newprice=" + newprice +
                ", jiuprice=" + jiuprice +
                ", discounts='" + discounts + '\'' +
                ", syllabusintroduce='" + syllabusintroduce + '\'' +
                ", classtypeid=" + classtypeid +
                ", type=" + type +
                ", classnumber=" + classnumber +
                ", downloadsnumber=" + downloadsnumber +
                ", viewsnumber=" + viewsnumber +
                ", generalizedstate='" + generalizedstate + '\'' +
                ", generalizprcure='" + generalizprcure + '\'' +
                ", productstate=" + productstate +
                '}';
    }
}
