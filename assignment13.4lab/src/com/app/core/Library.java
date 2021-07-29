package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Library {
	
	//Book details : title(string),category(enum),price(double),publishDate,authorName(string),quantity(int)
	private String title;
	private Category ctype;
	private double price;
	private Date publishDate;
	private String authorName;
	private int quantity;
	
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}
	public Library(String title, Category ctype, double price, Date publishDate, String authorName, int quantity) {
		super();
		this.title = title;
		this.ctype = ctype;
		this.price = price;
		this.publishDate = publishDate;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Library [Title=" + title + ", Category=" + ctype + ", Price=" + price + ",PublishvDate=" + publishDate
				+ ", Author Name=" + authorName + ", Quantity=" + quantity + "]";
	}
	
	

	public Library(String title) {
		super();
		this.title = title;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public String getTitle() {
		return title;
	}
	//Unique ID : book title
	@Override
	public boolean equals(Object o) {
		if(o instanceof Library) {
			return title.equals(((Library) o).title);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return title.hashCode();
	}
	
}
