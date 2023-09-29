package com.example.employeeScheduler.Repositories;

import com.example.employeeScheduler.Models.LoginData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDataRepository extends JpaRepository<LoginData, Long> {
}