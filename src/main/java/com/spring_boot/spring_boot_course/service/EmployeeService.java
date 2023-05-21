package com.spring_boot.spring_boot_course.service;

import com.spring_boot.spring_boot_course.Entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeService{ //extends CrudRepository<Employee, Integer> {
  public  List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);

}
