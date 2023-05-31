package com.demo.skooltime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.skooltime.entity.SkoolClassEntity;
import com.demo.skooltime.repository.SkoolClassRepository;

@Service
public class SkoolClassService {
	@Autowired
	private SkoolClassRepository repo;

	public List<SkoolClassEntity> getAllSkoolClasses() {
		return repo.findAll();
	}
	
	public SkoolClassEntity getSkoolClass(long id) {
		return repo.findByclsId(id);
	}
}
