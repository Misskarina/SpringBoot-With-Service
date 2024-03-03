package com.karina.servicemap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController 
{
	@Autowired
	LaptopService serv;
	
	@RequestMapping("/save")
	public String save() 
	{
		serv.addlaptop();
		return "Data Saved";
	}
}
