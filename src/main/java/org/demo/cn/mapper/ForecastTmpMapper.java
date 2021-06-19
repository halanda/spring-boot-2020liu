package org.demo.cn.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.demo.cn.model.Forecast;

@Mapper
public interface ForecastTmpMapper {
	
	Integer insert(Forecast forecast);
	void updateFromTmpTable();
}
