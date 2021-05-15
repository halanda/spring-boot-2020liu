package org.demo.cn.serivce;

import org.demo.cn.mapper.CityMapper;
import org.demo.cn.pojo.CityPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityMapper cityMapper;
	
	@Override
	@Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED)
	public Integer insertCity(CityPojo cityPojo) {
		
		Integer num = cityMapper.insertCity(cityPojo);
		
		return num;
	}
}