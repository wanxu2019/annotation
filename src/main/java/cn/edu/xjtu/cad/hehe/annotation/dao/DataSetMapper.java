package cn.edu.xjtu.cad.hehe.annotation.dao;

import cn.edu.xjtu.cad.hehe.annotation.model.Data;
import cn.edu.xjtu.cad.hehe.annotation.model.DataSet;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DataSetMapper {


    @Select("SELECT * FROM dataSet ")
    List<DataSet> getDataSetList();

    @Select("SELECT * FROM dataSet WHERE dataSetID = #{dataSetID}")
    DataSet getDataSetByID(long dataSetID);

    @Insert("INSERT INTO dataSet " +
            "(dataSetName, dataSetDesc,dataSetLength,dataSetUsername,dataSetType) " +
            "VALUES " +
            "(#{dataSetName}, #{dataSetDesc},#{dataSetLength},#{dataSetUsername},#{dataSetType})")
    void addDataSet(DataSet dataSet);

    @Update("UPDATE dataSet SET dataSetName = #{dataSetName} , dataSetDesc = #{dataSetDesc} where dataSetID = #{dataSetID}")
    void updateDataSet(DataSet dataSet);
}
