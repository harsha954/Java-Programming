package com.RestAPIProject.FirstRestAPI;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Alien {
	private String Name;
	private int points;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
}
 