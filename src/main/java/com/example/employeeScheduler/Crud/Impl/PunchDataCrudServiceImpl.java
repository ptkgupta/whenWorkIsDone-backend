package com.example.employeeScheduler.Crud.Impl;

import com.example.employeeScheduler.Crud.PunchDataCrudService;
import com.example.employeeScheduler.Repositories.PunchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PunchDataCrudServiceImpl implements PunchDataCrudService {
	@Autowired PunchRepository repo;
}