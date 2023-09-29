package com.example.employeeScheduler.Repositories;

import com.example.employeeScheduler.Models.Punch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PunchRepository extends JpaRepository<Punch, Long> {
}