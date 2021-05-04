package org.demo.cn.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.demo.cn.model.City;
import org.demo.cn.pojo.Data;

@Mapper
public interface WeatherResponseMapper {

	Data getWeatherResponse(City city);
}
