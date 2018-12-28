package cn.edu.xjtu.cad.hehe.annotation.model;

import java.util.Date;
import java.util.List;

public class Data {
    long dataID;
    Date createTime;
    Date editTime;

    String username;
    long dataSetID;

    List<Anno> annoList;
    public Data() {
    }

    public Data(String username, long dataSetID) {
        this.username = username;
        this.dataSetID = dataSetID;
    }

    public long getDataSetID() {
        return dataSetID;
    }

    public void setDataSetID(long dataSetID) {
        this.dataSetID = dataSetID;
    }

    public long getDataID() {
        return dataID;
    }

    public void setDataID(long dataID) {
        this.dataID = dataID;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Anno> getAnnoList() {
        return annoList;
    }

    public void setAnnoList(List<Anno> annoList) {
        this.annoList = annoList;
    }
}
