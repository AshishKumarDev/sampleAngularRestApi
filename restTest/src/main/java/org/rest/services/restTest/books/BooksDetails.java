package org.rest.services.restTest.books;

import java.util.List;

import javax.print.attribute.standard.Media;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.rest.services.restTest.books.exceptions.DataAccesExceptionMapper;
import org.rest.services.restTest.books.exceptions.DataAccessException;

@Path("books")
public class BooksDetails {
	
	BookServices services=new BookServices();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	
	public List<Books> getBookDetails() {
		
		List<Books> books=services.getAllBooks();
		return books;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("{word}")
	public String word(@PathParam("word") String word) {
		if(word.equals("one")) {
		throw new DataAccessException("Exception check");
		}
		return word;
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/add")
	public Books addBook(Books book){
		
		return services.addBook(book);
		
	}

}
