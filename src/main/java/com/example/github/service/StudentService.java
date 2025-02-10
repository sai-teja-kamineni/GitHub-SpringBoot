package com.example.github.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.github.models.Student;
import com.example.github.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo sr;
	
	public Student add(Student s) {
		sr.save(s);
		return s;
	}
	public List<Student> getall(){
		return sr.findAll();
	}

}
