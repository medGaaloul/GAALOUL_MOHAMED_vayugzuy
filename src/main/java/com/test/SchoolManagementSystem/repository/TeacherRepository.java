package com.test.SchoolManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.SchoolManagementSystem.model.Teacher;


public interface TeacherRepository extends JpaRepository<Teacher, Long>{

}
