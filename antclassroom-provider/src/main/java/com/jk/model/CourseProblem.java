package com.jk.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/14 0014.
 *  课程问题表    t_courseproblem
 */
public class CourseProblem implements  Serializable {
    private  Integer questionid;//主键id
    private Integer userid;//问题用户id  ----前台提问题人id
    private String  problemtypeid;//问题类型id   ----关联类型表只能选择3种
    private String questioncontent;//问题内容
    private String questiontitle;//问题标题
    private String questiontime;//提问时间

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getProblemtypeid() {
        return problemtypeid;
    }

    public void setProblemtypeid(String problemtypeid) {
        this.problemtypeid = problemtypeid;
    }

    public String getQuestioncontent() {
        return questioncontent;
    }

    public void setQuestioncontent(String questioncontent) {
        this.questioncontent = questioncontent;
    }

    public String getQuestiontitle() {
        return questiontitle;
    }

    public void setQuestiontitle(String questiontitle) {
        this.questiontitle = questiontitle;
    }

    public String getQuestiontime() {
        return questiontime;
    }

    public void setQuestiontime(String questiontime) {
        this.questiontime = questiontime;
    }

    @Override
    public String toString() {
        return "CourseProblem{" +
                "questionid=" + questionid +
                ", userid=" + userid +
                ", problemtypeid=" + problemtypeid +
                ", questioncontent='" + questioncontent + '\'' +
                ", questiontitle='" + questiontitle + '\'' +
                ", questiontime='" + questiontime + '\'' +
                '}';
    }
}
