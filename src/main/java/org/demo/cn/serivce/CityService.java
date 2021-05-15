package org.demo.cn.serivce;

import org.demo.cn.pojo.CityPojo;

public interface CityService {
	
	Integer insertCity(CityPojo cityPojo);
	
	Integer insertCityBatch();
}
