package com.viraj.sample.repository;

import com.viraj.sample.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends   CrudRepository <Employee,Long>{

    Optional<Employee> findById(Long aLong);


    Optional<Employee> findByEmployeeName(String name);
}
