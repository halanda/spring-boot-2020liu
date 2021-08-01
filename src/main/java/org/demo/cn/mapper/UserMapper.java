package org.demo.cn.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.demo.cn.model.User;


@Mapper
public interface UserMapper {

	Integer insert(User u);

	User get(String uname);

}
