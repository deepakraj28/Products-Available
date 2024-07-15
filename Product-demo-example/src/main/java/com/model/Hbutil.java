package com.model;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Hbutil
{
	
	private static SessionFactory sf;
      
	public static SessionFactory buildFactory() {		
			try {
		
			Configuration cfg=new Configuration();
		
			cfg.configure("hibernate.cfg.xml");
			ServiceRegistry sr= new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();	
			SessionFactory sf=cfg.buildSessionFactory(sr);
			return sf;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new ExceptionInInitializerError(e);
		}
	}
	public static SessionFactory getSesFactory()
	{
		if(sf==null) 
			sf=buildFactory();
		return sf;
	}
}
