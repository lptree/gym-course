package com.letgym.gymcourse.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "course_schedule_tearchers")
public class CourseScheduleTearchers {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 课程ID
     */
    @Column(name = "scheduleID")
    private Long scheduleid;

    /**
     * 老师用户ID
     */
    @Column(name = "tearcherUID")
    private Long tearcheruid;

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
     * 获取自增ID
     *
     * @return ID - 自增ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置自增ID
     *
     * @param id 自增ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取课程ID
     *
     * @return scheduleID - 课程ID
     */
    public Long getScheduleid() {
        return scheduleid;
    }

    /**
     * 设置课程ID
     *
     * @param scheduleid 课程ID
     */
    public void setScheduleid(Long scheduleid) {
        this.scheduleid = scheduleid;
    }

    /**
     * 获取老师用户ID
     *
     * @return tearcherUID - 老师用户ID
     */
    public Long getTearcheruid() {
        return tearcheruid;
    }

    /**
     * 设置老师用户ID
     *
     * @param tearcheruid 老师用户ID
     */
    public void setTearcheruid(Long tearcheruid) {
        this.tearcheruid = tearcheruid;
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
}