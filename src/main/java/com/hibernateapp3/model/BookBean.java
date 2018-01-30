package com.hibernateapp3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity
@Table(name = "Book")
public class BookBean {

	private String name;

	private String price;

	private String id;

	
	private int vercol;

	
	private String marketPrice;

	@Column(name = "bname")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "bprice")
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Id
	@Column(name = "bid")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Version
	public int getVercol() {
		return vercol;
	}

	public void setVercol(int vercol) {
		this.vercol = vercol;
	}

	@Transient
	public String getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(String marketPrice) {
		this.marketPrice = marketPrice;
	}

}
