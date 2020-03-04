package com.study.jdbc.mapper;

import com.study.jdbc.dto.Employee;

public interface EmployeeMapper {
    Employee getEmpById(int id);

    void updateSelary(Employee employee);
}
