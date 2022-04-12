package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.AdminDetails;
@RestController
public class AdminController {
	@RequestMapping("/")
	public AdminDetails getAdmin() {
		return new AdminDetails();
	}

}
