package org.demo.cn.serivce;

import org.demo.cn.mapper.CityNoticeMapper;
import org.demo.cn.model.CityNotice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityNoticeServiceImpl implements CityNoticeService {	
	@Autowired
	private CityNoticeMapper cityNoticeMapper; 
	
	public CityNotice getCityNoticeByCityId(String city_id) {
		return cityNoticeMapper.getCityNoticeByCityId(city_id);
	}
}
