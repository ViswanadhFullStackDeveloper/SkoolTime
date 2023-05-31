package com.demo.skooltime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.skooltime.entity.SubjectEntity;
import com.demo.skooltime.repository.SubjectRepository;

@Service
public class SubjectService {
	@Autowired
	private SubjectRepository repo;
	
	public List<SubjectEntity> getAllSubjects(){
		return repo.findAll();
	}
	
	public SubjectEntity getSubject(int subId) {
		return repo.findBysubId(subId);
	}
}
