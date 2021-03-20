package org.demo.cn.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.demo.cn.model.Occupation;
@Mapper
public interface OccupationMapper {

	Occupation getFirstOccupation();
	
}
