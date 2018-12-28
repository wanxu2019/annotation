package cn.edu.xjtu.cad.hehe.annotation.service;

import cn.edu.xjtu.cad.hehe.annotation.dao.AnnoMapper;
import cn.edu.xjtu.cad.hehe.annotation.dao.DataMapper;
import cn.edu.xjtu.cad.hehe.annotation.dao.DataSetMapper;
import cn.edu.xjtu.cad.hehe.annotation.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Service
public class DataService {
    @Autowired
    DataSetMapper dataSetMapper;
    @Autowired
    DataMapper dataMapper;
    @Autowired
    AnnoMapper annoMapper;
    public List<DataSet> getDataSetList(){
        return dataSetMapper.getDataSetList();
    }

    public DataSet getDataSetByID(long dataSetID){
        DataSet dataSet =  dataSetMapper.getDataSetByID(dataSetID);
        List<Data> dataList = dataMapper.getDataList(dataSetID,dataSet.getDataSetType());
        for (Data data : dataList) {
            data.setAnnoList(annoMapper.getDataAnno(data.getDataID()));
        }
        dataSet.setDataList(dataList);
        return dataSet;
    }

    public void addDataSet(DataSet dataSet){
        dataSetMapper.addDataSet(dataSet);
    }

    public void updateDataSet(DataSet dataSet,User user) {
        DataSet dataSetOld = dataSetMapper.getDataSetByID(dataSet.getDataSetID());
        if(dataSet.getDataSetName()!=null){
            dataSetOld.setDataSetName(dataSet.getDataSetName());
        }
        if(dataSet.getDataSetDesc()!=null){
            dataSetOld.setDataSetDesc(dataSet.getDataSetDesc());
        }
        dataSetMapper.updateDataSet(dataSetOld);
    }

    public void addData(MultipartFile[] files, long dataSetID, User user){
        DataSet dataSet  =  dataSetMapper.getDataSetByID(dataSetID);
        try {
            switch (dataSet.getDataSetType()){
                case video:
                    break;
                case image:
                    break;
                case text:
                    addTextData(files,dataSet,user);
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addTextData(MultipartFile[] files ,DataSet dataSet,User user) throws IOException {
        for (MultipartFile file : files) {
            String textData = new String(file.getBytes(),"utf-8");
            System.out.println(textData);
            Data data = new TextData(user.getUsername(),dataSet.getDataSetID(),textData);
            dataMapper.addTextData(data);
        }
    }
}
