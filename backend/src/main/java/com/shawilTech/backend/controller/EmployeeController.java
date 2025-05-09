package com.shawilTech.backend.controller;

import com.shawilTech.backend.model.Employee;
import com.shawilTech.backend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employee")
@CrossOrigin("*")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/all")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployee();
    }

    @PostMapping("/add")
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
