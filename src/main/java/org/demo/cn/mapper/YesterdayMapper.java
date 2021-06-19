package org.demo.cn.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.demo.cn.model.Yesterday;
import org.apache.ibatis.annotations.Param;
import org.demo.cn.model.CityForecast;


@Mapper
public interface YesterdayMapper {
	Integer insert(Yesterday yesterday);
}
