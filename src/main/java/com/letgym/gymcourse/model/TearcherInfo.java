package com.letgym.gymcourse.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tearcher_info")
public class TearcherInfo {
    /**
     * 教练ID
     */
    @Id
    private Long uid;

    /**
     * 教练级别
     */
    @Column(name = "tearcherGrade")
    private String tearchergrade;

    /**
     * 是否已删除
     */
    @Column(name = "isDelete")
    private Boolean isdelete;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 最后更新时间
     */
    @Column(name = "lastUpdateTime")
    private Date lastupdatetime;

    /**
     * 描述信息
     */
    @Column(name = "tearcherDesc")
    private String tearcherdesc;

    /**
     * 获取教练ID
     *
     * @return uid - 教练ID
     */
    public Long getUid() {
        return uid;
    }

    /**
     * 设置教练ID
     *
     * @param uid 教练ID
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * 获取教练级别
     *
     * @return tearcherGrade - 教练级别
     */
    public String getTearchergrade() {
        return tearchergrade;
    }

    /**
     * 设置教练级别
     *
     * @param tearchergrade 教练级别
     */
    public void setTearchergrade(String tearchergrade) {
        this.tearchergrade = tearchergrade;
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
     * 获取创建时间
     *
     * @return createTime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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

    /**
     * 获取描述信息
     *
     * @return tearcherDesc - 描述信息
     */
    public String getTearcherdesc() {
        return tearcherdesc;
    }

    /**
     * 设置描述信息
     *
     * @param tearcherdesc 描述信息
     */
    public void setTearcherdesc(String tearcherdesc) {
        this.tearcherdesc = tearcherdesc;
    }
}