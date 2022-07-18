package com.springcore.beanLifeCycle;

public class Book {

	private String name;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting book name");
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting book price");
		this.price = price;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}
	
	public void init()
	{
		System.out.println("Indide init method");
	}
	public void destroy()
	{
		System.out.println("Indide destroy method");
	}

}
