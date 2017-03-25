package com.bookshop.service;

import java.util.List;

import com.bookshop.entity.Book;
import com.bookshop.entity.User;

public interface BookService {
	/*public void deleteBook(Book book);

	public void updateBook(Book book);

	public List<Book> searchBookByName(String bookname);


	public void addBook(Book book);*/

	public List<Book> showBooks(String type);
	public Book find(int book_id);
}
