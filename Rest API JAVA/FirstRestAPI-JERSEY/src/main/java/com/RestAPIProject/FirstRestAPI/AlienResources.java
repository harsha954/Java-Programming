package com.RestAPIProject.FirstRestAPI;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.*;

import org.apache.tomcat.util.http.parser.MediaType;
@path("aliens")
public class AlienResources {
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAlien() {
		System.out.println("Allien called...");
		Alien a1= new Alien();
		a1.setName("Harsha");
		a1.setPoints(80);
		return a1;
		
		Alien a2= new Alien();
		a1.setName("Tom");
		a1.setPoints(60);
		
		List<Aliens> aliens = Arrays.asList(a1,a2);
		return aliens;
	}
}
