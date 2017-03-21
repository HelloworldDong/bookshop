package com.bookshop.service.impl;

import java.util.List;

import com.bookshop.entity.Book;
import com.bookshop.dao.BookDAO;
import com.bookshop.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "bookService")
@Transactional
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDAO bookDAO;
	

	/*public void addBook(Book book) {
		this.bookDAO.addBook(book);
	}
	
	public void deleteBook(Book book) {
		this.bookDAO.deleteBook(book);
	}
	
	public void updateBook(Book book) {
		this.bookDAO.updateBook(book);
	}
	
	public List<Book> searchBookByName(String bookname) {
		return this.bookDAO.searchBookByName(bookname);
	}*/


	@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
	public List<Book> listAllBooks() {
		return bookDAO.listAllBooks();
	}
}
