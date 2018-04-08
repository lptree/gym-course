package com.letgym.gymcourse.model;

import java.util.Date;
import javax.persistence.*;

public class User {
    /**
     * 用户ID
     */
    @Id
    private Long uid;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 用户密码 = MD5(MD5(用户明文密码) + salt)
     */
    private String password;

    /**
     * 密码盐
     */
    private String salt;

    /**
     * 用户类型（普通用户-0、会员-1、教练-2、管理员-3）
     */
    private Boolean type;

    /**
     * 是否已删除
     */
    @Column(name = "isDelete")
    private Boolean isdelete;

    /**
     * 注册时间
     */
    @Column(name = "registerTime")
    private Date registertime;

    /**
     * 最后更新时间
     */
    @Column(name = "lastUpdateTime")
    private Date lastupdatetime;

    /**
     * 获取用户ID
     *
     * @return uid - 用户ID
     */
    public Long getUid() {
        return uid;
    }

    /**
     * 设置用户ID
     *
     * @param uid 用户ID
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取用户密码 = MD5(MD5(用户明文密码) + salt)
     *
     * @return password - 用户密码 = MD5(MD5(用户明文密码) + salt)
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码 = MD5(MD5(用户明文密码) + salt)
     *
     * @param password 用户密码 = MD5(MD5(用户明文密码) + salt)
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取密码盐
     *
     * @return salt - 密码盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置密码盐
     *
     * @param salt 密码盐
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 获取用户类型（普通用户-0、会员-1、教练-2、管理员-3）
     *
     * @return type - 用户类型（普通用户-0、会员-1、教练-2、管理员-3）
     */
    public Boolean getType() {
        return type;
    }

    /**
     * 设置用户类型（普通用户-0、会员-1、教练-2、管理员-3）
     *
     * @param type 用户类型（普通用户-0、会员-1、教练-2、管理员-3）
     */
    public void setType(Boolean type) {
        this.type = type;
    }

    /**
     * 获取是否已删除
     *
     * @return isDelete - 是否已删除
     */
    public Boolean getIsdelete() {
        return isdelete;
    }

    /**
     * 设置是否已删除
     *
     * @param isdelete 是否已删除
     */
    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * 获取注册时间
     *
     * @return registerTime - 注册时间
     */
    public Date getRegistertime() {
        return registertime;
    }

    /**
     * 设置注册时间
     *
     * @param registertime 注册时间
     */
    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    /**
     * 获取最后更新时间
     *
     * @return lastUpdateTime - 最后更新时间
     */
    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    /**
     * 设置最后更新时间
     *
     * @param lastupdatetime 最后更新时间
     */
    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }
}