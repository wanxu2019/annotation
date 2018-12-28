package cn.edu.xjtu.cad.hehe.annotation.dao;

import cn.edu.xjtu.cad.hehe.annotation.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    @Select("SELECT * FROM userInfo where username = #{username}")
    User getUserByUsername(String username);

    @Select("SELECT * FROM userInfo")
    List<User> getUserList();
}
