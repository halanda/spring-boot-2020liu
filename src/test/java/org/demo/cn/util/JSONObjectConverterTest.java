package org.demo.cn.util;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.demo.cn.mapper.CityMapper;
import org.demo.cn.pojo.CityPojo;
import org.demo.cn.serivce.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.type.TypeReference;

@SpringBootTest
public class JSONObjectConverterTest {

	@Autowired
		private CityService cityService;
	@Test

	public void generateObjectFromJSONFileTest() {
		cityService.insertCityBatch();
	}
}
