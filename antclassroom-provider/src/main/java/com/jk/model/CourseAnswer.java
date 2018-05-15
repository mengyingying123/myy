package com.jk.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/14 0014.
 * 课程答案表   t_courseanswer
 */
public class CourseAnswer  implements Serializable{
    private static final long serialVersionUID = -8143713469244484090L;

    private Integer courseanswerid;//主键id
    private Integer questionid;//问题id  ---关联问题表
    private String answercontent;//答案内容
    private Integer userid;//回答人id   ---关联用户表
    private String answertime;//回答时间
    private Integer numberlikes;//被点赞数量

    public Integer getCourseanswerid() {
        return courseanswerid;
    }

    public void setCourseanswerid(Integer courseanswerid) {
        this.courseanswerid = courseanswerid;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public String getAnswercontent() {
        return answercontent;
    }

    public void setAnswercontent(String answercontent) {
        this.answercontent = answercontent;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getAnswertime() {
        return answertime;
    }

    public void setAnswertime(String answertime) {
        this.answertime = answertime;
    }

    public Integer getNumberlikes() {
        return numberlikes;
    }

    public void setNumberlikes(Integer numberlikes) {
        this.numberlikes = numberlikes;
    }

    @Override
    public String toString() {
        return "CourseAnswer{" +
                "courseanswerid=" + courseanswerid +
                ", questionid=" + questionid +
                ", answercontent='" + answercontent + '\'' +
                ", userid=" + userid +
                ", answertime='" + answertime + '\'' +
                ", numberlikes=" + numberlikes +
                '}';
    }
}
