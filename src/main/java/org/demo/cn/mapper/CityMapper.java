package org.demo.cn.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.demo.cn.pojo.CityPojo;
@Mapper
public interface CityMapper {
	Integer insertCity(CityPojo cityPojo);
}
