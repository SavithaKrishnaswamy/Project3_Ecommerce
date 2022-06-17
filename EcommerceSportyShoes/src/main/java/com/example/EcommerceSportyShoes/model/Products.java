package com.example.EcommerceSportyShoes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Products {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int productid;
	private String productname;
    private String productcategory;
    private int size;
    private double price;
    private String availability;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductcategory() {
		return productcategory;
	}
	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	@Override
	public String toString() {
		return "Products [productid=" + productid + ", productname=" + productname + ", productcategory="
				+ productcategory + ", size=" + size + ", price=" + price + ", availability=" + availability + "]";
	}
    
    
    
}
