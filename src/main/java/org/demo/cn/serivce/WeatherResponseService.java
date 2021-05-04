package org.demo.cn.serivce;

import org.demo.cn.model.City;
import org.demo.cn.pojo.Response;

public interface WeatherResponseService {

	Response getWeatherResponse(City city);
}
