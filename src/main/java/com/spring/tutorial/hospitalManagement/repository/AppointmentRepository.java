package com.spring.tutorial.hospitalManagement.repository;

import com.spring.tutorial.hospitalManagement.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}