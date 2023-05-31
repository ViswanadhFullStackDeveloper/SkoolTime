package com.demo.skooltime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.skooltime.entity.AttendenceEntity;
import com.demo.skooltime.service.AttendenceStudentService;

@RestController
@RequestMapping("/studentAttendence")
public class AttendenceStudentController {
	@Autowired
	private AttendenceStudentService service;
	
	@GetMapping("/students")
	public List<AttendenceEntity> getAllStudentAttendence() {
		return service.getAllStudentsAttendence();
	}
	@GetMapping("/student/{said}")
	public AttendenceEntity getStudent(@PathVariable int said) {
		return service.getStudentAttendence(said);
	}
}
