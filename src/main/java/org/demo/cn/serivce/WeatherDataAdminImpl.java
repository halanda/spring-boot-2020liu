package org.demo.cn.serivce;

import org.demo.cn.mapper.WeatherDataAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherDataAdminImpl implements WeatherDataAdmin {

	@Autowired
	private WeatherDataAdminMapper weatherDataAdminMapper;
	@Override
	public void cleanWeatherData() {
		
		weatherDataAdminMapper.cleanForecast();
		weatherDataAdminMapper.cleanNotice();
		weatherDataAdminMapper.cleanYesterday();

	}

	@Override
	public void cleanWeatherDataTmp() {
		weatherDataAdminMapper.cleanForecastTmp();
		weatherDataAdminMapper.cleanNoticeTmp();
		weatherDataAdminMapper.cleanYesterdayTmp();
	}
}

