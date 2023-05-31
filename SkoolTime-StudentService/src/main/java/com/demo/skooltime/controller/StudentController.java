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

import com.demo.skooltime.entity.StudentEntity;
import com.demo.skooltime.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService service;
	
	@GetMapping("/viewAllStudents")
	public List<StudentEntity> viewAllStudents(){
		return service.viewAllStudents();
	}
	@GetMapping("/viewStudent/{sid}")
	public StudentEntity viewStudent(@PathVariable long sid) {
		return service.viewStudent(sid);
	}
	@PutMapping("/updateStudent")
	public StudentEntity updateStudent(@RequestBody StudentEntity entity) {
		return service.updateStudent(entity);
	}
	@PostMapping("/addStudent")
	public StudentEntity addStudent(@RequestBody StudentEntity entity) {
		return service.addStudent(entity);
	}
	@DeleteMapping("/deleteStudent/{sid}")
	public String deleteStudent(@PathVariable long sid) {
		return service.deleteStudent(sid);
	}
}
