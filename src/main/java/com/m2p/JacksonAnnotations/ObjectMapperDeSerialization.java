package com.m2p.JacksonAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.m2p.JacksonAnnotations.entity.Employee;

public class ObjectMapperDeSerialization {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String employeeJson = "{\"name\":\"Vignesh\",\"city\":\"chennai\",\"department\":\"SAAS\",\"designation\":\"SDE1\"}";
        Employee employee = objectMapper.readValue(employeeJson, Employee.class);
        // Run in Debug Mode to check the employee object
        System.out.println(employee.getName());
    }
}
