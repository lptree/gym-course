package com.letgym.gymcourse.model.custom;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author jx-air
 * @version 1.0
 * @date Created in 2018/5/2 8:56
 */
public class UserDTO {
    /**
     * 用户ID
     */
    private Long uid;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    /**

     * 手机号
     */
    private String mobile;

    /**
     * 用户类型（普通用户-0、会员-1、教练-2、管理员-3）
     */
    private Boolean type;

    /**
     * 是否已删除
     */
    private Boolean delete;

    /**
     * 注册时间
     */
    private Date registertime;
}
