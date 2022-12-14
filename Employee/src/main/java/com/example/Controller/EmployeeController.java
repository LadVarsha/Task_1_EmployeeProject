package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.EmployeeEntity;
import com.example.Service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;

	@PostMapping("/employee/save")
	public ResponseEntity<EmployeeEntity> saveEmployeeData(@RequestBody EmployeeEntity employee) {

		EmployeeEntity emp = service.saveEmployee(employee);

		return ResponseEntity.ok().body(emp);
	}

	@GetMapping("/employee/getAllEmployee")
	public Iterable<EmployeeEntity> getAllEmployeeData() {
		return service.getAllEmployee();

	}

	@GetMapping("/employee/{name}")
	public ResponseEntity<List<EmployeeEntity>> getListByEmpName(@PathVariable("name") String name) {

		List<EmployeeEntity> list = service.getListByName(name);
		return ResponseEntity.ok().body(list);

	}
     @PutMapping("/employee/updateEmployee")
	public EmployeeEntity updateStudentData(@RequestBody EmployeeEntity employee) {
		return service.updateEmployee(employee);

	}

}
