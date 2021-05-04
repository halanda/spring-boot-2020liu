package org.demo.cn.controller;

import org.demo.cn.model.Occupation;
import org.demo.cn.serivce.OccupationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OccupationController {
	
    @Autowired
    private OccupationService occupationService;
    
	@GetMapping("/occupation/getfirst")
	public Occupation getFirstOccupation() {
	
		return occupationService.getFirstOccupation();
	}
	
}
