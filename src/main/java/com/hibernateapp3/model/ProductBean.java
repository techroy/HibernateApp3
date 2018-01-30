package com.hibernateapp3.model;

import java.io.Serializable;

public class ProductBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2883519749794052667L;

	private int id;

	private String name;

	private String price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductBean [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
