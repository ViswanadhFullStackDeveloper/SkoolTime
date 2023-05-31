package com.demo.skooltime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.skooltime.entity.AttendenceEntity;
@Repository
public interface AttendenceTeacherRepository extends JpaRepository<AttendenceEntity, Long> {
	
	AttendenceEntity findByatId(long id);
}
