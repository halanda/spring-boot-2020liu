package org.demo.cn.controller;
import org.demo.cn.model.Occupation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {
@Autowired
private Occupation occupation;
	@GetMapping("/hello")
	public ModelAndView hello() {
	
		
		return new ModelAndView("/page/Hello.html");	
			
	}
	@GetMapping("/Occupation/get")
	public Occupation getOccupation() {
		//Occupation o1 = new Occupation();	
		
		System.out.println(occupation.toString());
		return occupation;
	}
}
