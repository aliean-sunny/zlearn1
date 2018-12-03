/**
 * 
 */
package com.zlearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ZESTECH IT
 *
 */

@Controller
public class MainPageController {

	@RequestMapping("/")
	public String defaultPage() {
		
		return "index";
	}
}
