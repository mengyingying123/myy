package com.jk.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/5/14 0014.
 * 评论和点赞关联表   t_commenthelp
 */
public class CommentHelp  implements Serializable{
    private static final long serialVersionUID = 4493885528135752994L;

    private  Integer commenthelpid;// 主键ID
    private Integer commentid;//评论id  ---关联评论表
    private Integer userid;//点赞人    ---关联用户表


    public Integer getCommenthelpid() {
        return commenthelpid;
    }

    public void setCommenthelpid(Integer commenthelpid) {
        this.commenthelpid = commenthelpid;
    }

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "CommentHelp{" +
                "commenthelpid=" + commenthelpid +
                ", commentid=" + commentid +
                ", userid=" + userid +
                '}';
    }
}
