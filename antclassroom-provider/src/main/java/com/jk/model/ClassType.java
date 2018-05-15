package com.jk.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/14 0014.
 * 班型表    t_classtype
 */
public class ClassType implements Serializable {
    private static final long serialVersionUID = 5282748940537299874L;

    private Integer classtypeid;//主键id
    private String classtypename;//班型名称

    public Integer getClasstypeid() {
        return classtypeid;
    }

    public void setClasstypeid(Integer classtypeid) {
        this.classtypeid = classtypeid;
    }

    public String getClasstypename() {
        return classtypename;
    }

    public void setClasstypename(String classtypename) {
        this.classtypename = classtypename;
    }

    @Override
    public String toString() {
        return "ClassType{" +
                "classtypeid=" + classtypeid +
                ", classtypename='" + classtypename + '\'' +
                '}';
    }
}
