package cn.edu.xjtu.cad.hehe.annotation.controller;

import cn.edu.xjtu.cad.hehe.annotation.model.User;
import cn.edu.xjtu.cad.hehe.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/login")
    public boolean userLogin(String username, String password, HttpServletRequest request){
        User user=userService.validateUser(username,password);
        if(user==null){
            return false;
        }else {
            request.getSession().setAttribute("user",user);
            return true;
        }
    }
    @RequestMapping("/logout")
    public boolean userLogout(HttpServletRequest request){
        request.getSession().removeAttribute("user");
        return true;
    }

}
