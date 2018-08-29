package org.rest.services.restTest.books.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.rest.services.restTest.books.model.ErrorMessage;

@Provider
public class DataAccesExceptionMapper implements ExceptionMapper<DataAccessException>{

	@Override
	public Response toResponse(DataAccessException accessException) {
		ErrorMessage errorMessage=new ErrorMessage(404, accessException.getMessage(), "https://www.selenagomez.com/");
		return Response.status(Status.NOT_FOUND).entity(errorMessage).build();
	}

}
