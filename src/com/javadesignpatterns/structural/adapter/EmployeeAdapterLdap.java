package com.javadesignpatterns.structural.adapter;

/**
 * Adapter for EmployeeLdap. Because of this EmployeeLdap does not need to implement Employee and also doest not need to know the
 * details to convert EmployeeLdap to Employee
 */
public class EmployeeAdapterLdap implements Employee {

    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

}
