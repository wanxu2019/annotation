package cn.edu.xjtu.cad.hehe.annotation.controller;


import cn.edu.xjtu.cad.hehe.annotation.annotation.CurUser;
import cn.edu.xjtu.cad.hehe.annotation.model.DataSet;
import cn.edu.xjtu.cad.hehe.annotation.model.DataSetType;
import cn.edu.xjtu.cad.hehe.annotation.model.User;
import cn.edu.xjtu.cad.hehe.annotation.service.DataService;
import cn.edu.xjtu.cad.hehe.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/dataSet")
public class DataController {
    @Autowired
    DataService dataService;

    @Autowired
    UserService userService;
    @RequestMapping("/")
    public String allDataSetList(Model model) {
        model.addAttribute("dataSetList",dataService.getDataSetList());
        model.addAttribute("dataSetTypeList", Arrays.stream(DataSetType.values()).collect(Collectors.toList()));
        return "dataSetList";
    }

    @RequestMapping("/{id}")
    public String viewDataSet(Model model, @PathVariable long id) {
        DataSet dataSet = dataService.getDataSetByID(id);
        long cnt = dataSet.getDataList().size();
        long hasAnnoCnt = dataSet.getDataList().stream().filter(data->data.getAnnoList()!=null&&data.getAnnoList().size()>0).count();
        long noAnnoCnt =  cnt-hasAnnoCnt;
        model.addAttribute("dataSet",dataSet);
        model.addAttribute("userList",userService.getUserList());
        model.addAttribute("cnt",cnt);
        model.addAttribute("hasAnnoCnt",hasAnnoCnt);
        model.addAttribute("noAnnoCnt",noAnnoCnt);
        return "dataSet";
    }

}
