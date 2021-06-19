package org.demo.cn.serivce;

import org.demo.cn.model.CityForecast;

public interface CityForecastService {

	CityForecast getForcastWithCityByCityId(String cid);
	

}
