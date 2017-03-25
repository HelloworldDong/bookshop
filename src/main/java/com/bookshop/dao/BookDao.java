package com.bookshop.dao;

import java.util.List;

import com.bookshop.entity.Book;
import org.springframework.stereotype.Repository;

@Repository(value="bookDao")
public interface BookDao {
	public void addBook(Book book);

	public void deleteBook(Book book);

	public void updateBook(Book book);

	public Book find(int book_id);

	public List<Book> showBooks(String type);
}
