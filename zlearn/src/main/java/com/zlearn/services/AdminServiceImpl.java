package com.zlearn.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zlearn.model.AdminModel;
import com.zlearn.repository.AdminRepo;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepo adminRepo;
	
	@Override
	public List<AdminModel> allUser() {
		// TODO Auto-generated method stub
		return (List<AdminModel>) adminRepo.findAll();
	}

}
