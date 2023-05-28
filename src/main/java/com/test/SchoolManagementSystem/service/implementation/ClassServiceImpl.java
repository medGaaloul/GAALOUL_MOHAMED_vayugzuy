package com.test.SchoolManagementSystem.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.SchoolManagementSystem.model.SchoolClass;
import com.test.SchoolManagementSystem.repository.ClassRepository;
import com.test.SchoolManagementSystem.service.interfaces.ClassServiceInterf;

@Service
public class ClassServiceImpl implements ClassServiceInterf {
	@Autowired
    private ClassRepository classRepository;
	
	@Override
    public List<SchoolClass> getAllClasses() {
        return classRepository.findAll();
    }

    @Override
    public SchoolClass getClassById(Long id) {
        return classRepository.findById(id).orElse(null);
    }

	@Override
	public SchoolClass createClass(SchoolClass clas) {
		// TODO Auto-generated method stub
        return classRepository.save(clas);

	}

	@Override
	public SchoolClass updateClass(Long id, SchoolClass clas) {
		// TODO Auto-generated method stub
		SchoolClass existingSchoolClass = classRepository.findById(id).orElse(null);
        if (existingSchoolClass != null) {
            existingSchoolClass.setName(clas.getName());
            return classRepository.save(existingSchoolClass);
        }
        return null;
	}

	@Override
	public boolean deleteClass(Long id) {
		// TODO Auto-generated method stub
		 if (classRepository.existsById(id)) {
	            classRepository.deleteById(id);
	            return true;
	        }
	        return false;
	    }
	

	
}
