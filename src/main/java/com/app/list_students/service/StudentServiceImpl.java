package com.app.list_students.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.list_students.entities.Student;
import com.app.list_students.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll(); 
	}
	
	
	
}
