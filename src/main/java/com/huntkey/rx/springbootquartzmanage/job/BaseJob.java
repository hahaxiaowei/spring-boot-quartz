package com.huntkey.rx.springbootquartzmanage.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public interface BaseJob extends Job{
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException;
}

