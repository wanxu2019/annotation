package cn.edu.xjtu.cad.hehe.annotation.model;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

import java.util.Date;
import java.util.List;


public class Data {
    @Column(name = "data_id",isKey = true,type= MySqlTypeConstant.BIGINT)
    long dataID;
    @Column(name="create_time",type=MySqlTypeConstant.DATETIME)
    Date createTime;
    @Column(name="edit_time",type=MySqlTypeConstant.DATETIME)
    Date editTime;

    @Column(name="username",type=MySqlTypeConstant.VARCHAR)
    String username;
    @Column(name = "data_set_id",type= MySqlTypeConstant.BIGINT)
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
