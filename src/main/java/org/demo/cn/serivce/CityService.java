package org.demo.cn.serivce;

import java.util.List;
import org.demo.cn.pojo.CityPojo;
import org.demo.cn.model.City;

public interface CityService {
	
    Integer insertCity(CityPojo cityPojo);
	
	Integer insertCityBatch();
	
	List<City> getAllCities();

}
