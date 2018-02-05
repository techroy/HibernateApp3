package com.hibernateapp3.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class ProductBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2883519749794052667L;

	@EmbeddedId
	private ProductKeyBean productKeyBean;

	private String price;

	public ProductKeyBean getProductKeyBean() {
		return productKeyBean;
	}

	public void setProductKeyBean(ProductKeyBean productKeyBean) {
		this.productKeyBean = productKeyBean;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductBean [productKeyBean=" + productKeyBean + ", price=" + price + "]";
	}

	

}
