package com.bookshop.bean;

/**
 * Created by dl on 2017/3/19.
 */
public class CartItem {
    private int book_id;
    private int number;

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBook_id() {
        return book_id;
    }

    public int getNumber() {
        return number;
    }
}
