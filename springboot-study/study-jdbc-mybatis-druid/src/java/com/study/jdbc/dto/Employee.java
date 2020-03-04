package com.study.jdbc.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@ToString
@Getter
@Setter
public class Employee {
    private int id;
    private String name;
    private BigDecimal salary;
}
