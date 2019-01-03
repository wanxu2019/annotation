package cn.edu.xjtu.cad.hehe.annotation.model;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

@Table(name="text_data")
public class TextData  extends Data {

    @Column(name = "origin_data",type= MySqlTypeConstant.TEXT)
    String originData;


    public TextData(String username, long dataSetID,String originData) {
        super(username, dataSetID);
        this.originData = originData;
    }

    public String getOriginData() {
        return originData;
    }

    public void setOriginData(String originData) {
        this.originData = originData;
    }
}
