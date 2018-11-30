/**
 * 
 */
package com.zlearn.services;



import java.util.List;



import org.springframework.transaction.annotation.Transactional;

import com.zlearn.model.AdminModel;




/**
 * @author ZESTECH IT
 *
 */


@Transactional
public interface AdminService {
	
	
	

	public List<AdminModel> allUser();
}
