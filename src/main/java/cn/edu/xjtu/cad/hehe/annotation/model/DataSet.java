package cn.edu.xjtu.cad.hehe.annotation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataSet {
    long dataSetID;
    String dataSetName;
    String dataSetDesc;
    String dataSetUsername;
    Date createTime;
    Date editTime;
    long dataSetLength;
    DataSetType dataSetType;

    List<Data> dataList = new ArrayList<>();
    public DataSet() {
    }

    public DataSet(String dataSetName, String dataSetDesc, String dataSetUsername) {
        this.dataSetName = dataSetName;
        this.dataSetDesc = dataSetDesc;
        this.dataSetUsername = dataSetUsername;
    }

    public long getDataSetID() {
        return dataSetID;
    }

    public void setDataSetID(long dataSetID) {
        this.dataSetID = dataSetID;
    }

    public String getDataSetName() {
        return dataSetName;
    }

    public void setDataSetName(String dataSetName) {
        this.dataSetName = dataSetName;
    }

    public String getDataSetDesc() {
        return dataSetDesc;
    }

    public void setDataSetDesc(String dataSetDesc) {
        this.dataSetDesc = dataSetDesc;
    }

    public String getDataSetUsername() {
        return dataSetUsername;
    }

    public void setDataSetUsername(String dataSetUsername) {
        this.dataSetUsername = dataSetUsername;
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

    public long getDataSetLength() {
        return dataSetLength;
    }

    public void setDataSetLength(long dataSetLength) {
        this.dataSetLength = dataSetLength;
    }

    public List<Data> getDataList() {
        return dataList;
    }

    public void setDataList(List<Data> dataList) {
        this.dataList = dataList;
    }

    public DataSetType getDataSetType() {
        return dataSetType;
    }

    public void setDataSetType(DataSetType dataSetType) {
        this.dataSetType = dataSetType;
    }
}
