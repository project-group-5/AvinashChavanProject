package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.AdminDetails;


@Component

public class AdminDAOImpl implements AdminDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addAdmin(AdminDetails admin) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(admin);
		session.flush();
		session.getTransaction().commit();

	}

	@Override
	public AdminDetails findAdmin(int id) {
		Session session=sessionFactory.openSession();
		AdminDetails admin=session.find(AdminDetails.class, id);
		
		return  admin;
	}

	@Override
	public boolean updateAdmin(AdminDetails admin) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(admin);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	
	}

	@Override
	public boolean deleteAdmin(AdminDetails admin) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.delete(admin);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
		return true;
	}

}
