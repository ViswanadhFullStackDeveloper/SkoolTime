package com.demo.skooltime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.skooltime.entity.SkoolClassEntity;

@Repository
public interface SkoolClassRepository extends JpaRepository<SkoolClassEntity, Long>{
	SkoolClassEntity findByclsId(long clsid);
}
