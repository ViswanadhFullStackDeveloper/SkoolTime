package com.demo.skooltime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.skooltime.entity.SkoolClassEntity;
import com.demo.skooltime.service.SkoolClassService;

@RestController
@RequestMapping("/class")
public class SkoolController {
	@Autowired
	private SkoolClassService service;
	
	@GetMapping("/getAllClassess")
	public List<SkoolClassEntity> getAllSkoolClasses(){
		return service.getAllSkoolClasses();
	}
	@GetMapping("/getClass/{id}")
	public SkoolClassEntity getSkoolClass(@PathVariable long id) {
		return service.getSkoolClass(id);
	}
}
