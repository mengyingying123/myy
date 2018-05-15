package com.jk.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/14 0014.
 * 讲师表   t_lecturer
 */
public class Lecturer implements Serializable{
    private static final long serialVersionUID = -2370601703907281760L;

    private Integer lecturerid;// 主键id
    private  String lecturername;//讲师名称
    private  String crentiondate;//创建日期

    public Integer getLecturerid() {
        return lecturerid;
    }

    public void setLecturerid(Integer lecturerid) {
        this.lecturerid = lecturerid;
    }

    public String getLecturername() {
        return lecturername;
    }

    public void setLecturername(String lecturername) {
        this.lecturername = lecturername;
    }

    public String getCrentiondate() {
        return crentiondate;
    }

    public void setCrentiondate(String crentiondate) {
        this.crentiondate = crentiondate;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "lecturerid=" + lecturerid +
                ", lecturername='" + lecturername + '\'' +
                ", crentiondate='" + crentiondate + '\'' +
                '}';
    }
}
