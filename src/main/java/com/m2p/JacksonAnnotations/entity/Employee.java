package com.m2p.JacksonAnnotations.entity;

import lombok.Data;

@Data
public class Employee {
    private String name;
    private String city;
    private String department;
    private String designation;

    public Employee(String name, String city, String department, String designation) {
        this.name = name;
        this.city = city;
        this.department = department;
        this.designation = designation;
    }
}
