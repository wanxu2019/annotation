package cn.edu.xjtu.cad.hehe.annotation.model;

import java.util.Date;

/**
 * 标注
 */
public class Anno {
    /**
     * 标注结果ID
     */
    long annoID;

    /**
     * 标注创建时间
     */
    Date createTime;

    /**
     * 标注修改时间
     */
    Date editTime;

    /**
     * 标注对应的ID
     */
    long dataID;

    /**
     * 标注结果
     */
    String result;
    String username;

    public long getAnnoID() {
        return annoID;
    }

    public void setAnnoID(long annoID) {
        this.annoID = annoID;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public long getDataID() {
        return dataID;
    }

    public void setDataID(long dataID) {
        this.dataID = dataID;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
