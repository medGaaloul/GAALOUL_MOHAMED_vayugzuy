package com.test.SchoolManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.SchoolManagementSystem.model.Teacher;
import com.test.SchoolManagementSystem.service.interfaces.TeacherServiceInterf;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

	@Autowired
	private TeacherServiceInterf teacherService;

	@GetMapping
	public List<Teacher> getAllTeachers() {
		return teacherService.getAllTeachers();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Teacher> getTeacherById(@PathVariable Long id) {
		Teacher teacher = teacherService.getTeacherById(id);
		if (teacher != null) {
			return ResponseEntity.ok(teacher);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping
	public ResponseEntity<Teacher> createTeacher(@RequestBody Teacher teacher) {
		Teacher createdTeacher = teacherService.createTeacher(teacher);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdTeacher);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Teacher> updateTeacher(@PathVariable Long id, @RequestBody Teacher teacher) {
		Teacher updatedTeacher = teacherService.updateTeacher(id, teacher);
		if (updatedTeacher != null) {
			return ResponseEntity.ok(updatedTeacher);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteTeacher(@PathVariable Long id) {
		boolean deleted = teacherService.deleteTeacher(id);
		if (deleted) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
