package org.demo.cn.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.demo.cn.model.Occupation;
@Mapper
public interface OccupationMapper {

	Occupation getFirstOccupation();
	
	List<Occupation> getAllOccupations();
	
	Occupation getOccupationByName(String name);
	List<Occupation> getOccupationByNamePrefix(String prefix);
	
    int updateOccupationByName(String name,String occp);
    
    int insertOccupation(String name,String occp);
    
    int deleteOccupation(Map<String,Object>map);
    
}
