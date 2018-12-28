package cn.edu.xjtu.cad.hehe.annotation.dao;

import cn.edu.xjtu.cad.hehe.annotation.model.Anno;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnnoMapper {

    @Select("SELECT * from annotation where dataID = #{dataID}")
    List<Anno> getDataAnno(long dataID);
}
