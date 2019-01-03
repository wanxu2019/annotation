package cn.edu.xjtu.cad.hehe.annotation.model;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

import java.util.Date;

/**
 * 标注
 */
@Table(name="anno")
public class Anno {
    /**
     * 标注结果ID
     */
    @Column(name = "anno_id",isKey =true,type= MySqlTypeConstant.BIGINT)
    long annoID;

    /**
     * 标注创建时间
     */
    @Column(name = "create_time",type = MySqlTypeConstant.DATETIME)
    Date createTime;

    /**
     * 标注修改时间
     */
    @Column(name = "edit_time",type = MySqlTypeConstant.DATETIME)
    Date editTime;

    /**
     * 标注对应的ID
     */
    @Column(name = "data_id",type= MySqlTypeConstant.BIGINT)
    long dataID;

    /**
     * 标注结果
     */
    @Column(name = "result", type = MySqlTypeConstant.TEXT)
    String result;

    @Column(name = "username", type = MySqlTypeConstant.VARCHAR)
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
