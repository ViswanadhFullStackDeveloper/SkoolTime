package com.demo.skooltime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.skooltime.entity.TeacherEntity;
import com.demo.skooltime.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	@Autowired
	private TeacherService service;
	
	@PostMapping("/addTeacher")
	public TeacherEntity addTeacher(@RequestBody TeacherEntity teacher) {
		return service.addTeacher(teacher);
	}
	@PutMapping("/updateTeacher")
	public TeacherEntity updateTeacher(@RequestBody TeacherEntity teacher) {
		return service.updateTeacher(teacher);
	}
	@DeleteMapping("/deleteTeacher/{tid}")
	public String deleteTeacher(@PathVariable long tid) {
		return service.deleteTeacher(tid);
	}
	@GetMapping("viewTeacher/{tid}")
	public TeacherEntity viewTeacher(@PathVariable long tid) {
		return service.viewTeacher(tid);
	}
	@GetMapping("viewAllTeachers")
	public List<TeacherEntity> viewAllTeachers(){
		return service.viewAllTeachers();
	}
}
