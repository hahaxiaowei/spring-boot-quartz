package com.huntkey.rx.springbootquartzmanage.service;

import com.github.pagehelper.PageInfo;
import com.huntkey.rx.springbootquartzmanage.entity.JobAndTrigger;

/**
 * Created by sunwei on 2018-02-02 Time:14:33:47
 */
public interface IJobAndTriggerService {
    public PageInfo<JobAndTrigger> getJobAndTriggerDetails(int pageNum, int pageSize);
}
