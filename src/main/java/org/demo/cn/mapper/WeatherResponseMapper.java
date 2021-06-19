package org.demo.cn.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.demo.cn.model.City;
import org.demo.cn.model.CityForecast;
import org.demo.cn.model.Yesterday;
import org.demo.cn.pojo.Data;

@Mapper
public interface WeatherResponseMapper {

	Data getWeatherResponse(City city);
}