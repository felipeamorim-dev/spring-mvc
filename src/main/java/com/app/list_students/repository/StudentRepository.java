package com.app.list_students.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.list_students.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
