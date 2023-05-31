package com.demo.skooltime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.skooltime.entity.HeadMasterEntity;
import com.demo.skooltime.repository.HeadMasterRepository;

@Service
public class HeadMasterService {
	@Autowired
	private HeadMasterRepository repo;
	
	public List<HeadMasterEntity> viewAllHeadMasterDetails(){
		return repo.findAll();
	}

}
