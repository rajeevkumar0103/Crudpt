package com.example.backend.controller;

import com.example.backend.entity.Employee;
import com.example.backend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/addEmployee")
    public Employee createEmployee(@RequestBody Employee employee){
        System.out.println(employee.getFirstName());
        System.out.println(employee.getDob());
        return employeeService.saveProduct(employee);
    }

    @GetMapping("/viewEmployee")
    public List<Employee> getAllEmployee(){
        return employeeService.getProducts();
    }

    @DeleteMapping("/delEmployee/{id}")
    public String delEmployee(@PathVariable int id){
        return employeeService.deleteProduct(id);
    }

    @PutMapping("/update/{id}")
    public Employee updateProduct(@RequestBody Employee employee, @PathVariable int id) {
        return employeeService.updatePEmployee(employee, id);
    }


}
