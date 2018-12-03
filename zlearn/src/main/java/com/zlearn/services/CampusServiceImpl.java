/**
 * 
 */
package com.zlearn.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zlearn.model.CampusModel;
import com.zlearn.repository.CampusRepo;

/**
 * @author ZESTECH IT
 *
 */

@Service
public class CampusServiceImpl implements CampusService{

	@Autowired
	CampusRepo campusRepo;
	
	@Override
	public List<CampusModel> allCampus() {
		return (List<CampusModel>) campusRepo.findAll();
	}

	@Override
	public void saveCampusModel(CampusModel campusModel) {
		// TODO Auto-generated method stub
		campusRepo.save(campusModel);
		
	}

}
