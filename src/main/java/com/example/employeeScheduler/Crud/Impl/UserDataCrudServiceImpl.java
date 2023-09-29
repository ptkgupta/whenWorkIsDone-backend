package com.example.employeeScheduler.Crud.Impl;

import com.example.employeeScheduler.Crud.UserDataCrudService;
import com.example.employeeScheduler.Repositories.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDataCrudServiceImpl implements UserDataCrudService {
	@Autowired private UserDataRepository repo;
}