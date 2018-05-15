package com.jk.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/14 0014.
 * 问题类型表    t_problemtype
 */
public class ProblemType implements Serializable{
    private static final long serialVersionUID = -6846681634658561021L;
    private  Integer problemtypeid;//   主键id
    private String problemtypename;// 问题类型名称

    public Integer getProblemtypeid() {
        return problemtypeid;
    }

    public void setProblemtypeid(Integer problemtypeid) {
        this.problemtypeid = problemtypeid;
    }

    public String getProblemtypename() {
        return problemtypename;
    }

    public void setProblemtypename(String problemtypename) {
        this.problemtypename = problemtypename;
    }

    @Override
    public String toString() {
        return "ProblemType{" +
                "problemtypeid=" + problemtypeid +
                ", problemtypename='" + problemtypename + '\'' +
                '}';
    }
}
