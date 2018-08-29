package org.rest.services.restTest.movies;

public class Movies {
	private String title;
	private String year;
	private String director;
	
	public Movies() {
		// TODO Auto-generated constructor stub
	}
	
	public Movies(String title,String year,String director) {
		this.title=title;
		this.year=year;
		this.director=director;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	

}
