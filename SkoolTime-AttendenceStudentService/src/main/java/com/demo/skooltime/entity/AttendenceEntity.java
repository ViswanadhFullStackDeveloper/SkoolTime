package com.demo.skooltime.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "StudentAttendence")
@Data
public class AttendenceEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long asid;
	private Date asDate;
	private String asName;
	private boolean asStatus;
}
