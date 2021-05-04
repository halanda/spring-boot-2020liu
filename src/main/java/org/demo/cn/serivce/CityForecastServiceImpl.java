package org.demo.cn.serivce;

import org.demo.cn.mapper.CityForecastMapper;
import org.demo.cn.model.CityForecast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CityForecastServiceImpl implements CityForecastService {

	@Autowired
	private CityForecastMapper cityForecastMapper;
	
	@Override
	public CityForecast getForecastWithCityByCityId(String cid) {
		CityForecast cityForecast = cityForecastMapper.getForcastWithCityByCityId(cid);
		return cityForecast;
	}

}
