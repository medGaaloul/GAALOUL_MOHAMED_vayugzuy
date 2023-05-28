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

import com.test.SchoolManagementSystem.model.SchoolClass;
import com.test.SchoolManagementSystem.service.interfaces.ClassServiceInterf;

@RestController
@RequestMapping("/classes")
public class ClassController {

	@Autowired
	private ClassServiceInterf classService;

	@GetMapping
	public List<SchoolClass> getAllClasses() {
		return classService.getAllClasses();
	}

	@GetMapping("/{id}")
    public ResponseEntity<SchoolClass> getClassById(@PathVariable Long id) {
		SchoolClass clas = classService.getClassById(id);
        if (clas != null) {
            return ResponseEntity.ok(clas);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

	@PostMapping
    public ResponseEntity<SchoolClass> createClass(@RequestBody SchoolClass clas) {
		SchoolClass createdClass = classService.createClass(clas);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdClass);
    }

	@PutMapping("/{id}")
    public ResponseEntity<SchoolClass> updateClass(@PathVariable Long id, @RequestBody SchoolClass clas) {
		SchoolClass updatedClass = classService.updateClass(id, clas);
        if (updatedClass != null) {
            return ResponseEntity.ok(updatedClass);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteClass(@PathVariable Long id) {
		boolean deleted = classService.deleteClass(id);
		if (deleted) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
