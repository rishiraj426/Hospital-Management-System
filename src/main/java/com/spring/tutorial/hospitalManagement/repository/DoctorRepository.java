package com.spring.tutorial.hospitalManagement.repository;

import com.spring.tutorial.hospitalManagement.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}