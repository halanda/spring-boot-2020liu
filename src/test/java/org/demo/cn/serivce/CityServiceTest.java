package org.demo.cn.serivce;


import org.demo.cn.pojo.CityPojo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CityServiceTest {
	@Autowired
	private CityService cityService;
	
	@Test
	public void insertCityTest() {
		CityPojo cityPojo = new CityPojo();
		cityPojo.setName("重庆");
		cityPojo.setId("123213213221");
		Integer num = cityService.insertCity(cityPojo);
		Assertions.assertEquals(1, num);
	}
}
