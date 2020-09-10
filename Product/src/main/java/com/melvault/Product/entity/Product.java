package com.melvault.Product.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.http.HttpStatus;

@Entity
@Table(name="Production_TBL")
public class Product {

 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 private int id;
 private String name;
 private float price;
	
	
	public Product(int id, String name, float price) {

	this.id = id;
	this.name = name;
	this.price = price;
}





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





public float getPrice() {
	return price;
}





public void setPrice(float price) {
	this.price = price;
}





  public Product() {
		// TODO Auto-generated constructor stub
	}

}
