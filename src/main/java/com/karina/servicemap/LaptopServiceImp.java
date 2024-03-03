package com.karina.servicemap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopServiceImp implements LaptopService{
	
	@Autowired
	LaptopRepository lrepo;
	
	public void addlaptop()
	{
		Laptop l=new Laptop();
		l.setLapname("ideapad slim 3");
		l.setLapbrand("Lenovo");
		l.setPrice(35000);
		
		lrepo.save(l);
	}
	
	

}
