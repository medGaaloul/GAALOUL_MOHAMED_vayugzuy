package com.test.SchoolManagementSystem.service.interfaces;

import java.util.List;

import com.test.SchoolManagementSystem.model.Student;

public interface StudentServiceInterf {
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student createStudent(Student student);
    Student updateStudent(Long id, Student student);
    boolean deleteStudent(Long id);
}

