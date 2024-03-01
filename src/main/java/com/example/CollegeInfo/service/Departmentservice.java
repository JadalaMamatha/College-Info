package com.example.CollegeInfo.service;

import com.example.CollegeInfo.model.Department;

import com.example.CollegeInfo.repository.Departmentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Departmentservice {
    @Autowired
    private Departmentrepo departmentrepo;
    /*@Autowired
    private Collegerepo collegerepo;
    public Department addDepartment(Department department) {
        return null;
    }*/

    @Autowired
    private Departmentrepo departmentRepository;


    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public List<Department> getDepartmentsByCollegeName(String collegeName) {
        return departmentRepository.findByCollegeName(collegeName);
    }
}