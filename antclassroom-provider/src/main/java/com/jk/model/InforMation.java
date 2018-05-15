package com.jk.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/14 0014.
 *
 视频信息表   t_information
 */
public class InforMation  implements Serializable{
    private static final long serialVersionUID = -3302649350192159593L;

    private  Integer informationid;// 主键id
    private String videoname;// 视频名称
    private Integer syllabusid;//课程id  -----关联课程表
    private  Integer outlinid;// 大纲id  ---关联大纲表
    private String crieatertime;//创建时间
    private Integer staffid;//创建人  ----后台员工id


    public Integer getInformationid() {
        return informationid;
    }

    public void setInformationid(Integer informationid) {
        this.informationid = informationid;
    }

    public String getVideoname() {
        return videoname;
    }

    public void setVideoname(String videoname) {
        this.videoname = videoname;
    }

    public Integer getSyllabusid() {
        return syllabusid;
    }

    public void setSyllabusid(Integer syllabusid) {
        this.syllabusid = syllabusid;
    }

    public Integer getOutlinid() {
        return outlinid;
    }

    public void setOutlinid(Integer outlinid) {
        this.outlinid = outlinid;
    }

    public String getCrieatertime() {
        return crieatertime;
    }

    public void setCrieatertime(String crieatertime) {
        this.crieatertime = crieatertime;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    @Override
    public String toString() {
        return "InforMation{" +
                "informationid=" + informationid +
                ", videoname='" + videoname + '\'' +
                ", syllabusid=" + syllabusid +
                ", outlinid=" + outlinid +
                ", crieatertime='" + crieatertime + '\'' +
                ", staffid=" + staffid +
                '}';
    }
}
