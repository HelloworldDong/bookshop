package com.bookshop.bean;

import com.bookshop.entity.Book;

import java.util.Vector;

/**
 * Created by dl on 2017/3/19.
 */
public class Cart {
    private Vector<Book> books;
    public  Cart(){
        books=new Vector<Book>();
    }
    public void add(Book book){
        books.add(book);
    }
    public Vector<Book> getBooks(){
        return this.books;
    }
}
