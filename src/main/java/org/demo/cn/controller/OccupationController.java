package org.demo.cn.controller;

import org.demo.cn.mapper.OccupationMapper;
import org.demo.cn.model.Occupation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OccupationController {
	
	@Autowired
	private OccupationMapper occupationMapper;

	@GetMapping("/occupation/getfirst")
	public Occupation getFirstOccupation() {
		
		Occupation occupation = occupationMapper.getFirstOccupation();
		return occupation;
		
	}
	
}
