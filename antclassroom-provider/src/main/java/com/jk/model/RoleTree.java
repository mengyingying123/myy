package com.jk.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/14 0014.
 *
 角色权限中间表   t_roletree
 */
public class RoleTree implements Serializable{
    private static final long serialVersionUID = -5141134808646904914L;

    private Integer roletreeid;//主键id
    private Integer rtroleid;//角色id
    private Integer rttreeid;// 权限id


    public Integer getRoletreeid() {
        return roletreeid;
    }

    public void setRoletreeid(Integer roletreeid) {
        this.roletreeid = roletreeid;
    }

    public Integer getRtroleid() {
        return rtroleid;
    }

    public void setRtroleid(Integer rtroleid) {
        this.rtroleid = rtroleid;
    }

    public Integer getRttreeid() {
        return rttreeid;
    }

    public void setRttreeid(Integer rttreeid) {
        this.rttreeid = rttreeid;
    }

    @Override
    public String toString() {
        return "RoleTree{" +
                "roletreeid=" + roletreeid +
                ", rtroleid=" + rtroleid +
                ", rttreeid=" + rttreeid +
                '}';
    }
}
