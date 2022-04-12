package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.AdminDetails;

@Service
public class AdminService {
	
	@Autowired
	AdminDAO adminDAOImpl;

	public void add(AdminDetails admin) {
		adminDAOImpl.addAdmin(admin);
		
	}
	public AdminDetails find(int id) {
		return adminDAOImpl.findAdmin(id);
	}
	
	public boolean update(AdminDetails admin) {
		return adminDAOImpl.updateAdmin(admin);
	}
	public boolean delete(AdminDetails admin) {
		return adminDAOImpl.deleteAdmin(admin);
	}

}
