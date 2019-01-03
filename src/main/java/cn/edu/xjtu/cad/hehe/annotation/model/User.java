package cn.edu.xjtu.cad.hehe.annotation.model;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

@Table(name="user")
public class User {

    @Column(name = "username", type = MySqlTypeConstant.VARCHAR, isKey = true)
    String username;
    @Column(name = "password", type = MySqlTypeConstant.VARCHAR)
    String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
