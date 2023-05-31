package com.demo.skooltime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.skooltime.entity.HeadMasterEntity;
import com.demo.skooltime.service.HeadMasterService;

@RestController
@RequestMapping("/headmaster")
public class HeadMasterController {
	@Autowired
	private HeadMasterService service;
	
	@GetMapping("/getAllHeadMasterDetails")
	public List<HeadMasterEntity> getAllHeadMasterDetails(){
		return service.viewAllHeadMasterDetails();
	}
}
