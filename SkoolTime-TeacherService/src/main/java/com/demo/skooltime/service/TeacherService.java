package com.demo.skooltime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.skooltime.entity.TeacherEntity;
import com.demo.skooltime.repository.TeacherRepository;

@Service
public class TeacherService {
	@Autowired
	private TeacherRepository repo;

	public List<TeacherEntity> getAllTeacherDetails() {
		return repo.findAll();
	}

	public TeacherEntity addTeacher(TeacherEntity entity) {
		TeacherEntity save = null;
		if (entity != null) {
			save = repo.save(entity);
			return save;
		}
		return save;
	}

	public TeacherEntity updateTeacher(TeacherEntity entity) {
		TeacherEntity save = null;
		TeacherEntity findByTID = repo.findBytId(entity.getTId());
		if (findByTID.getTId() != null) {
			save = repo.save(entity);
			return save;
		}
		return save;
	}

	public List<TeacherEntity> viewAllTeachers() {
		return repo.findAll();
	}

	public TeacherEntity viewTeacher(long tId) {
		return repo.findBytId(tId);
	}

	public String deleteTeacher(long tId) {
		TeacherEntity findByTID = repo.findBytId(tId);
		if (Long.compare(findByTID.getTId(), tId) == 0) {
			repo.deleteById(findByTID.getTId());
			return "Teacher deleted successfully !!";
		}

		return "Teacher isn't deleted, Try Again!!";
	}
}
