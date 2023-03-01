package com.hibernate.entities;
import javax.persistence.*;

@Entity
@Table(name="Products")
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
private int id;
private String productName;
double productPrice;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getProductPrice() {
	return productPrice;
}
public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}

}
