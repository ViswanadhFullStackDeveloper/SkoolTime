package com.demo.skooltime.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name= "Teacher")
@Data
public class TeacherEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long tId;
	private String tName;
	private String tEmail;
	private long tMobile;
	private String tPassword;
	private double tSalary;
	private boolean availability;
	private Date tJoiningDate;
	
	private int clsId;
	private int subId;
	private int asId;
}
