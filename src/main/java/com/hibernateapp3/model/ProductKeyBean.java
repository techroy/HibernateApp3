package com.hibernateapp3.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProductKeyBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8972236895855254184L;

	@Column(name="pid")
	private int id;

	@Column(name="pname")
	private String name;

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

	@Override
	public String toString() {
		return "ProductKeyBean [id=" + id + ", name=" + name + "]";
	}
	
	

}
