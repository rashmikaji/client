package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {

	@GetMapping("/set")
	public ResponseEntity<Student> get(){
		
		Student s = new Student();
		s.setId(123);
		s.setName("sahil");
		s.setCity("bhandara");
		
		return new ResponseEntity<Student>(s,HttpStatus.CREATED);
	}
}
