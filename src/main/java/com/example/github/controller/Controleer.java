package com.example.github.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.github.models.Student;
import com.example.github.service.StudentService;

@RestController
public class Controleer {
	@Autowired
	StudentService ss;
	@PostMapping("/add")
	public Student add(@RequestBody Student s) {
		return ss.add(s);
		
	}
	@GetMapping("/all")
	public List<Student> all(){
		return ss.getall();
	}
	@GetMapping("/hi")
	public String hi() {
		return "hi";
	}

}
