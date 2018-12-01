/**
 * 
 */
package com.zlearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.zlearn.model.CampusModel;
import com.zlearn.services.CampusService;

/**
 * @author ZESTECH IT
 *
 */

@RestController
public class DashboardController {
	
	
	
	@Autowired
	CampusService campusService;
	
	
	
	
	public String zlAdmin() {
		
		/*Logic will come here*/
		
		return "welocme";
	}
	
	
	/*public String hrAdmin() {
		
		Logic will come here
		
		return "welocme";
	}

	public String learningAdmin() {
	
		Logic will come here
	
		return "welocme";
	}

	public String ceoAdmin() {
		
		Logic will come here
		
		return "welocme";
	}*/
	
	public String StudentDashboard() {
		
		/*Logic will come here*/
		
		return "welocme";
	}

	
	
	@GetMapping(value="/getcampus", headers="Accept=application/json")
	public List<CampusModel> campusDashboard() {
	
			List<CampusModel> tasks=campusService.allCampus();
			return tasks;
	
		
	}
	

	public String trainerDashboard() {
	
		/*Logic will come here*/
	
		return "welocme";
	}

}
