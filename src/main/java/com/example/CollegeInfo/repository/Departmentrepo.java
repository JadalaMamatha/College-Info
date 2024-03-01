package com.example.CollegeInfo.repository;

import com.example.CollegeInfo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Departmentrepo extends JpaRepository<Department,Integer> {
    List<Department> findByCollegeName(String collegeName);
}