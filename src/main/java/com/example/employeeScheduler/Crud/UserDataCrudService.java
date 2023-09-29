package com.example.employeeScheduler.Crud;

import com.example.employeeScheduler.Models.UserData;
import org.apache.catalina.User;

public interface UserDataCrudService {
	UserData save(UserData user);
}