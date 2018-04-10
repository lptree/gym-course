package com.letgym.gymcourse.model.custom;

import java.util.Date;

/*
* 用户基本信息平铺版
* */
public class UserDetailInfo {


    /**
     * 用户ID
     */

    private Long uid;

    /**
     * 手机号
     */
    private String mobile;

//    /**
//     * 用户密码 = MD5(MD5(用户明文密码) + salt)
//     */
//    private String password;
//
//    /**
//     * 密码盐
//     */
//    private String salt;

    /**
     * 用户类型（普通用户-0、会员-1、教练-2、管理员-3）
     */
    private Boolean type;

    /**
     * 注册时间
     */
    private Date registertime;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getSalt() {
//        return salt;
//    }
//
//    public void setSalt(String salt) {
//        this.salt = salt;
//    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }



    /**
     * 用户昵称
     */
    private String username;

    /**
     * 绑定邮箱
     */
    private String email;

    /**
     * 性别(0-默认1-男 2-女)
     */
    private Boolean gender;

    /**
     * 生日
     */
    private Date birthdate;

    /**
     * QQ标示码
     */
    private String qqcode;

    /**
     * 微信标示码
     */
    private String wechatcode;

    /**
     * 会员有效期开始时间
     */
    private Date memberstarttime;

    /**
     * 会员有效期结束时间
     */
    private Date memberendtime;

    /**
     * 注册渠道
     */
    private String source;

    /**
     * 最近一次登录时间
     */
    private Date lastlogintime;

    /**
     * 头像图片url
     */
    private String headimageurl;

    /**
     * 是否已删除
     */
    private Boolean isdelete;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 最后更新时间
     */
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
     * 获取用户昵称
     *
     * @return userName - 用户昵称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户昵称
     *
     * @param username 用户昵称
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取绑定邮箱
     *
     * @return email - 绑定邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置绑定邮箱
     *
     * @param email 绑定邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取性别(0-默认1-男 2-女)
     *
     * @return gender - 性别(0-默认1-男 2-女)
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * 设置性别(0-默认1-男 2-女)
     *
     * @param gender 性别(0-默认1-男 2-女)
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    /**
     * 获取生日
     *
     * @return birthDate - 生日
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * 设置生日
     *
     * @param birthdate 生日
     */
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * 获取QQ标示码
     *
     * @return qqCode - QQ标示码
     */
    public String getQqcode() {
        return qqcode;
    }

    /**
     * 设置QQ标示码
     *
     * @param qqcode QQ标示码
     */
    public void setQqcode(String qqcode) {
        this.qqcode = qqcode;
    }

    /**
     * 获取微信标示码
     *
     * @return wechatCode - 微信标示码
     */
    public String getWechatcode() {
        return wechatcode;
    }

    /**
     * 设置微信标示码
     *
     * @param wechatcode 微信标示码
     */
    public void setWechatcode(String wechatcode) {
        this.wechatcode = wechatcode;
    }

    /**
     * 获取会员有效期开始时间
     *
     * @return memberStartTime - 会员有效期开始时间
     */
    public Date getMemberstarttime() {
        return memberstarttime;
    }

    /**
     * 设置会员有效期开始时间
     *
     * @param memberstarttime 会员有效期开始时间
     */
    public void setMemberstarttime(Date memberstarttime) {
        this.memberstarttime = memberstarttime;
    }

    /**
     * 获取会员有效期结束时间
     *
     * @return memberEndTime - 会员有效期结束时间
     */
    public Date getMemberendtime() {
        return memberendtime;
    }

    /**
     * 设置会员有效期结束时间
     *
     * @param memberendtime 会员有效期结束时间
     */
    public void setMemberendtime(Date memberendtime) {
        this.memberendtime = memberendtime;
    }

    /**
     * 获取注册渠道
     *
     * @return source - 注册渠道
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置注册渠道
     *
     * @param source 注册渠道
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取最近一次登录时间
     *
     * @return lastLoginTime - 最近一次登录时间
     */
    public Date getLastlogintime() {
        return lastlogintime;
    }

    /**
     * 设置最近一次登录时间
     *
     * @param lastlogintime 最近一次登录时间
     */
    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    /**
     * 获取头像图片url
     *
     * @return headImageUrl - 头像图片url
     */
    public String getHeadimageurl() {
        return headimageurl;
    }

    /**
     * 设置头像图片url
     *
     * @param headimageurl 头像图片url
     */
    public void setHeadimageurl(String headimageurl) {
        this.headimageurl = headimageurl;
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
