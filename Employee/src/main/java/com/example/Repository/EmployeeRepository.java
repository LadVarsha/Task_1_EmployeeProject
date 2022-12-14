package com.example.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Serializable > {
	
	@Query(value = "select * from employee where name = ? " , nativeQuery = true)
	public List<EmployeeEntity> findByName(String name);
	
	

}
