package com.example.employeeScheduler.Crud.Impl;

import com.example.employeeScheduler.Crud.UserDataCrudService;
import com.example.employeeScheduler.Models.UserData;
import com.example.employeeScheduler.Repositories.UserDataRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDataCrudServiceImpl implements UserDataCrudService {
	@Autowired private UserDataRepository repo;

	@Override
	public UserData save(UserData user) {
		return repo.save(user);
	}
}