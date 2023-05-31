package com.demo.skooltime.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "AttendenceTeacher")
@Data
public class AttendenceEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long atId;
	private Date atDate;
	private String atName;
	private boolean status;
}
