package com.example.Service;

import java.util.List;

import com.example.Entity.EmployeeEntity;

public interface EmployeeService {

	public EmployeeEntity saveEmployee(EmployeeEntity employee);

	public Iterable<EmployeeEntity> getAllEmployee();
	
	public List<EmployeeEntity> getListByName(String name);
	
	public EmployeeEntity updateEmployee(EmployeeEntity employee);

}
