package org.demo.cn.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.demo.cn.model.Notice;

@Mapper
public interface CityNoticeTmpMapper {
	Integer insert(Notice notice);
	void updateFromTmpTable();
}
