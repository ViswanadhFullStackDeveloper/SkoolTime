package com.demo.skooltime.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Subject")
@Data
public class SubjectEntity {
	@Id
	private int subId;
	private String subName;
}
