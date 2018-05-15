package com.jk.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/14 0014.
 员工角色中间表    t_staffrole
 */
public class StaffRole  implements Serializable{
    private static final long serialVersionUID = 202835632745448714L;

    private  Integer staffroleid;//主键id
    private Integer  srstaffid;//员工id
    private Integer  srroleid;// 角色id

    public Integer getStaffroleid() {
        return staffroleid;
    }

    public void setStaffroleid(Integer staffroleid) {
        this.staffroleid = staffroleid;
    }

    public Integer getSrstaffid() {
        return srstaffid;
    }

    public void setSrstaffid(Integer srstaffid) {
        this.srstaffid = srstaffid;
    }

    public Integer getSrroleid() {
        return srroleid;
    }

    public void setSrroleid(Integer srroleid) {
        this.srroleid = srroleid;
    }

    @Override
    public String toString() {
        return "StaffRole{" +
                "staffroleid=" + staffroleid +
                ", srstaffid=" + srstaffid +
                ", srroleid=" + srroleid +
                '}';
    }
}
