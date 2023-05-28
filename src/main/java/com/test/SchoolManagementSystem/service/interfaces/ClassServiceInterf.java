package com.test.SchoolManagementSystem.service.interfaces;

import java.util.List;

import com.test.SchoolManagementSystem.model.SchoolClass;

public interface ClassServiceInterf {
    List<SchoolClass> getAllClasses();
    SchoolClass getClassById(Long id);
    SchoolClass createClass(SchoolClass clas);
    SchoolClass updateClass(Long id, SchoolClass clas);
    boolean deleteClass(Long id);
}