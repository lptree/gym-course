package com.letgym.gymcourse.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "course_schedules")
public class CourseSchedules {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "scheduleID")
    private Long scheduleid;

    /**
     * 课ID
     */
    @Column(name = "courseID")
    private Integer courseid;

    /**
     * 名称
     */
    private String name;

    /**
     * 老师用户ID
     */
    @Column(name = "tearcherUID")
    private Long tearcheruid;

    /**
     * 开始时间
     */
    @Column(name = "startTime")
    private Date starttime;

    @Column(name = "endTime")
    private Date endtime;

    /**
     * 预计人数
     */
    @Column(name = "personNum")
    private Integer personnum;

    /**
     * 可报人数
     */
    @Column(name = "availNum")
    private Integer availnum;

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
     * 课程描述
     */
    @Column(name = "scheduleDesc")
    private String scheduledesc;

    /**
     * 获取自增ID
     *
     * @return scheduleID - 自增ID
     */
    public Long getScheduleid() {
        return scheduleid;
    }

    /**
     * 设置自增ID
     *
     * @param scheduleid 自增ID
     */
    public void setScheduleid(Long scheduleid) {
        this.scheduleid = scheduleid;
    }

    /**
     * 获取课ID
     *
     * @return courseID - 课ID
     */
    public Integer getCourseid() {
        return courseid;
    }

    /**
     * 设置课ID
     *
     * @param courseid 课ID
     */
    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取开始时间
     *
     * @return startTime - 开始时间
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * 设置开始时间
     *
     * @param starttime 开始时间
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * @return endTime
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * @param endtime
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * 获取预计人数
     *
     * @return personNum - 预计人数
     */
    public Integer getPersonnum() {
        return personnum;
    }

    /**
     * 设置预计人数
     *
     * @param personnum 预计人数
     */
    public void setPersonnum(Integer personnum) {
        this.personnum = personnum;
    }

    /**
     * 获取可报人数
     *
     * @return availNum - 可报人数
     */
    public Integer getAvailnum() {
        return availnum;
    }

    /**
     * 设置可报人数
     *
     * @param availnum 可报人数
     */
    public void setAvailnum(Integer availnum) {
        this.availnum = availnum;
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
     * 获取课程描述
     *
     * @return scheduleDesc - 课程描述
     */
    public String getScheduledesc() {
        return scheduledesc;
    }

    /**
     * 设置课程描述
     *
     * @param scheduledesc 课程描述
     */
    public void setScheduledesc(String scheduledesc) {
        this.scheduledesc = scheduledesc;
    }
}