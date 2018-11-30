/**
 * 
 */
package com.zlearn.helper;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zlearn.model.AdminModel;
import com.zlearn.services.AdminServiceImpl;

/**
 * @author ZESTECH IT
 *
 */
@Service
public class LoginHelper {
	
	@Autowired
	AdminServiceImpl adminServiceImpl;
	
	List<String> userdetails=null;
	
	public boolean loginAuthentication(String usermail, String userpass) {

		boolean status=false;
		List<AdminModel> adminModels = (List<AdminModel>) adminServiceImpl.allUser();
		for (AdminModel adminModel : adminModels) {
			if (usermail.equalsIgnoreCase(adminModel.getEmail_id()) && userpass.equals(adminModel.getPass())) {
				status=true;
			}
		}
		return status;

	}

}
