/**
 * 
 */
package com.zlearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ZESTECH IT
 *
 */

@Controller
public class HomepageController {

	
	@GetMapping("/")
	public String homePage() {
		
		return "index";
	}
}
