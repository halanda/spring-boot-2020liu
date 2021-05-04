package org.demo.cn.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.demo.cn.model.Yesterday;

@Mapper
public interface YesterdayMapper {
	Integer insert(Yesterday yesterday);
}
