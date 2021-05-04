package org.demo.cn.serivce;

import org.demo.cn.mapper.WeatherResponseMapper;
import org.demo.cn.model.City;
import org.demo.cn.pojo.Data;
import org.demo.cn.pojo.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherResponseServiceImpl implements WeatherResponseService{
	@Autowired
	private WeatherResponseMapper weatherResponseMapper;
	
	@Override
	public Response getWeatherResponse(City city) {
		Response response = new Response();
		
		try {
			Data data = weatherResponseMapper.getWeatherResponse(city);
			if(data != null) {
				response.setDesc("OK");
				response.setStatus("200");
				response.setData(data);
			}
			else {
				response.setDesc("Data Not Found");
				response.setStatus("404");
			}
		} catch (Exception e) {
			// TODO -- replace with logger
			e.printStackTrace();
			response.setDesc("Interal Error");
			response.setStatus("500");
		}
		
		return response;
	}

}