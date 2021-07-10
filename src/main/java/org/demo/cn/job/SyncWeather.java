package org.demo.cn.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.demo.cn.serivce.SyncWeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class SyncWeather extends QuartzJobBean {

	@Autowired
	private SyncWeatherData syncWeatherData;

	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		
		//syncWeatherData.synchronizeWeatherData();

	}

}
