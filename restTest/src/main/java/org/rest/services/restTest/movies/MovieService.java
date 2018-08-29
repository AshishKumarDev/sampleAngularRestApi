package org.rest.services.restTest.movies;

public class MovieService {
	
	Movies[] movies= {new Movies("Good Will Hunting", "1970", "Gus Van Sut"),
			new Movies("Dark Knight", "2012", "Nolan"),
			new Movies("Wolf Children", "2014", "Hosada"),
	};
	
	public  Movies[] getAllMovies() {
		
		return movies;
	}

}
