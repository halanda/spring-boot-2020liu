package org.demo.cn.model;

import java.util.List;

public class CityForecast {
	
	String c_name;
	List<Forecast>forecastList;
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public List<Forecast> getForecastList() {
		return forecastList;
	}
	public void setForecastList(List<Forecast> forecastList) {
		this.forecastList = forecastList;
	}

}
