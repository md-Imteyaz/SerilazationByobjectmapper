package com.JacksonByObjectMapper.model;

public class Product {

	private String name;
	private String manufacturingdate;
	private String expirydate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturingdate() {
		return manufacturingdate;
	}

	public void setManufacturingdate(String manufacturingdate) {
		this.manufacturingdate = manufacturingdate;
	}

	public String getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}

	public Product(String name, String manufacturingdate, String expirydate) {
		super();
		this.name = name;
		this.manufacturingdate = manufacturingdate;
		this.expirydate = expirydate;
	}

	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", manufacturingdate=" + manufacturingdate + ", expirydate=" + expirydate
				+ "]";
	}

}
