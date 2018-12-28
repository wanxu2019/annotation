package cn.edu.xjtu.cad.hehe.annotation.model;


public class TextData  extends Data {
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
