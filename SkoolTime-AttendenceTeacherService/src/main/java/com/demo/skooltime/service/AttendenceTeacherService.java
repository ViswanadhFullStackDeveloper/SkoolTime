package com.demo.skooltime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.skooltime.entity.AttendenceEntity;
import com.demo.skooltime.repository.AttendenceTeacherRepository;

@Service
public class AttendenceTeacherService {
	@Autowired
	private AttendenceTeacherRepository repo;
	
	public List<AttendenceEntity> getAllTeacherAttendence() {
		return repo.findAll();
	}
	
	public AttendenceEntity getTeacherById(long tid) {
		return repo.findByatId(tid);
	}
	
}
