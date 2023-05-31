package com.demo.skooltime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.skooltime.entity.AttendenceEntity;
import com.demo.skooltime.service.AttendenceTeacherService;

@RestController
@RequestMapping("/attendenceTeacher")
public class AttendenceTeacherController {

	@Autowired
	private AttendenceTeacherService service;
	
	@GetMapping("/teachers")
	public List<AttendenceEntity> getAllTeachersAttendence(){
		return service.getAllTeacherAttendence();
	}
	@GetMapping("/teacher/{id}")
	public AttendenceEntity getTeacherById(@PathVariable long id) {
		return service.getTeacherById(id);
	}
}
