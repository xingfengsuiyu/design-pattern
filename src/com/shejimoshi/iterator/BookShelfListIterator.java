package com.shejimoshi.iterator;

import java.util.Iterator;

/**
 * 集合对应的迭代器
 *
 * @author zc
 * @create 2018-07-01 16:40
 **/
public class BookShelfListIterator implements Iterator{

	private BookShelfList bookShelfList;
	private int index = 0;

	public BookShelfListIterator(BookShelfList bookShelfList) {
		this.bookShelfList  = bookShelfList;
	}

	@Override
	public boolean hasNext() {
		if (index < bookShelfList.getLength()) {
			return  true;
		}
		return false;
	}

	@Override
	public Object next() {
		Book book = bookShelfList.getBookAt(index);
		index++;
		return book;
	}
}
