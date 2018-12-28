package cn.edu.xjtu.cad.hehe.annotation.model;

public enum DataSetType {
    text("文本"),image("图像"),video("视频");
    private final String name;
    DataSetType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
