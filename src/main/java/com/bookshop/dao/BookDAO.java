package com.bookshop.dao;

import java.util.List;

import com.bookshop.entity.Book;
import org.springframework.stereotype.Repository;

@Repository(value="bookDao")
public interface BookDAO {
	public void addBook(Book book);

	public void deleteBook(Book book);

	public void updateBook(Book book);

	public List<Book> searchBookByName(String bookname);

	public List<Book> listAllBooks();
}
