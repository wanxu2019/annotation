package cn.edu.xjtu.cad.hehe.annotation.controller;

import cn.edu.xjtu.cad.hehe.annotation.annotation.CurUser;
import cn.edu.xjtu.cad.hehe.annotation.model.DataSet;
import cn.edu.xjtu.cad.hehe.annotation.model.User;
import cn.edu.xjtu.cad.hehe.annotation.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/0.1/dataSet")
public class DataControllerAPI {
    @Autowired
    DataService dataService;

    @RequestMapping(value = "",method = RequestMethod.POST)
    public boolean addDataSet(@CurUser User user, DataSet dataSet) {
        dataSet.setDataSetUsername(user.getUsername());
        dataService.addDataSet(dataSet);
        return true;
    }

    @RequestMapping(value = "",method = RequestMethod.PUT)
    public boolean updateDataSet(@CurUser User user,DataSet dataSet){
        dataService.updateDataSet(dataSet,user);
        return true;
    }
    @RequestMapping(value = "/data",method = RequestMethod.POST)
    public boolean uploadData(@CurUser User user, @RequestParam("file") MultipartFile[] files, long dataSetID) {
        //判断文件是否为空
        if(files.length==0)
            return false;
        dataService.addData(files,dataSetID,user);
        return true;
    }
}
