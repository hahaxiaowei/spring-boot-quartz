package com.huntkey.rx.springbootquartzmanage.dao;

import com.huntkey.rx.springbootquartzmanage.entity.JobAndTrigger;

import java.util.List;

public interface JobAndTriggerMapper {
	public List<JobAndTrigger> getJobAndTriggerDetails();
}
