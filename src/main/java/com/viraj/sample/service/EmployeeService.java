package com.viraj.sample.service;

import com.viraj.sample.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployee(Long employeeId);
    void deleteEmployee(Long employeeId);
    Employee getEmployeeByName(String name);
    Employee getEmployeeByName3(String name);
    Employee getEmployeeByName4(String name);
    Employee getEmployeeByName5(String name);

}
