package com.model;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ProductsAvailablity
{
    @SuppressWarnings("unchecked")
	public static void main(String[] args)
    {
    	SessionFactory sessionFactory=Hbutil.getSesFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		Criteria criteria=session.createCriteria(Products.class);	
		List<Products>proList=criteria.list();
		for(Products pro:proList)
		  {
			System.out.println("ID="+pro.getId()+" "+pro.getName()+"  "+pro.getAvailable()+"  "+pro.getPrice());	
		  }
		proList=session.createCriteria(Products.class)
				.add(Restrictions.like("name","%e%"))
				.list();
		for(Products pro4:proList)
		 {
			System.out.println("Products having 'e' in name::"+pro4.getName());
		 }
		//Roll-back
		tx.commit();
		sessionFactory.close();
    }
}
