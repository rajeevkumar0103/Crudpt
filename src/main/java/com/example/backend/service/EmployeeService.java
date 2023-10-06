package com.example.backend.service;

import com.example.backend.entity.Employee;
import com.example.backend.reprository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee saveProduct(Employee employee) {
        return repository.save(employee);
    }

//    public List<Employee> saveProducts(List<Employee> employees) {
//        return repository.saveAll(employees);
//    }
//
    public List<Employee> getProducts() {
        return repository.findAll();
    }
//
//
//    public Employee getProductById(int id) {
//        return repository.findById(id).orElse(null);
//    }
//
//    public Employee getProductByName(String name) {
//        return repository.findByName(name);
//    }
//
    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "Employee removed !! " + id;
    }
//
    public Employee updatePEmployee(Employee employee, int id) {
        Employee existingProduct = repository.findById(id).orElse(null);
        existingProduct.setFirstName(employee.getFirstName());
        existingProduct.setLastName(employee.getLastName());
        existingProduct.setCompany(employee.getCompany());
        existingProduct.setDob(employee.getDob());
        existingProduct.setEmail(employee.getEmail());
        existingProduct.setEducation(employee.getEducation());
        existingProduct.setEmppackage(employee.getEmppackage());
        existingProduct.setExperience(employee.getExperience());
        existingProduct.setGender(employee.getGender());
        return repository.save(existingProduct);
    }

}
