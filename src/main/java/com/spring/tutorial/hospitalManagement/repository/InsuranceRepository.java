package com.spring.tutorial.hospitalManagement.repository;

import com.spring.tutorial.hospitalManagement.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}