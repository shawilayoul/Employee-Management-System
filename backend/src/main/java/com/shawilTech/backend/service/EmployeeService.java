package com.shawilTech.backend.service;

import com.shawilTech.backend.model.Employee;
import com.shawilTech.backend.repostory.EmployeeRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepostory employeeRepostory;

    public List<Employee> getAllEmployee(){
        return  employeeRepostory.findAll();
    }

    public  Employee addEmployee(Employee employee){
        return  employeeRepostory.save(employee);
    }

    public Employee updateEmployee(Long id, Employee updatedemployee){

        Employee existingEmployee = employeeRepostory.findById(id)
                .orElseThrow(()->new NoSuchElementException("Employee with Id " + id + "not found"));

        existingEmployee.setName(updatedemployee.getName());
        existingEmployee.setEmail(updatedemployee.getEmail());
        existingEmployee.setJobTitle(updatedemployee.getJobTitle());
        existingEmployee.setPhone(updatedemployee.getPhone());
        existingEmployee.setImageUrl(updatedemployee.getImageUrl());
        return  employeeRepostory.save(existingEmployee);
    }

    public  void  deleteEmployee(Long id){
         employeeRepostory.deleteById(id);
    }
}
