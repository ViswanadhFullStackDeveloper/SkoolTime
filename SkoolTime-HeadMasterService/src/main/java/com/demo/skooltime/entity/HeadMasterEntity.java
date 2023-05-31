package com.demo.skooltime.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "HeadMaster")
@Data
public class HeadMasterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hId;
	private String hName;
	private String hEmail;
	private long hMobile;
	private String hPassword;
	
	private long tNo;
	private long sno;
}
