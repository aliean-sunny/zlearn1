/**
 * 
 */
package com.zlearn.services;

import java.util.List;
import com.zlearn.model.CampusModel;

/**
 * @author ZESTECH IT
 *
 */
public interface CampusService {

	public List<CampusModel> allCampus();
	public void saveCampusModel(CampusModel campusModel);
}
