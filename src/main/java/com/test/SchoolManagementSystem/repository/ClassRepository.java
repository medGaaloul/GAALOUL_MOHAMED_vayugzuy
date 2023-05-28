package com.test.SchoolManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.SchoolManagementSystem.model.SchoolClass;

public interface ClassRepository extends JpaRepository<SchoolClass, Long> {

}
