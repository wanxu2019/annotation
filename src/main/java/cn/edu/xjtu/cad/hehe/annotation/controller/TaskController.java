package cn.edu.xjtu.cad.hehe.annotation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/0.1/task")
public class TaskController {
    public boolean addTask(String taskName,String taskDesc){

        return true;
    }

}
