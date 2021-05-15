package org.demo.cn.serivce;

import org.demo.cn.model.CityForecast;
import org.demo.cn.model.Forecast;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CityForecastServiceTest {

	@Autowired
	private CityForecastService cityForecastService;
	
	@Test
	public void getForcastWithCityByCityIdTest() {
		CityForecast cityForecast = cityForecastService.getForecastWithCityByCityId("101070101");
		System.out.println(cityForecast.getC_name());
		for(Forecast forecast : cityForecast.getForecastList()) {
			System.out.println(forecast.getId());
			System.out.println(forecast.getDate());
			System.out.println(forecast.getFengli());
			System.out.println(forecast.getFengxiang());
			System.out.println(forecast.getHigh());
			System.out.println(forecast.getLow());
			System.out.println(forecast.getType());
			System.out.println(forecast.getCid());
		}
	}
}