package com.study.jdbc.service;

import com.study.jdbc.dto.Employee;
import com.study.jdbc.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private EmployeeService employeeService;

    public Employee getEmpBiId(int id) {
        return employeeMapper.getEmpById(id);
    }

    @Transactional(rollbackFor = Exception.class)
    public void updateSalary(Employee employee) {
        employee = employeeService.getEmpBiId(3);
        System.out.println("线程[" + Thread.currentThread().getId() + "]开始执行-----");
        System.out.println("线程[" + Thread.currentThread().getId() + "]获取ID为" + 3 + "员工的数据");
        System.out.println(employee);
        employee.setSalary(employee.getSalary().subtract(new BigDecimal(100)));
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程[" + Thread.currentThread().getId() + "]将员工id为" + employee.getId() + "的工资减去100");
        employeeMapper.updateSelary(employee);
    }
}
