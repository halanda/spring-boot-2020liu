package org.demo.cn.serivce;

import org.demo.cn.model.Forecast;
import org.demo.cn.pojo.ForecastPojo;

import java.util.List;

public interface ForecastService {

	List<Forecast> getForecastByCityId(String cid);

	void insert(List<ForecastPojo> list, Integer cityId, Boolean isTempTable);
}

