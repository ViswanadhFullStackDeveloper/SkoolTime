package com.demo.skooltime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.skooltime.entity.HeadMasterEntity;

@Repository
public interface HeadMasterRepository extends JpaRepository<HeadMasterEntity, Integer>{

}
