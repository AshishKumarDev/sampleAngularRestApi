package org.rest.services.restTest.books.exceptions;

public class DataAccessException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6235546886952165651L;

	
	public DataAccessException(String message) {
		super(message);
	}

}
