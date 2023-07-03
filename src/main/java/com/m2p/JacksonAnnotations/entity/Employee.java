package com.m2p.JacksonAnnotations.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class Employee{
    private String name;
    private String city;
    private String department;
    private String designation;

    public Employee(){
        super();
    }

    public Employee(String name, String city, String department, String designation) {
        this.name = name;
        this.city = city;
        this.department = department;
        this.designation = designation;
    }
}
