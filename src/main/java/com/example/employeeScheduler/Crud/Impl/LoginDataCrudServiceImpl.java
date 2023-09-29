package com.example.employeeScheduler.Crud.Impl;

import com.example.employeeScheduler.Crud.LoginDataCrudService;
import com.example.employeeScheduler.Repositories.LoginDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginDataCrudServiceImpl implements LoginDataCrudService {
	@Autowired private LoginDataRepository repo;
}