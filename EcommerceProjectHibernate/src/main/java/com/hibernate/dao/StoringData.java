package com.hibernate.dao;
import com.hibernate.entities.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;


public class StoringData {
        public static void main(String[] args) {
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		@SuppressWarnings("deprecation")
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		CategoryClass cc=new CategoryClass();
		cc.setCategoryName("mobiles");
		Products p=new Products();
		p.setProductName("realme 8");
		p.setProductPrice(18999.9);
		List<Products>list=new ArrayList<Products>();
		list.add(p);
		cc.setList(list);
		s.save(cc);
		t.commit();
		s.close();
		System.out.println("succesfully inserted");
	}

}
