package com.letgym.gymcourse.model;

import java.util.Date;
import javax.persistence.*;

public class Courses {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "courseID")
    private Integer courseid;

    /**
     * 名称
     */
    private String name;

    /**
     * 副名称
     */
    @Column(name = "subName")
    private String subname;

    /**
     * 推荐指数
     */
    @Column(name = "recommendScore")
    private Integer recommendscore;

    /**
     * 开始时间
     */
    @Column(name = "startTime")
    private Date starttime;

    /**
     * 结束时间
     */
    @Column(name = "endTime")
    private Date endtime;

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
     * @return courseID - 自增ID
     */
    public Integer getCourseid() {
        return courseid;
    }

    /**
     * 设置自增ID
     *
     * @param courseid 自增ID
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
     * 获取副名称
     *
     * @return subName - 副名称
     */
    public String getSubname() {
        return subname;
    }

    /**
     * 设置副名称
     *
     * @param subname 副名称
     */
    public void setSubname(String subname) {
        this.subname = subname;
    }

    /**
     * 获取推荐指数
     *
     * @return recommendScore - 推荐指数
     */
    public Integer getRecommendscore() {
        return recommendscore;
    }

    /**
     * 设置推荐指数
     *
     * @param recommendscore 推荐指数
     */
    public void setRecommendscore(Integer recommendscore) {
        this.recommendscore = recommendscore;
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
     * 获取结束时间
     *
     * @return endTime - 结束时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 设置结束时间
     *
     * @param endtime 结束时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
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