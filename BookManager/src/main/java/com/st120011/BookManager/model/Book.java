package com.st120011.BookManager.model;

/* created on 04.04.19
 * author Bugsbunny24
 * Class Book describe the attribute of books */

public class Book {
	private int id;
	
	private String name;
	
	private String author;
	
	private String price;
	
	private int status;
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getAuthor(){
		return author;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getId(){
		return id;
	}

}
