package com.m2p.JacksonAnnotations;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.m2p.JacksonAnnotations.entity.Employee;

import java.io.File;
import java.io.IOException;

public class ObjectMapperSerialization {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Employee employee = new Employee("Vignesh","chennai","SAAS","SDE1");
        objectMapper.writeValue(new File("target/emp.json"),employee);
    }
}

