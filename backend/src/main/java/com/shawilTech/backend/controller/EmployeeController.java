package com.shawilTech.backend.controller;

import com.shawilTech.backend.model.Employee;
import com.shawilTech.backend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployee();
    }

    @PostMapping
    public  Employee addEmployee(@RequestBody Employee e){
        return  employeeService.addEmployee(e);
    }

    @PutMapping("/update/{id}")
    public  Employee updateEmployee(@PathVariable long id , @RequestBody Employee employee){
        return  employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/delete/{id}")
    public  void deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }

}
