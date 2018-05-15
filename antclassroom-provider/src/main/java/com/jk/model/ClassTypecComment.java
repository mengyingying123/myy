package com.jk.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/14 0014.
 * 课程评论表    t_classtypecomment
 */
public class ClassTypecComment implements Serializable{
    private static final long serialVersionUID = -406086910685458221L;

    private  Integer classtypecommentid;//主键id
    private String commentcontent;//评论内容
    private String creatrontime;//创建时间
    private Integer numberlikes;// 点赞数量   ---一个用户只能点赞一次
    private  Integer syllabusid;//课程id  ----关联课程表


    public Integer getClasstypecommentid() {
        return classtypecommentid;
    }

    public void setClasstypecommentid(Integer classtypecommentid) {
        this.classtypecommentid = classtypecommentid;
    }

    public String getCommentcontent() {
        return commentcontent;
    }

    public void setCommentcontent(String commentcontent) {
        this.commentcontent = commentcontent;
    }

    public String getCreatrontime() {
        return creatrontime;
    }

    public void setCreatrontime(String creatrontime) {
        this.creatrontime = creatrontime;
    }

    public Integer getNumberlikes() {
        return numberlikes;
    }

    public void setNumberlikes(Integer numberlikes) {
        this.numberlikes = numberlikes;
    }

    public Integer getSyllabusid() {
        return syllabusid;
    }

    public void setSyllabusid(Integer syllabusid) {
        this.syllabusid = syllabusid;
    }

    @Override
    public String toString() {
        return "ClassTypecComment{" +
                "classtypecommentid=" + classtypecommentid +
                ", commentcontent='" + commentcontent + '\'' +
                ", creatrontime='" + creatrontime + '\'' +
                ", numberlikes=" + numberlikes +
                ", syllabusid=" + syllabusid +
                '}';
    }
}
