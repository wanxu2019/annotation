package cn.edu.xjtu.cad.hehe.annotation.dao;

import cn.edu.xjtu.cad.hehe.annotation.model.Data;
import cn.edu.xjtu.cad.hehe.annotation.model.DataSet;
import cn.edu.xjtu.cad.hehe.annotation.model.DataSetType;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataMapper {

    @Select("SELECT * FROM ${dataSetType}_data where dataSetID = #{dataSetID}")
    List<Data> getDataList(@Param("dataSetID") long dataSetID, @Param("dataSetType") DataSetType dataSetType);

    @Insert("INSERT INTO text_data  (dataSetID,originData,username) " +
            "VALUES " +
            "(#{dataSetID}, #{originData},#{username})")
    void addTextData(Data data);
}
