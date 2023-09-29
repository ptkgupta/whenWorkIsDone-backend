package com.example.employeeScheduler.Crud.Impl;

import com.example.employeeScheduler.Crud.AttendanceCrudService;
import com.example.employeeScheduler.Repositories.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendanceCrudServiceImpl implements AttendanceCrudService {
	@Autowired private AttendanceRepository repo;
}