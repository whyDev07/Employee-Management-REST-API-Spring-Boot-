package org.example.hpe_cert.controllers;
import org.example.hpe_cert.model.Employee;
import org.example.hpe_cert.model.EmployeeManager;
import org.example.hpe_cert.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeManager employeeManager;

    @GetMapping("/employees")
    public Employees getEmployees() {
        return employeeManager.getEmployees();
    }

    @PostMapping("/employees")
    public String addEmployee(@RequestBody Employee employee) {
        employeeManager.addEmployee(employee);
        return "Employee added successfully";
    }
}
