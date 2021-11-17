package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResources {
	@RequestMapping("alliens")
	public List<Allien> getAlliens() {
		List<Allien> alliens = new ArrayList<>();
		Allien a1 = new Allien();
		a1.setPoints(20);
		a1.setName("Suresh");
		Allien a2 = new Allien();
		a2.setPoints(40);
		a2.setName("Mahesh");
		alliens.add(a1);
		alliens.add(a2);
		
		return alliens;
	}
} 
