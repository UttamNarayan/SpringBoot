

package com.example.demo.Pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name="productview")
public class Product {
	@Id
	Integer id;
	String product_name;
	String product_details;
	Integer product_price;
	
	Date created_on;

	public Integer getId() {
		return id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public String getProduct_details() {
		return product_details;
	}

	public Integer getProduct_price() {
		return product_price;
	}

	public Date getCreated_on() {
		return created_on;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public void setProduct_details(String product_details) {
		this.product_details = product_details;
	}

	public void setProduct_price(Integer product_price) {
		this.product_price = product_price;
	}

	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	
}

