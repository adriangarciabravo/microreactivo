package com.everis;

import java.math.BigDecimal;

public class Product {

	public String name;
	public BigDecimal price;
	public Taxx tax;

	Product(String name, BigDecimal price, Taxx tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}
}
