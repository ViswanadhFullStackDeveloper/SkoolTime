package com.demo.skooltime.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.skooltime.entity.AttendenceEntity;

public interface AttendenceStudentRepository extends JpaRepository<AttendenceEntity, Long> {
	AttendenceEntity findByasid(long asid);
}
