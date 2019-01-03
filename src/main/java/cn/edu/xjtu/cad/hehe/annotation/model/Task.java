package cn.edu.xjtu.cad.hehe.annotation.model;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

@Table(name="task")
public class Task {
    /**
     * 任务ID
     */
    @Column(name = "task_id",isKey = true,type= MySqlTypeConstant.BIGINT)
    long taskID;
    /**
     * 任务名称
     */
    @Column(name="task_name",type=MySqlTypeConstant.VARCHAR)
    String taskName;
    /**
     * 任务描述
     */
    @Column(name="task_desc",type=MySqlTypeConstant.TEXT)
    String taskDesc;

    /**
     * 任务分配的用户名
     */
    @Column(name="username",type=MySqlTypeConstant.VARCHAR)
    String username;

    /**
     * 任务进度
     */
    @Column(name="task_process",type=MySqlTypeConstant.DOUBLE)
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
