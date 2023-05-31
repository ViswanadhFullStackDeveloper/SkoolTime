package com.demo.skooltime.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Student")
@Data
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long sId;
	private String sName;
	private String sEmail;
	private long sMobile;
	private String sPassword;
	private double sFee;
	private boolean sAvailability;
	private Date sJoiningDate;
	
	private int clsId;
	private int subId;
	private int asId;
}
