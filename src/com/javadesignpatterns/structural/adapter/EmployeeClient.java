package com.javadesignpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        EmployeeDB employeeFromDB = new EmployeeDB("1234", "John", "Wick", "johnwick@kill.com");
        employees.add(employeeFromDB);

        // We cannot add EmployeeLdap to employees. We need to create a adapter to adapt EmployeeLdap to Employee
        EmployeeLdap employeeLdap = new EmployeeLdap("chewie", "Han", "Solo", "han@solo.com");
        employees.add(new EmployeeAdapterLdap(employeeLdap));

        EmployeeCSV employeeCSV = new EmployeeCSV("221,Sherlock,Holmes,sherlock@homles.com");
        employees.add(new EmployeeCSVAdapter(employeeCSV));

        return employees;
    }
}
