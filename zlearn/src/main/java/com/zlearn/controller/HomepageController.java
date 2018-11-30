/**
 * 
 */
package com.zlearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.zlearn.model.AdminModel;
import com.zlearn.services.AdminService;


/**
 * @author ZESTECH IT
 *
 */

@RestController
public class HomepageController {

	@Autowired
	AdminService adminService;
	
	@GetMapping("/")
	public String homePage() {
		
		return  "home";
	}
	
	@GetMapping(value="/get", headers="Accept=application/json")
	public List<AdminModel> showAdmin() {
		List<AdminModel> tasks=adminService.allUser();
		return tasks;
	}
}
