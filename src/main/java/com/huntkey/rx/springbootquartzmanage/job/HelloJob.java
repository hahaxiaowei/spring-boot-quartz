package com.huntkey.rx.springbootquartzmanage.job;

import java.util.Date;  
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;   
import org.quartz.JobExecutionContext;  
import org.quartz.JobExecutionException;  
  
public class HelloJob implements BaseJob {  
  
    private static Logger _log = LoggerFactory.getLogger(HelloJob.class);  
     
    public HelloJob() {  
          
    }  
     @Override
    public void execute(JobExecutionContext context)  
        throws JobExecutionException {  
        _log.error("Hello Job执行时间: " + new Date());  
          
    }  
}  
