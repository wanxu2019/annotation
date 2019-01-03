package cn.edu.xjtu.cad.hehe.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: Json Wan
 * Created at: 2019/1/3 21:12
 * Description:
 **/
@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping("/")
    public String index() {
        return "textAnno";
    }
}
