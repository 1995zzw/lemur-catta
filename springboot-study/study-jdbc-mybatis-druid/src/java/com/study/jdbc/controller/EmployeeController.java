package com.study.jdbc.controller;

import com.study.jdbc.dto.Employee;
import com.study.jdbc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employee/{id}")
    public Employee getSalary(@PathVariable(value = "id") Integer id) {

        Employee employee =null;
        employeeService.updateSalary(employee);
        System.out.println("线程执行[" + Thread.currentThread().getId() + "]结束-----");
        return employee;
    }
}
