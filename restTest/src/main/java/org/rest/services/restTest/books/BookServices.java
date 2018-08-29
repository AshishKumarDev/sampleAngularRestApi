package org.rest.services.restTest.books;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.rest.services.restTest.books.data.BooksData;

public class BookServices {
	private Map<Integer, Books> bookList = BooksData.getBooks();
	public BookServices() {
		bookList.put(1, new Books(1, "Gone In Sixty Secod", 400, 290));
		bookList.put(2, new Books(2, "The Girl With The Tattoo", 300, 200));
	}

	

	public Books addBook(Books book) {
		book.setId((bookList.size() + 1));
		bookList.put(book.getId(), book);
		return book;
	}

	public List<Books> getAllBooks() {

		return new ArrayList<>(bookList.values());

	}

}
