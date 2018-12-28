package cn.edu.xjtu.cad.hehe.annotation.model;

import java.util.Date;

public class Task {
    /**
     * 任务ID
     */
    long taskID;
    /**
     * 任务名称
     */
    String taskName;
    /**
     * 任务描述
     */
    String taskDesc;

    /**
     * 任务分配的用户名
     */
    String username;

    /**
     * 任务进度
     */
    double taskProcess;

    public long getTaskID() {
        return taskID;
    }

    public void setTaskID(long taskID) {
        this.taskID = taskID;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getTaskProcess() {
        return taskProcess;
    }

    public void setTaskProcess(double taskProcess) {
        this.taskProcess = taskProcess;
    }
}
