package org.demo.cn.serivce;

import java.util.List;

import org.demo.cn.mapper.ForecastMapper;
import org.demo.cn.model.Forecast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ForecastService {

	@Autowired
	private ForecastMapper forecastMapper;
	
	List<Forecast> getForecastByCityId(String cid){
		List<Forecast> forecastList = forecastMapper.getForecastByCityId(cid);
		return forecastList;
	}
}