package org.rest.services.restTest.characters;

import java.util.Calendar;

public class Characters {
	private String name;
	private String height;
	private String gender;
	private String dob;
	
	public Characters(String name,String height,String gender,String dob) {
		this.name=name;
		this.height=height;
		this.gender=gender;
		this.dob=dob;
	}
	
	public Characters() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	

}
