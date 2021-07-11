package com.shejimoshi.iterator;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("test1"));
		bookShelf.appendBook(new Book("test2"));
		Iterator it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
		BookShelfList bookShelfList = new BookShelfList(4);
		bookShelfList.appendBook(new Book("1"));
		bookShelfList.appendBook(new Book("2"));
		bookShelfList.appendBook(new Book("3"));
		bookShelfList.appendBook(new Book("4"));
		Iterator it2 = bookShelfList.iterator();
		while (it2.hasNext()) {
			Book book2 = (Book)it2.next();
			System.out.println(book2.getName());
		}
	}
}
