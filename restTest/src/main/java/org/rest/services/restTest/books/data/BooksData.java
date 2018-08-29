package org.rest.services.restTest.books.data;

import java.util.HashMap;
import java.util.Map;

import org.rest.services.restTest.books.Books;

public class BooksData {
	
	private static Map<Integer, Books> books=new HashMap<>();
	
	public static Map<Integer,Books> getBooks(){
		return books;
	}

}
