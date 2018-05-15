package com.jk.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/14 0014.
 *   角色表    t_role
 */
public class Role implements Serializable {
    private static final long serialVersionUID = 6748631656776223163L;

    private  Integer  roleid;//主键id
    private  String  rolename;//主键id

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleid=" + roleid +
                ", rolename='" + rolename + '\'' +
                '}';
    }
}
