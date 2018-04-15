package com.letgym.gymcourse.core.logging;

/**
 * @Description:
 * @Author: lptree
 * @Date: Created in 2018/4/15 15:45
 */
public class LogMessage {
    /// <summary>
    /// 构造方法
    /// </summary>
    private LogMessage() { }

    /// <summary>
    /// APPID
    /// </summary>
    private String appID;

    /// <summary>
    /// Title
    /// </summary>
    private String title ;

    /// <summary>
    /// Index
    /// </summary>
    private String index ;

    /// <summary>
    /// 组
    /// </summary>
    private String group;

    public String getAppID() {
        return appID;
    }

    public void setAppID(String appID) {
        this.appID = appID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getClientMessage() {
        return clientMessage;
    }

    public void setClientMessage(String clientMessage) {
        this.clientMessage = clientMessage;
    }

    public String getServerIP() {
        return serverIP;
    }

    public void setServerIP(String serverIP) {
        this.serverIP = serverIP;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    /// <summary>
    /// ClientMessage
    /// </summary>
    private String clientMessage;

    /// <summary>
    /// ServerIP
    /// </summary>
    private String serverIP ;

    /// <summary>
    /// 日志所在方法
    /// </summary>
    private String method ;
}
