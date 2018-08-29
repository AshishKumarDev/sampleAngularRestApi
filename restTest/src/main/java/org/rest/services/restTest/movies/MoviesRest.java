package org.rest.services.restTest.movies;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("movies")
public class MoviesRest {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Movies[] getAllMovie() {
		System.out.println("movie list");
		MovieService movieService=new MovieService();
	return 	movieService.getAllMovies();
		
	}

}
