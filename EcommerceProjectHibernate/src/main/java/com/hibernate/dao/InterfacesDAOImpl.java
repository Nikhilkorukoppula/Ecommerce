package com.hibernate.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.hibernate.entities.Products;

public class InterfacesDAOImpl implements InterfacesDAO {

	public List<Products> getAllMobiles() {
		List<Products> list = new ArrayList<Products>();
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Nikhil","nikhil");
			PreparedStatement pstmt = con.prepareStatement("select * from products");
			ResultSet rs = pstmt.executeQuery();
			Products p = new Products();
			p.setProductName(rs.getString(2));
			p.setProductPrice(rs.getDouble(3));
			list.add(p);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return list;
	}

}
