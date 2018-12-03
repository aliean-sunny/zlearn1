/**
 * 
 */
package com.zlearn.controller;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zlearn.model.CampusModel;
import com.zlearn.services.CampusService;

/**
 * @author ZESTECH IT
 *
 */
@RestController
public class CampusDashboard {
	
	@Autowired
	CampusService campusService;
	
	
	@GetMapping(value="/getcampus", headers="Accept=application/json")
	public List<CampusModel> getCampus() {
	
			List<CampusModel> tasks=campusService.allCampus();
			return tasks;
	
		
	}
	
	@GetMapping(value="/savecampus")
	public void saveCampus(@RequestParam Map requestParams) {
		
		String campus_name=(String) requestParams.get("");
		String campus_email=(String) requestParams.get("");
		Long campus_contact_no=(Long) requestParams.get("");
		String campus_spoc=(String) requestParams.get("");
		Integer university_id=(Integer) requestParams.get("");
		String campus_code=(String) requestParams.get("");
		String campus_address=(String) requestParams.get("");
		Integer campus_status=(Integer) requestParams.get("");
		String added_by=(String) requestParams.get("");
		//Date created_at;
		//Date updated_at;
		
		//campusService.saveCampusModel(campusModel);
	}
	
}
