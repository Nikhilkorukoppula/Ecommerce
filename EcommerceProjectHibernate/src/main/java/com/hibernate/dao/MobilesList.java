package com.hibernate.dao;
import java.io.*; 
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.hibernate.entities.Products;

import java.util.List;  
@WebServlet("Products")
public class MobilesList extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
	    response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        
        InterfacesDAO i = new InterfacesDAOImpl();
        List<Products> list = i.getAllMobiles();
        for(Products pp:list) {
        	out.println(pp.getId()+" "+pp.getProductName()+" "+pp.getProductPrice());
        }
	}
	
}
