package org.demo.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.demo.cn.model.City;
import org.demo.cn.pojo.CityPojo;

@Mapper
public interface CityMapper {
	
	Integer insertCity(CityPojo cityPojo);
	
	City getCityByCityId(@Param(value="cityId")String city_id);
	
	List<City> getAllCities();

}
