package com.test.SchoolManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.SchoolManagementSystem.model.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
