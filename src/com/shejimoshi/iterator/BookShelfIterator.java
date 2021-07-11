package com.shejimoshi.iterator;

import java.util.Iterator;

/*
 * @author zc
 * @date 2018/7/1 15:44
 * @param
 * @return
 * @description 遍历书架的类
 */
public class BookShelfIterator implements Iterator {

	private BookShelf bookShelf;
	private int index = 0;

	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
	}

	@Override
	public boolean hasNext() {
		if (index >= bookShelf.getLength()) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
