package com.javadesignpatterns.structural.adapter;

import java.util.List;

/**
 * Created by VIRAL on 10/17/2015.
 */
public class AdapterDemo {
    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeeList();
        System.out.println(employees);
    }
}
