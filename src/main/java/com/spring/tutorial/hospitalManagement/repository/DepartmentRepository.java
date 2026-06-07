package com.spring.tutorial.hospitalManagement.repository;

import com.spring.tutorial.hospitalManagement.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}