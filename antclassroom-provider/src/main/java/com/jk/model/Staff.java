package com.jk.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/14 0014.
 *         员工表    t_staff
 */
public class Staff  implements Serializable{
    private static final long serialVersionUID = 6993892598649222586L;

    private Integer  staffid;   //主键id
    private  String  staffname;//员工名称
    private String staffpass;//员工 员工密码
    private  String  staffsex;//员工性别
    private  Integer  staffage ;//员工年龄

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    public String getStaffpass() {
        return staffpass;
    }

    public void setStaffpass(String staffpass) {
        this.staffpass = staffpass;
    }

    public String getStaffsex() {
        return staffsex;
    }

    public void setStaffsex(String staffsex) {
        this.staffsex = staffsex;
    }

    public Integer getStaffage() {
        return staffage;
    }

    public void setStaffage(Integer staffage) {
        this.staffage = staffage;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffid=" + staffid +
                ", staffname='" + staffname + '\'' +
                ", staffpass='" + staffpass + '\'' +
                ", staffsex='" + staffsex + '\'' +
                ", staffage=" + staffage +
                '}';
    }
}
