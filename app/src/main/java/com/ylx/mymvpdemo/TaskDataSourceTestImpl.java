package com.ylx.mymvpdemo;

/**
 * Created by yanglixiang on 2017/2/9.
 */

public class TaskDataSourceTestImpl implements TaskDataSource {
    @Override
    public String getStringFromRemote() {
        return "Hello ";
    }

    @Override
    public String getStringFromCache() {
        return "MVP";
    }
}
