/**
 * 
 */
package com.zlearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zlearn.helper.LoginHelper;
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
	@Autowired
	LoginHelper loginHelper;
	

/******************************************************************************/
/*homePage() is specially defined to map home page or welcome page */
/*homePage() starting here*/
	/*@GetMapping("/")
	public String homePage() {
		return  "home";
	}*/
/*homePage() ends here*/	
	
/********************************************************************************/	
	
/*showAdmin() method is to get all admin user with complete attributes */
	@GetMapping(value="/getAllAdmin", headers="Accept=application/json")
	public List<AdminModel> showAdmin() {
		List<AdminModel> tasks=adminService.allUser();
		return tasks;
	}
	
/***********************************************************************************/	

	/*GET Method is given here for just testing over Rest Services. it will get changed with PPOST method once view resolver will get added  */
	@GetMapping("/adminlogin")
	public String LoginController(ModelMap model ,@RequestParam String email, @RequestParam String pass) {
		boolean status=loginHelper.loginAuthentication(email,pass);
		if(status==false) {
			model.put("errorMessage", "Invalid Credentials");
            return "login"; 
		}else {
			model.put("name", email);
	        model.put("password", pass);

	        return "admindashboard.jsp";
		}
	}
	

/***********************************************************************************/
	@GetMapping("/campuslogin")
	public String campusLoginController() {
		
	/*	Campus login logic will go here*/
		
		return "campusdashboard.jsp";
		
	}
	
	
/*************************************************************************************/
	@GetMapping("/trainerlogin")
	public String trainerLogin() {
		
		/*Trainer login logic will go here*/
		
		return "trainerdashboard.jsp";
	}
	
/*************************************************************************************/
	public String studentLogin() {
		
		/*Student login logic will go here*/
		
		return "studentdashboard.jsp";
	}

	
/*************************************************************************************/
}
