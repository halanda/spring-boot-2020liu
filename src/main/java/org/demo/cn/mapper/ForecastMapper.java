package org.demo.cn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.demo.cn.model.Forecast;

public interface ForecastMapper {
	List<Forecast> getForecastByCityId(@Param(value="cid")String cid);
}
