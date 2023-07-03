package com.m2p.JacksonAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.m2p.JacksonAnnotations.entity.Employee;
import org.apache.catalina.webresources.StandardRoot;

import java.io.File;
import java.io.IOException;

public class ObjectMapperDeSerialization {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String employeeJson = "{\"name\":\"Vignesh\",\"city\":\"chennai\",\"department\":\"SAAS\",\"designation\":\"SDE1\"}";
        Employee employee = objectMapper.readValue(employeeJson, Employee.class);
        // Run in Debug Mode to check the employee object
        System.out.println(employee.getName());

        //To read a particular value in JSON String without converting it to Java Objects
        JsonNode jsonNode = objectMapper.readTree(employeeJson);

        String empName = jsonNode.get("name").asText();
        String empCity = jsonNode.get("city").asText();
        String empDept = jsonNode.get("department").asText();
        String empDesignation = jsonNode.get("designation").asText();

        objectMapper.writeValue(new File("target/employeeNode.txt"),empName + "," + empCity + "," +  empDept + "," + empDesignation);
    }
}
