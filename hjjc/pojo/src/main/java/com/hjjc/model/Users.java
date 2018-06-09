package com.hjjc.model;

import java.io.Serializable;

/**
 * [STRATO MyBatis Generator]
 * Table: Users
@mbggenerated do_not_delete_during_merge 2018-03-27 16:27:30
 */
public class Users implements Serializable {
    /**
     * Column: Users.UserID
    @mbggenerated 2018-03-27 16:27:30
     */
    private Integer userID;

    /**
     * Column: Users.UserName
    @mbggenerated 2018-03-27 16:27:30
     */
    private String userName;

    /**
     * Column: Users.UserPwd
    @mbggenerated 2018-03-27 16:27:30
     */
    private String userPwd;

    /**
     * Column: Users.RealName
    @mbggenerated 2018-03-27 16:27:30
     */
    private String realName;

    /**
     * Column: Users.UserRole
    @mbggenerated 2018-03-27 16:27:30
     */
    private String userRole;

    /**
     * Table: Users
    @mbggenerated 2018-03-27 16:27:30
     */
    private static final long serialVersionUID = 1L;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole == null ? null : userRole.trim();
    }
}