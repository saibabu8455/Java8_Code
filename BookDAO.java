package com.java8.comparator.examples;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	public List<Book> getBooks() {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book(102, "J2EE", 590));
		books.add(new Book(101, "Core Java", 400));
		books.add(new Book(363, "Hibernate", 180));
		books.add(new Book(275, "Spring", 200));
		books.add(new Book(893, "WebService", 300));
		books.add(new Book(1001, "Saibabu", 590));
		return books;

	}
}
