package com.letgym.gymcourse.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tearcher_display")
public class TearcherDisplay {
    @Id
    private Long uid;

    /**
     * 展示链接
     */
    private String url;

    /**
     * 类型(0-图片；1-视频)
     */
    private Boolean type;

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
     * @return uid
     */
    public Long getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * 获取展示链接
     *
     * @return url - 展示链接
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置展示链接
     *
     * @param url 展示链接
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取类型(0-图片；1-视频)
     *
     * @return type - 类型(0-图片；1-视频)
     */
    public Boolean getType() {
        return type;
    }

    /**
     * 设置类型(0-图片；1-视频)
     *
     * @param type 类型(0-图片；1-视频)
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