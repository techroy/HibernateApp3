package com.hibernateapp3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity
@Table(name = "Book")
@NamedQueries(value={
		
		@NamedQuery(name="selectBookQuery",query="from BookBean"),
		@NamedQuery(name="updatBookQuery",query="update BookBean set name=? where id=?"),
		
		
})
@NamedNativeQueries(value={
		@NamedNativeQuery(name="bookStoreProc",query="call GetBooks(?)",resultClass=BookBean.class)
})
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

	@Override
	public String toString() {
		return "BookBean [name=" + name + ", price=" + price + ", id=" + id + ", vercol=" + vercol + ", marketPrice="
				+ marketPrice + "]";
	}
	

}
