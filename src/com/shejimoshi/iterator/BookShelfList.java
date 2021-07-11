package com.shejimoshi.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 通过list来保存书籍
 *
 * @author zc
 * @create 2018-07-01 16:32
 **/
public class BookShelfList implements  Aggregate{

	private List<Book> books;
	private int last = 0;

	public BookShelfList(int i) {
		this.books = new ArrayList<>(i);
	}

	@Override
	public Iterator iterator() {
		return new BookShelfListIterator(this);
	}

	public Book getBookAt(int index) {
		return books.get(index);
	}

	public void appendBook(Book book) {
		this.books.add(book);
		last++;
	}

	public int getLength() {
		return last;
	}


}
