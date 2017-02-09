package com.ylx.mymvpdemo;

/**
 * Created by yanglixiang on 2017/2/9.
 */

public class TaskManager {
    TaskDataSource dataSource;

    public TaskManager(TaskDataSource dataSource){
        this.dataSource = dataSource;
    }

    public String getShowContent(){
        return dataSource.getStringFromRemote() + dataSource.getStringFromCache();
    }
}
