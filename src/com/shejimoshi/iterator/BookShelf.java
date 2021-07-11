package com.shejimoshi.iterator;

import java.util.Iterator;

/*
 * @author zc
 * @date 2018/7/1 15:44
 * @param
 * @return
 * @description 表示书架的类
 */
public class BookShelf implements Aggregate {

	private Book[] books;
	private int last = 0;

	public BookShelf(int i) {
		this.books = new Book[i];
	}

	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

	public Book getBookAt(int index) {
		return books[index];
	}

	public void appendBook(Book book) {
		this.books[last] = book;
		last++;
	}

	public int getLength() {
		return last;
	}
}
