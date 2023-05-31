package com.demo.skooltime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.skooltime.entity.SubjectEntity;
@Repository
public interface SubjectRepository extends JpaRepository<SubjectEntity,Integer> {
	SubjectEntity findBysubId(int subId);
}
