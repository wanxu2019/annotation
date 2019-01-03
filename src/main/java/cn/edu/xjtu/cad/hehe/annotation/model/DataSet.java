package cn.edu.xjtu.cad.hehe.annotation.model;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Table(name="data_set")
public class DataSet {
    @Column(name = "data_set_id",isKey = true,type= MySqlTypeConstant.BIGINT)
    long dataSetID;
    @Column(name="data_set_name",type=MySqlTypeConstant.VARCHAR)
    String dataSetName;
    @Column(name="data_set_desc",type=MySqlTypeConstant.TEXT)
    String dataSetDesc;
    @Column(name="data_set_username",type=MySqlTypeConstant.VARCHAR)
    String dataSetUsername;
    @Column(name="create_time",type=MySqlTypeConstant.DATETIME)
    Date createTime;
    @Column(name="edit_time",type=MySqlTypeConstant.DATETIME)
    Date editTime;
    @Column(name = "data_set_length",type= MySqlTypeConstant.BIGINT)
    long dataSetLength;

    @Column(name = "data_set_type",type= MySqlTypeConstant.VARCHAR)
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
