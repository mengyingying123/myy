package com.jk.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/14 0014.
 *  用户表    t_user
 */
public class User implements Serializable{
    private static final long serialVersionUID = -6670640310551713010L;
    private  Integer userid;//   主键id
    private String userpostbox;// 邮箱
    private String userphonenumber;//手机号
    private String userpass;// 密码   MD5
    private Integer itismember;//是否为会员   默认为否
    private String memberexpirationtime;// 会员到期时间
    private String username;//姓名
    private String nickname;//昵称


    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUserpostbox() {
        return userpostbox;
    }

    public void setUserpostbox(String userpostbox) {
        this.userpostbox = userpostbox;
    }

    public String getUserphonenumber() {
        return userphonenumber;
    }

    public void setUserphonenumber(String userphonenumber) {
        this.userphonenumber = userphonenumber;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public Integer getItismember() {
        return itismember;
    }

    public void setItismember(Integer itismember) {
        this.itismember = itismember;
    }

    public String getMemberexpirationtime() {
        return memberexpirationtime;
    }

    public void setMemberexpirationtime(String memberexpirationtime) {
        this.memberexpirationtime = memberexpirationtime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", userpostbox='" + userpostbox + '\'' +
                ", userphonenumber='" + userphonenumber + '\'' +
                ", userpass='" + userpass + '\'' +
                ", itismember=" + itismember +
                ", memberexpirationtime='" + memberexpirationtime + '\'' +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
