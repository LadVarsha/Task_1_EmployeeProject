package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.Entity.EmployeeEntity;
import com.example.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository repository;

	@Override
	public EmployeeEntity saveEmployee(EmployeeEntity employee) {

		return repository.save(employee);

	}

	@Override
	public Iterable<EmployeeEntity> getAllEmployee() {

		return repository.findAll();
	}

	@Override
	public List<EmployeeEntity> getListByName(String name) {

		List<EmployeeEntity> list = repository.findByName(name);

		return list;
	}

	@Override
	public EmployeeEntity updateEmployee(EmployeeEntity employee) {
		Integer id = employee.getId();
		EmployeeEntity emp = repository.findById(id).get();
		emp.setName(employee.getName());
		emp.setCity(employee.getCity());
		emp.setMobNo(employee.getMobNo());
		return repository.save(emp);

	}

}
