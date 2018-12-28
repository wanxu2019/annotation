package cn.edu.xjtu.cad.hehe.annotation.service;

import cn.edu.xjtu.cad.hehe.annotation.dao.UserMapper;
import cn.edu.xjtu.cad.hehe.annotation.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User validateUser(String username, String password){
        User user = userMapper.getUserByUsername(username);
        if(user==null||!user.getPassword().equals(password)){
            return null;
        }else {
            return user;
        }
    }
    public List<User> getUserList(){
        return userMapper.getUserList();
    }
}
