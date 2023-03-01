package com.hibernate.entities;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="Category")
public class CategoryClass {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
private int cid;
private String categoryName;
@OneToMany(cascade = CascadeType.ALL)  
@JoinColumn(name="id")  
@OrderColumn(name="type")  
public List<Products>list;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public List<Products> getList() {
	return list;
}
public void setList(List<Products> list) {
	this.list = list;
}

}
