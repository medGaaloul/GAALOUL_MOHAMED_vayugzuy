package com.test.SchoolManagementSystem.service.interfaces;

import java.util.List;

import com.test.SchoolManagementSystem.model.Teacher;

public interface TeacherServiceInterf {
    List<Teacher> getAllTeachers();
    Teacher getTeacherById(Long id);
    Teacher createTeacher(Teacher teacher);
    Teacher updateTeacher(Long id, Teacher teacher);
    boolean deleteTeacher(Long id);
}

