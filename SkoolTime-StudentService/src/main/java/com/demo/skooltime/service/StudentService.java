package com.demo.skooltime.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.skooltime.entity.StudentEntity;
import com.demo.skooltime.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repo;

	public StudentEntity addStudent(StudentEntity entity) {
		StudentEntity save = null;
		if (entity != null) {
			save = repo.save(entity);
			return save;
		}
		return save;
	}

	public StudentEntity updateStudent(StudentEntity entity) {
		StudentEntity save = null;
		StudentEntity findBySID = repo.findBysId(entity.getSId());
		if (findBySID != null) {
			save = repo.save(entity);
			return save;
		}
		return save;
	}

	public List<StudentEntity> viewAllStudents() {
		return repo.findAll();
	}

	public StudentEntity viewStudent(long sId) {
		return repo.findBysId(sId);
	}

	public String deleteStudent(long sid) {
		if (Long.compare(repo.findBysId(sid).getSId(), sid) == 0) {
			repo.deleteById(sid);
			return "Student deleted successfully !!..";
		}
		return "Student isn't deleted, Try Again!!..";
	}
}
