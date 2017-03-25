package com.bookshop.service.impl;

import java.util.List;

import com.bookshop.dao.BookDao;
import com.bookshop.entity.Book;
import com.bookshop.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "bookService")
@Transactional
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDao bookDao;
	

	/*public void addBook(Book book) {
		this.bookDao.addBook(book);
	}
	
	public void deleteBook(Book book) {
		this.bookDao.deleteBook(book);
	}
	
	public void updateBook(Book book) {
		this.bookDao.updateBook(book);
	}
	
	public List<Book> searchBookByName(String bookname) {
		return this.bookDao.searchBookByName(bookname);
	}*/
	@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
	public Book find(int book_id){
		return bookDao.find(book_id);
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
	public List<Book> showBooks(String type) {
		return bookDao.showBooks(type);
	}



}
