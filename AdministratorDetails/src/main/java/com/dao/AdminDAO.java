package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.AdminDetails;

@Repository
public interface AdminDAO {
	
	 public void addAdmin(AdminDetails admin);
	 public AdminDetails findAdmin(int id);
	
	 public boolean updateAdmin(AdminDetails admin);
	 public boolean deleteAdmin(AdminDetails admin);

}
