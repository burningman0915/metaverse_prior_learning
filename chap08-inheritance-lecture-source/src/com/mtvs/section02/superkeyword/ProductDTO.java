package com.mtvs.section02.superkeyword;

import java.util.Date;

public class ProductDTO {
	
	/* 관리하려는 상품의 속성 */
	private String code;							// 상품코드
	private String brand;							// 제조사
	private String name;							// 상품명
	private int price;								// 가격
	private java.util.Date manufacturingDate;		// 제조일자
	
	public ProductDTO() {
	}
	public ProductDTO(String code, String brand, String name, int price, Date manufacturingDate) {
		this.code = code;
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public java.util.Date getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(java.util.Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	
	@Override
	public String toString() {
		return "ProductDTO [code=" + code + ", brand=" + brand + ", name=" + name + ", price=" + price
				+ ", manufacturingDate=" + manufacturingDate + "]";
	}
}
