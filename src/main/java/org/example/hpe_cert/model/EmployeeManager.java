package org.example.hpe_cert.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeManager {

    private Employees employees;

    private Employee employee;

    public EmployeeManager() {
        employees = new Employees();

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "John", "Doe", "john@example.com", "Software Engineer"));
        list.add(new Employee(2, "Jane", "Smith", "jane@example.com", "Backend Developer"));
        list.add(new Employee(3, "Mike", "Johnson", "mike@example.com", "DevOps Engineer"));


        employees.setEmployeeList(list);
    }

    public Employees getEmployees() {
        return employees;
    }
    public void addEmployee(Employee employee) {
        employees.getEmployeeList().add(employee);
    }
}
