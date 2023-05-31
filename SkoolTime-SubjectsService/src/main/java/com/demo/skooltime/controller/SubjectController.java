package com.demo.skooltime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.skooltime.entity.SubjectEntity;
import com.demo.skooltime.service.SubjectService;

@RestController
@RequestMapping("/subject")
public class SubjectController {
	@Autowired
	private SubjectService service;
	
	@GetMapping("/getAllSubjects")
	public List<SubjectEntity> getAllSubjects(){
		return service.getAllSubjects();
	}
	@GetMapping("/getSubject/{subid}")
	public SubjectEntity getSubject(@PathVariable int subid) {
		return service.getSubject(subid);
	}
}
