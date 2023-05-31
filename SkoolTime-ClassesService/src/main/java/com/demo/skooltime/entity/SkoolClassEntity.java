package com.demo.skooltime.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Class")
@Data
public class SkoolClassEntity {
	@Id
	private long clsId;
	private String clsName;
}
