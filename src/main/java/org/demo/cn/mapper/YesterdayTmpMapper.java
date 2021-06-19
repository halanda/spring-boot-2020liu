package org.demo.cn.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.demo.cn.model.Yesterday;

@Mapper
public interface YesterdayTmpMapper {

	Integer insert(Yesterday yesterday);
	void updateFromTmpTable();
}