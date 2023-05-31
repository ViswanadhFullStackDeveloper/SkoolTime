package com.demo.skooltime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.skooltime.entity.AttendenceEntity;
import com.demo.skooltime.repository.AttendenceStudentRepository;

@Service
public class AttendenceStudentService {
	@Autowired
	private AttendenceStudentRepository repo;
	
	public List<AttendenceEntity> getAllStudentsAttendence(){
		return repo.findAll();
	}
	
	public AttendenceEntity getStudentAttendence(int id) {
		return repo.findByasid(id);
	}
}
