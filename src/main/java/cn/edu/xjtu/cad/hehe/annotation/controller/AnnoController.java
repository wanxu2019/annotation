package cn.edu.xjtu.cad.hehe.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/annotation")
public class AnnoController {

    @RequestMapping("/text/{id}")
    public String getArticles(Model model, @PathVariable String id) {
        return "article/list";
    }
}