package com.jk.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/14 0014.
 * 分享记录表   t_sharerecord
 */
public class Sharerecord  implements Serializable{
    private static final long serialVersionUID = 9004973490416193777L;

    private  Integer sharerecordid;//主键id
    private Integer userid;// 分享人id -----前台登录人id
    private Integer syllabusid;//课程id  ----关联课程表
    private  String sharereroad;//分享途径  ---qq，微信

    public Integer getSharerecordid() {
        return sharerecordid;
    }

    public void setSharerecordid(Integer sharerecordid) {
        this.sharerecordid = sharerecordid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getSyllabusid() {
        return syllabusid;
    }

    public void setSyllabusid(Integer syllabusid) {
        this.syllabusid = syllabusid;
    }

    public String getSharereroad() {
        return sharereroad;
    }

    public void setSharereroad(String sharereroad) {
        this.sharereroad = sharereroad;
    }

    @Override
    public String toString() {
        return "Sharerecord{" +
                "sharerecordid=" + sharerecordid +
                ", userid=" + userid +
                ", syllabusid=" + syllabusid +
                ", sharereroad='" + sharereroad + '\'' +
                '}';
    }
}
